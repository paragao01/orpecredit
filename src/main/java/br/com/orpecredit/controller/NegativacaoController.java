package br.com.orpecredit.controller;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.orpecredit.service.ConsultaService;
import br.com.orpecredit.util.Formatador;
import br.com.orpecredit.util.exception.BusinessException;
import br.com.orpecredit.wscdlrio.negativacao.Baixar;
import br.com.orpecredit.wscdlrio.negativacao.Incluir;
import br.com.orpecredit.wscdlrio.negativacao.Listar;
import br.com.orpecredit.wscdlrio.negativacao.Listar.ListaDocumentos;

@Controller
@Scope("session")
public class NegativacaoController implements Serializable {

	private static final long serialVersionUID = -4231945509072165867L;

	@Autowired
	@Qualifier("consultaService")
	private ConsultaService consultaService;

	private Incluir inc;
	private Baixar bai;
	private Listar lis;
	private ListaDocumentos listaDoc;
	private String pessoa = "J";
	private String cpf;
	private String cnpj;
	private String nome;
	private String razao;
	private Date   dtNasc;
	private String tipoDev;
	private String tipoDoc;
	private String contrato;
	private String natOper;
	private Date   dtAtraso;
	private Date   dtTermino;
	private String logradouro;
	private String bairro;
	private String municipio;
	private String estado;
	private String cep;
	private String valorParcela;
	private int qtdeParcela;
	//Listar
	private Date dataInicial;
	private Date dataFinal;
	private String status;
	//Baixar
	public String pessoaListar = "T";
	public String motivo;
	public String documento;
	public int idNegativacao;
	
	public String packagePage;
	public String page;
	public Integer widthPopupCrud;
	public Integer heightPopupCrud;
	public Boolean appendToBody = false;

	public void negativacao(String acao) throws BusinessException, ParseException {
		if (acao.equals("I")) {
			inc = new Incluir();
			inc.setTipoPessoa(pessoa);
			if(pessoa.equals("F")) {
				inc.setDocumento(cpf);
				//inc.getDadosDevedor().setDataNascimento(Formatador.formatarData(dtNasc).replace("/", ""));	
				inc.getDadosDevedor().setDataNascimento("11111990");
				inc.getDadosDevedor().setNome(nome);
				inc.getDadosDevedor().setTipoDevedor("C");
			}else{
				inc.setDocumento(cnpj);
				inc.getDadosDevedor().setNome(razao);
				inc.getDadosDocumento().setTipo("CNPJ");
				inc.getDadosDevedor().setDataNascimento(null);
				inc.getDadosDevedor().setTipoDevedor("C");				
			}
			inc.getDadosContrato().setContrato(contrato);
			inc.getDadosContrato().setNaturezaOperacao(natOper);
			inc.getDadosContrato().setDataAtTraso(Formatador.formatarData(dtAtraso).replace("/", ""));
			inc.getDadosContrato().setDataTermino(Formatador.formatarData(dtTermino).replace("/", ""));
			inc.getDadosContrato().setValorParcela(valorParcela);
			inc.getDadosContrato().setQuantidade(Integer.toString(qtdeParcela));
			inc.getDadosContrato().setMoeda("J");
			inc.getDadosEndereco().setLogradouro(logradouro);			
			inc.getDadosEndereco().setBairro(bairro);
			inc.getDadosEndereco().setMunicipio(municipio);
			inc.getDadosEndereco().setEstado(estado);
			inc.getDadosEndereco().setCep(cep.replace("-", ""));
			
			inc = consultaService.negativacaoIncluir(inc);
			if (inc == null) {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Problemas de conexão com fornecedor 1", null));
			} else {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_ERROR, inc.getMensagemRetorno(), null));
			}
		} else if (acao.equals("B")) {
			bai = new Baixar();
			if(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("tipo").equals("CPF")) {
				bai.setTipoPessoa("F");
			}else {
				bai.setTipoPessoa("J");
			}
			bai.setDocumento(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("doc"));			
			bai.getDadosBaixa().setMotivo(motivo);
			bai.getDadosBaixa().setContrato(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("contr"));
			bai.getDadosBaixa().setDataAtraso(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("dtAtr"));
			bai.setIdNegativacao(Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("idneg")));
			
			bai = consultaService.negativacaoBaixar(bai);
			if (bai == null) {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Problemas de conexão com fornecedor 1", null));
			} else {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_ERROR, bai.getMensagemRetorno(), null));
			}
		} else if (acao.equals("L")) {			
			lis = new Listar();
			lis.setTipoPessoa(pessoaListar);
			if(pessoaListar.equals("F")) {
				lis.setDocumento(cpf);
			} else if(pessoaListar.equals("J")) {
				lis.setDocumento(cnpj);
			} else {
				lis.setDocumento("");
			}
			lis.setStatus(status);
			if(dataInicial != null) {
				lis.setDataInicio(Formatador.formatarData(dataInicial).replace("/", ""));
			}else{
				lis.setDataInicio("");
			}
			if(dataFinal != null) {
				lis.setDataFim(Formatador.formatarData(dataFinal).replace("/", ""));
			}else{
				lis.setDataFim("");
			}
			lis = consultaService.negativacaoListar(lis);
			if (lis == null) {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Problemas de conexão com fornecedor 1", null));
			} else {
				if(lis.getCodigoRetorno().equals("0")) {
					FacesContext.getCurrentInstance().addMessage(null,
							new FacesMessage(FacesMessage.SEVERITY_ERROR, lis.getMensagemRetorno(), null));
				}
			}
		}
	}

	public void resetTela() {
		pessoa = "J";
		pessoaListar = "T";
		cpf = "";
		cnpj = "";
		razao = "";
		nome = "";
		dtNasc = null;
		tipoDev = "";
		tipoDoc = "";
		contrato = "";
		natOper = "";
		dtAtraso = null;
		dtTermino = null;
		logradouro = "";
		bairro = "";
		municipio = "";
		estado = "";
		cep = "";
		valorParcela = "";
		qtdeParcela = 0;
		dataInicial = null;
		dataFinal = null;
		status = "";

		inc = new Incluir();
		bai = new Baixar();
		lis = new Listar();
	}

	protected void closePopup() {
		RequestContext.getCurrentInstance().closeDialog("/" + packagePage + "/" + page);
	}

	public String voltar() {
		resetTela();
		return "/index.jsf?faces-redirect=true";
	}

	public Double strDouble(String str) {
		if(str.length()>0) {
			return Double.parseDouble(str.replace(",", "."));
		}else {
			return null;
		}
	}

	public String formataDevedor(String dev) {
		if(dev.equals("C")) {
			dev = "Comprador";
		}else if(dev.equals("F")) {
			dev = "Fiador";
		}else if(dev.equals("E")) {
			dev = "Nome Errado";
		}
		return dev;
	}

	public String formataStatus(String data) {
		String sta = "";
		if(data.equals("null")) {
			sta = "Em Aberto";
		}else{
			sta = "Baixado";
		}
		return sta;
	}
	
	public String formataTipoDoc(String tipo) {
		if(tipo.equals("IDT")) {
			tipo = "Carteira de Identidade";
		} else if(tipo.equals("CM")) {
			tipo = "Carteira de Motorista";
		} else if(tipo.equals("CP")) {
			tipo = "Carteira de Trabalho";
		} else if(tipo.equals("CR")) {
			tipo = "Carteira de Reservista";
		} else if(tipo.equals("PP")) {
			tipo = "PIS/PASEP";
		} else if(tipo.equals("TE")) {
			tipo = "Título Eleitoral";
		} else if(tipo.equals("CNPJ")) {
			tipo = "Para Pessoa Jurídica";
		} else if(tipo.equals("OU")) {
			tipo = "Outro Documento";
		} 
		return tipo;
	}
	
	public String formataNatureza(String natu) {
		if (natu.equals("01")) {
			natu = "Crédito direto ao consumidor";
		} else if (natu.equals("02")) {
			natu = "Cheque cobrança devolvido";
		} else if (natu.equals("03")) {
			natu = "Locadora";
		} else if (natu.equals("04")) {
			natu = "Consórcio";
		} else if (natu.equals("05")) {
			natu = "Imobiliária administração de bens";
		} else if (natu.equals("06")) {
			natu = "Crédito imobiliário";
		} else if (natu.equals("07")) {
			natu = "Outras atividades econômicas";
		} else if (natu.equals("08")) {
			natu = "Não grava consulta";
		} else if (natu.equals("09")) {
			natu = "Crédito de veículo";
		} else if (natu.equals("10")) {
			natu = "Crédito pessoal";
		} else if (natu.equals("11")) {
			natu = "Título protestado";
		} else if (natu.equals("13")) {
			natu = "Outros";
		} else if (natu.equals("14")) {
			natu = "Cartão de crédito";
		} else if (natu.equals("20")) {
			natu = "Saneamento básico";
		} else if (natu.equals("99")) {
			natu = "Outros créditos";
		}
		return natu;
	}
	public String formataEstado(String est) {
		if (est.equals("AC")) {
			est = "Acre";
		} else if (est.equals("AL")) {
			est = "Alagoas";
		} else if (est.equals("AM")) {
			est = "Amazonas";
		} else if (est.equals("AP")) {
			est = "Amapá";
		} else if (est.equals("BA")) {
			est = "Bahia";
		} else if (est.equals("CE")) {
			est = "Ceará";
		} else if (est.equals("DF")) {
			est = "Distrito Federal";
		} else if (est.equals("ES")) {
			est = "Espirito Santo";
		} else if (est.equals("GO")) {
			est = "Goias";
		} else if (est.equals("MA")) {
			est = "Maranhão";
		} else if (est.equals("MG")) {
			est = "Minas Gerais";
		} else if (est.equals("MS")) {
			est = "Mato Grosso Sul";
		} else if (est.equals("MT")) {
			est = "Mato Grosso";
		} else if (est.equals("PA")) {
			est = "Pará";
		} else if (est.equals("PB")) {
			est = "Paraiba";
		} else if (est.equals("PE")) {
			est = "Pernambuco";
		} else if (est.equals("PI")) {
			est = "Piaui";
		} else if (est.equals("PR")) {
			est = "Parana";
		} else if (est.equals("RJ")) {
			est = "Rio de Janeiro";
		} else if (est.equals("RN")) {
			est = "Rio Grande do Norte";
		} else if (est.equals("RO")) {
			est = "Rondônia";
		} else if (est.equals("RR")) {
			est = "Roraima";
		} else if (est.equals("RS")) {
			est = "Rio Grande do Sul";
		} else if (est.equals("SC")) {
			est = "Santa Catarina";
		} else if (est.equals("SE")) {
			est = "Sergipe";
		} else if (est.equals("SP")) {
			est = "São Paulo";
		} else if (est.equals("TO")) {
			est = "Tocantins";
		}
		return est;
	}
	
	public String formataCPF(String doc) {
		String cpf = "";
		if(doc.length()>11) {
			doc = doc.substring(3, 14);
		}
		if(!doc.equals("")) {
			cpf = Formatador.formataCPF(doc);
		}
		return cpf;
	}
		
	public String formataCNPJ(String doc) {
		String cnpj = "";
		if(!doc.equals("")) {
			cnpj = Formatador.formataCNPJ(doc);
		}
		return cnpj;		
	}
	
	public ConsultaService getConsultaService() {
		return consultaService;
	}

	public void setConsultaService(ConsultaService consultaService) {
		this.consultaService = consultaService;
	}

	public Incluir getInc() {
		return inc;
	}

	public void setInc(Incluir inc) {
		this.inc = inc;
	}

	public Baixar getBai() {
		return bai;
	}

	public void setBai(Baixar bai) {
		this.bai = bai;
	}

	public Listar getLis() {
		return lis;
	}

	public void setLis(Listar lis) {
		this.lis = lis;
	}

	public ListaDocumentos getListaDoc() {
		return listaDoc;
	}

	public void setListaDoc(ListaDocumentos listaDoc) {
		this.listaDoc = listaDoc;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getTipoDev() {
		return tipoDev;
	}

	public void setTipoDev(String tipoDev) {
		this.tipoDev = tipoDev;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getNatOper() {
		return natOper;
	}

	public void setNatOper(String natOper) {
		this.natOper = natOper;
	}

	public Date getDtAtraso() {
		return dtAtraso;
	}

	public void setDtAtraso(Date dtAtraso) {
		this.dtAtraso = dtAtraso;
	}

	public Date getDtTermino() {
		return dtTermino;
	}

	public void setDtTermino(Date dtTermino) {
		this.dtTermino = dtTermino;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(String valorParcela) {
		this.valorParcela = valorParcela;
	}

	public int getQtdeParcela() {
		return qtdeParcela;
	}

	public void setQtdeParcela(int qtdeParcela) {
		this.qtdeParcela = qtdeParcela;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public int getIdNegativacao() {
		return idNegativacao;
	}

	public void setIdNegativacao(int idNegativacao) {
		this.idNegativacao = idNegativacao;
	}

	public String getPessoaListar() {
		return pessoaListar;
	}

	public void setPessoaListar(String pessoaListar) {
		this.pessoaListar = pessoaListar;
	}

	public String getPackagePage() {
		return packagePage;
	}

	public void setPackagePage(String packagePage) {
		this.packagePage = packagePage;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Integer getWidthPopupCrud() {
		return widthPopupCrud;
	}

	public void setWidthPopupCrud(Integer widthPopupCrud) {
		this.widthPopupCrud = widthPopupCrud;
	}

	public Integer getHeightPopupCrud() {
		return heightPopupCrud;
	}

	public void setHeightPopupCrud(Integer heightPopupCrud) {
		this.heightPopupCrud = heightPopupCrud;
	}

	public Boolean getAppendToBody() {
		return appendToBody;
	}

	public void setAppendToBody(Boolean appendToBody) {
		this.appendToBody = appendToBody;
	}

}
