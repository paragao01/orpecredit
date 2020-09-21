package br.com.orpecredit.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;

import br.com.orpecredit.entity.ProdutoDefine;
import br.com.orpecredit.service.ConsultaService;
import br.com.orpecredit.util.DateUtil;
import br.com.orpecredit.util.Formatador;
import br.com.orpecredit.util.exception.BusinessException;
import br.com.orpecredit.wscdlrio.define.SPCAXML.RESPOSTA.DEFINERESPOSTA.DEFADMINISTRADORES.DEFADMINISTRADOR;
import br.com.orpecredit.wscdlrio.define.SPCAXML.RESPOSTA.DEFINERESPOSTA.DEFSOCIOS.DEFSOCIO;
import br.com.orpecredit.wscdlrio.define.SPCAXML.RESPOSTA.DEFINERESPOSTA.DEFPARTICIPACOESEMPRESASCONSULTADAS.DEFPARTICIPACAOEMPRESACONSULTADA;
import br.com.orpecredit.wscdlrio.define.SPCAXML.RESPOSTA.DEFINERESPOSTA.DEFPARTICIPACOESSOCIOSADMOUTRASEMPRESAS.DEFSOCIO.DEFSOCIOSPARTICIPANTES;
import br.com.orpecredit.wscrediOnline.CrediOnLineChequeCPF;
import br.com.orpecredit.wscrediOnline.CrediOnLineRelatorioCNPJ;
import br.com.orpecredit.wscrediOnline.CrediOnLineRelatorioCPF;
import br.com.orpecredit.wscrediOnline.CrediOnLineRestritivoCNPJ;
import br.com.orpecredit.wscrediOnline.CrediOnLineRestritivoCPF;

@Controller
@Scope("session")
public class ConsultaController implements Serializable {

	private static final long serialVersionUID = 3976008929036020063L;
	
	@Autowired
	@Qualifier("consultaService")
	private ConsultaService consultaService;
	
	private br.com.orpecredit.wscdlrio.acerta.SPCAXML acerta;
	private br.com.orpecredit.wscdlrio.define.SPCAXML define;		
	private br.com.orpecredit.wscdlrio.scpcnet.SPCAXML scpcnet;
	private CrediOnLineRelatorioCPF relcpf;
	private CrediOnLineRestritivoCPF rescpf;
	private CrediOnLineChequeCPF checpf;
	private CrediOnLineRelatorioCNPJ relcnpj;
	private CrediOnLineRestritivoCNPJ rescnpj;
	private ProdutoDefine pd;
	private String cpf;
	private String cnpj;
	private String estado;
	private String nomeEstado;	
	private String estadoTela;		
	private String horaAtual;
	private String dataAtual;
	private String cmc7;
	private String banco;
	private String agencia;
	private String numConta;
	private String digConta;
	private String numCheque;
	private String digCheque;
	private String qtdeCheque;
	private String entradaCheque;	
	private Date dataCheque;
	private boolean valor0;
	private boolean valor1;
	private boolean valor2;
	private boolean valor3;
	private boolean valor4;
	private boolean valor5;
	private boolean valor6;
	private boolean valor7;
	private boolean valor8;
	private boolean valor9;
	private boolean valorTela0;
	private boolean valorTela1;
	private boolean valorTela2;
	private boolean valorTela3;
	private boolean valorTela4;
	private boolean valorTela5;
	private boolean valorTela6;
	private boolean valorTela7;
	private boolean valorTela8;
	private boolean valorTela9;
	
	private boolean chequeOpcao;
	private boolean chequeSup;
	private boolean chequeInf;
	
	public String packagePage;
	public String page;
	public Integer widthPopupCrud;
	public Integer heightPopupCrud;
	public Boolean appendToBody = false;
	public List<ConsultaResposta> listaConsultaMes;
	public DEFSOCIO defSocio;
	public DEFADMINISTRADOR defAdmin;
	public DEFPARTICIPACAOEMPRESACONSULTADA defParEmp;
	public DEFSOCIOSPARTICIPANTES defSocioAdmin;
	public String[] dataComportamento;
	public Integer[] qtdeComportamento;
	public Double[] valorComportamento;
	
	public void consultaCPF(String con) throws BusinessException {
		if(con.equals("[48]")) {
			packagePage = "pessoalGold";
			page = "resposta";
			widthPopupCrud = 1070;
			heightPopupCrud = 490;

			acerta = consultaService.acertaEssencial(cpf);
			if(acerta == null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 1", null));
			}else {
				if(Integer.valueOf(acerta.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA())==0) {
					this.openPopup();
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							acerta.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
				}
			}
			//System.out.println("*********** Conteudo : "+acerta.getRESPOSTA().getREGISTROACSPSPCA().getSPCA242CCF().getSPCA242DEVOLUCOES().get(0).getSPCA242BANCO());
		}else if(con.equals("[73]")) {
				packagePage = "pessoalPlus";
				page = "resposta";
				widthPopupCrud = 1070;
				heightPopupCrud = 490;

				acerta = consultaService.acerta(cpf, estado);
				if(acerta == null) {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Problemas de conexão com fornecedor 1", null));
				}else {
					if(Integer.valueOf(acerta.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA())==0) {
						this.openPopup();
					}else {
						FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
								acerta.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
					}
				}
				//System.out.println("*********** Conteudo : "+acerta.getSOLICITACAO().getSTPUF());			
		}else if(con.equals("[53]")) {
			packagePage = "buscaEndTelefoneCpf";
			page = "resposta";			
			widthPopupCrud = 1070;
			heightPopupCrud = 490;

			acerta = consultaService.acertaCadastral(cpf);
			if(acerta == null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 1", null));
			}else {
				if(Integer.valueOf(acerta.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA())==0) {
					this.openPopup();
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							acerta.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
				}
			}
			//System.out.println("*********** Conteudo : "+acerta.getRESPOSTA().getREGISTROACSPSPCA().getSPCA211SUSTADO());			
		}else if(con.equals("[24]")) {
			packagePage = "scpcnetNacCPF";
			page = "resposta";			
			widthPopupCrud = 1070;
			heightPopupCrud = 490;

			scpcnet = consultaService.spcnetNacionalCPF(cpf);
			if(scpcnet == null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 1", null));
			}else {
				if(scpcnet.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA()==0) {
					this.openPopup();
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							scpcnet.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
				}
			}
			//System.out.println("*******CONTEUDO : "+scpcnet.getRESPOSTA().getREGISTROACSPNET().getNET127CONSULTAANT().get(0).getNET127TELEFONE().getNET127DDD());
		}else if(con.equals("[1]")) {
			packagePage = "scpcnetEstCPF";
			page = "resposta";			
			widthPopupCrud = 1070;
			heightPopupCrud = 490;

			scpcnet = consultaService.spcnetRegionalCPF(cpf, estado);
			if(scpcnet == null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 1", null));
			}else {
				if(scpcnet.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA()==0) {
					estadoTela = estado;
					this.openPopup();
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							scpcnet.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
				}
			}			
			//System.out.println("***** Conteudo : "+scpcnet.getRESPOSTA().getREGISTROACSPNET().getNET124REGISTROSCPC().get(0).getNET124TIPO());
		}else if(con.equals("[60]")) {
			packagePage = "crediOnlineCPF";
			page = "resposta";			
			widthPopupCrud = 1100;
			heightPopupCrud = 490;			
			
			String retorno = "";

			retorno = consultaService.crediOnlineCPF(cpf);
			//retorno = "{\"cpf\":12345678901,\"protestos\":{\"status\":true,\"consta\":true,\"resumo\":{\"produto\":\"PROTESTOS\",\"quantidade\":2,\"valor_total\":3000.70,\"data_ultimo\":\"2017-12-31\"},\"registros\":[{\"data\":\"2017-12-31\",\"valor\":1380.35,\"cartorio\":\"0001\",\"cidade\":\"CIDADE\",\"uf\":\"UF\"},{\"data\":\"2010-07-01\",\"valor\":1620.35,\"cartorio\":\"0002\",\"cidade\":\"CIDADE\",\"uf\":\"UF\"}],\"comportamento\":[{\"data\":\"2018-01\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-12\",\"qtd\":1,\"valor\":1380.35},{\"data\":\"2017-11\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-10\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-09\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-08\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-07\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-06\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-05\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-04\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-03\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-02\",\"qtd\":0,\"valor\":0}]},\"titulos\":{\"status\":true,\"consta\":true,\"resumo\":{\"produto\":\"TITULOS_VENCIDOS\",\"quantidade\":2,\"valor_total\":55000.2,\"data_ultimo\":\"2017-11-30\"},\"registros\":[{\"data\":\"2017-11-30\",\"valor\":33000.10,\"informante\":\"INFORMANTE\",\"cidade\":\"CIDADE\",\"uf\":\"UF\",\"contrato\":\"000000001234567891011\",\"data_validade\":\"10/25/201212:00:00AM\",\"entidade_origem\":\"ENTIDADEORIGEM\"},{\"data\":\"2010-10-31\",\"valor\":22000.10,\"informante\":\"INFORMANTE\",\"cidade\":\"CIDADE\",\"uf\":\"UF\",\"contrato\":\"000000001234567891011\",\"data_validade\":\"10/1/201212:00:00AM\",\"entidade_origem\":\"ENTIDADEORIGEM\"}],\"comportamento\":[{\"data\":\"2018-01\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-12\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-11\",\"qtd\":1,\"valor\":33000.10},{\"data\":\"2017-10\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-09\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-08\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-07\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-06\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-05\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-04\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-03\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-02\",\"qtd\":0,\"valor\":0}]}}<>{\"provider_acesso_id\":72220,\"status\":200,\"cpf\":12187080692,\"nome\":\"ANA CLAUDIA SILVA\",\"dt_nascimento\":\"1993-04-25\",\"nome_mae\":[\"ANA LUCIA NOBREGA DOS SANTOS\"],\"emails\":[{\"email\":\"ana_silva481@hotmail.com\",\"passagens\":\"5\"}],\"telefones\":[{\"ddd\":\"31\",\"tel\":\"997447901\",\"passagens\":\"2\"},{\"ddd\":\"31\",\"tel\":\"32412055\",\"passagens\":\"1\"}],\"enderecos\":[{\"logradouro\":\"AV AFONSO PENA\",\"numero\":\"1500\",\"compl\":null,\"bairro\":\"BOA VIAGEM\",\"cidade\":\"BELO HORIZONTE\",\"estado\":\"MG\",\"cep\":\"30130005\",\"passagens\":\"4\"},{\"logradouro\":\"AV BERNARDINO DA SILVA COUTO\",\"numero\":\"1700\",\"compl\":null,\"bairro\":\"CENTRO\",\"cidade\":\"IGARAPE\",\"estado\":\"MG\",\"cep\":\"32900000\",\"passagens\":\"1\"}],\"participacoes\":[]}<>{\"cpf\":12345678901,\"cheques\":{\"status\": 200,\"cheques_pf\":[{\"num_cheques\":10,\"data_ultimo_cheque\":\"20101231\",\"doc\":12345678901,\"tipo_doc\":\"CPF\",\"banco\":123,\"agencia\":1234,\"nome\":\"NOME PESSOA FÍSICA\"}],\"cheques_participacoes\":[{\"num_cheques\": 2,\"data_ultimo_cheque\":\"20111231\",\"doc\":12345678000123,\"tipo_doc\":\"CNPJ\",\"banco\":123,\"agencia\":1234,\"nome\":\"NOME PESSOA JURÍDICA LTDA ME\"}]}}";
			if(retorno.length()==0) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 2", null));
			}else {
				if(retorno.indexOf("\"msg\":") > 0) {
					int posIni = retorno.indexOf("{\"msg\":\"")+"{\"msg\":\"".length();
					int posFin = retorno.indexOf("\",\"status\":");
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							retorno.substring(posIni, posFin), null));
				}else{
					String array[] = new String[3];
					array = retorno.split("<>");
					
					Gson gson = new Gson();
					rescpf = gson.fromJson(array[0], br.com.orpecredit.wscrediOnline.CrediOnLineRestritivoCPF.class);
					relcpf = gson.fromJson(array[1], br.com.orpecredit.wscrediOnline.CrediOnLineRelatorioCPF.class);
					checpf = gson.fromJson(array[2], br.com.orpecredit.wscrediOnline.CrediOnLineChequeCPF.class);
					this.openPopup();
				}			
			}
			
			//System.out.println("***** : "+checpf.getCheques().getChequesPf().get(0).getDoc());
		}
		resetTela();
	}
	
	public void consultaCNPJ(String con) throws BusinessException {			
		if(con.equals("[47]")) {
			packagePage = "scpcnetNacCNPJ";
			page = "resposta";			
			widthPopupCrud = 1070;
			heightPopupCrud = 490;

			scpcnet = consultaService.spcnetNacionalCNPJ(cnpj);
			if(scpcnet == null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 1", null));
			}else {
				if(scpcnet.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA()==0) {
					this.openPopup();
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							scpcnet.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
				}
			}
			//System.out.println("*******CONTEUDO : "+scpcnet.getRESPOSTA().getREGISTROACSPNET().getNET304CONSANT().get(0).getNET304PARADOC().getNET304DTCONS());			
		}else if(con.equals("[40]")) {
			packagePage = "scpcnetEstCNPJ";
			page = "resposta";			
			widthPopupCrud = 1070;
			heightPopupCrud = 490;

			scpcnet = consultaService.spcnetRegionalCNPJ(cnpj, estado);
			if(scpcnet == null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 1", null));
			}else {
				if(scpcnet.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA()==0) {
					estadoTela = estado;					
					this.openPopup();
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							scpcnet.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
				}
			}			
			//System.out.println("************ Estado : "+estado);
		}else if(con.equals("[55]")) {
			packagePage = "crediOnlineCNPJ";
			page = "resposta";			
			widthPopupCrud = 1070;
			heightPopupCrud = 490;
			String retorno = "";

			retorno = consultaService.crediOnlineCNPJ(cnpj);
			//retorno = "{\"cnpj\":15121491000104,\"razao_social\":\"CLICK  RODO ENTREGAS LTDA\",\"protestos\":{\"status\":true,\"consta\":false,\"resumo\":{},\"registros\":[],\"comportamento\":[]},\"titulos\":{\"status\":true,\"consta\":true,\"resumo\":{\"produto\":\"TITULOS_VENCIDOS\",\"quantidade\":2,\"valor_total\":1973.41,\"data_ultimo\":\"2018-01-12\"},\"registros\":[{\"data\":\"2018-01-12\",\"valor\":720.51,\"informante\":\"CARPAU TRANSPORTE LTDA EPP\",\"cidade\":\"RIO DE JANEIRO\",\"uf\":\"RJ\",\"contrato\":\"0000\",\"data_validade\":\"2014-01-06\",\"entidade_origem\":\"SERASA EXPERIAN\"},{\"data\":\"2018-01-12\",\"valor\":1252.9,\"informante\":\"CARPAU TRANSPORTE LTDA EPP\",\"cidade\":\"RIO DE JANEIRO\",\"uf\":\"RJ\",\"contrato\":\"00\",\"data_validade\":\"2014-01-06\",\"entidade_origem\":\"SERASA EXPERIAN\"}],\"comportamento\":[{\"data\":\"2018-10\",\"qtd\":0,\"valor\":0},{\"data\":\"2018-09\",\"qtd\":0,\"valor\":0},{\"data\":\"2018-08\",\"qtd\":0,\"valor\":0},{\"data\":\"2018-07\",\"qtd\":0,\"valor\":0},{\"data\":\"2018-06\",\"qtd\":0,\"valor\":0},{\"data\":\"2018-05\",\"qtd\":0,\"valor\":0},{\"data\":\"2018-04\",\"qtd\":0,\"valor\":0},{\"data\":\"2018-03\",\"qtd\":0,\"valor\":0},{\"data\":\"2018-02\",\"qtd\":0,\"valor\":0},{\"data\":\"2018-01\",\"qtd\":2,\"valor\":1973.41},{\"data\":\"2017-12\",\"qtd\":0,\"valor\":0},{\"data\":\"2017-11\",\"qtd\":0,\"valor\":0}]}}<>{\"cnpj\":15121491000104,\"tipo_estab\":\"MATRIZ\",\"data_abertura\":\"14/02/2012\",\"razao_social\":\"CLICK - RODO ENTREGAS LTDA\",\"fantasia\":\"\",\"atividade_01\":\"49.30-2-02 - Transporte rodoviário de carga, exceto produtos perigosos e mudanças, intermunicipal, interestadual e internacional\",\"atividade_02\":[\"52.11-7-99 - Depósitos de mercadorias para terceiros, exceto armazéns gerais e guarda-móveis\",\"52.50-8-03 - Agenciamento de cargas, exceto para o transporte marítimo\",\"52.50-8-04 - Organização logística do transporte de carga\",\"53.20-2-01 - Serviços de malote não realizados pelo Correio Nacional\",\"53.20-2-02 - Serviços de entrega rápida\",\"62.01-5-01 - Desenvolvimento de programas de computador sob encomenda\"],\"nat_jur\":\"206-2 - Sociedade Empresária Limitada\",\"logradouro\":\"V AC NORTE KM 38\",\"numero\":\"420\",\"compl\":\"GALPAO: 02 E 03 PARTE B;\",\"cep\":\"07.789-100\",\"bairro\":\"EMPRESARIAL GATO PRETO (JORDANESIA)\",\"municipio\":\"CAJAMAR\",\"uf\":\"SP\",\"efr\":\"\",\"sit_cad\":\"ATIVA\",\"data_sit_cad\":\"14/02/2012\",\"motivo_sit_cad\":\"\",\"sit_esp\":\"\",\"data_sit_esp\":\"\",\"capital_social\":\"R$ 44.928.080,00 (Quarenta e quatro milhões, novecentos e vinte e oito mil e oitenta reais)\",\"razoes_anteriores\":[],\"emails\":[\"fiscal.nfe@b2wdigital.com\"],\"qtd_estabelecimentos\":21,\"limite_credito\":10000,\"ies\":{\"habilitadas\":1,\"nao_habilitada\":0,\"lista_ies\":[{\"ie\":241056660111,\"sit_cad\":\"Ativo\",\"data_sit_cad\":\"01/03/2012\"}]},\"telefones\":[{\"ddd\":11,\"tel\":40034848,\"rfb\":true},{\"ddd\":11,\"tel\":40035544,\"rfb\":true}],\"socios\":[{\"cnpj\":15121491000104,\"doc\":326412735,\"tipo_doc\":\"CPF\",\"nome\":\"JOSE TIMOTHEO DE BARROS\",\"cargo\":\"Sócio-Administrador\"},{\"cnpj\":15121491000104,\"doc\":8525086000188,\"tipo_doc\":\"CNPJ\",\"nome\":\"ANNA CHRISTINA RAMOS SAICALI\",\"cargo\":\"Administrador\"},{\"cnpj\":15121491000104,\"doc\":2833453736,\"tipo_doc\":\"CPF\",\"nome\":\"FLAVIO DE ALMEIDA SERAPIAO\",\"cargo\":\"Administrador\"},{\"cnpj\":15121491000104,\"doc\":2532597704,\"tipo_doc\":\"CPF\",\"nome\":\"MARCIO CRUZ MEIRELLES\",\"cargo\":\"Administrador\"},{\"cnpj\":15121491000104,\"doc\":91738032604,\"tipo_doc\":\"CPF\",\"nome\":\"THIAGO MENDES BARREIRA\",\"cargo\":\"Administrador\"},{\"cnpj\":15121491000104,\"doc\":2394252782,\"tipo_doc\":\"CPF\",\"nome\":\"CARLOS EDUARDO ROSALBA PADILHA\",\"cargo\":\"Administrador\"},{\"cnpj\":15121491000104,\"doc\":8890521740,\"tipo_doc\":\"CPF\",\"nome\":\"FABIO DA SILVA ABRATE\",\"cargo\":\"Administrador\"},{\"cnpj\":15121491000104,\"doc\":24659583805,\"tipo_doc\":\"CPF\",\"nome\":\"CARLOS HENRIQUE DE LUCCA FORTES GATTO\",\"cargo\":\"Administrador\"},{\"cnpj\":15121491000104,\"doc\":17653377807,\"tipo_doc\":\"CPF\",\"nome\":\"JEAN PIERRE LESSA E SANTOS FERREIRA\",\"cargo\":\"Administrador\"},{\"cnpj\":15121491000104,\"doc\":26219896000198,\"tipo_doc\":\"CNPJ\",\"nome\":\"BFF LOGISTICA E DISTRIBUICAO LTDA\",\"cargo\":\"Sócio\"},{\"cnpj\":15121491000104,\"doc\":null,\"tipo_doc\":null,\"nome\":\"MARCELO DA SILVA NUNES\",\"cargo\":\"05-Administrador\"}],\"participacoes_empresa\":[],\"participacoes_socios\":[{\"socio\":{\"cnpj\":15121491000104,\"doc\":326412735,\"tipo_doc\":\"CPF\",\"nome\":\"JOSE TIMOTHEO DE BARROS\",\"cargo\":\"Sócio-Administrador\"},\"participacoes\":[{\"cnpj\":776574000660,\"cargo\":\"Diretor\",\"razao_social\":\"B2W COMPANHIA DIGITAL\"},{\"cnpj\":2867220000142,\"cargo\":\"Administrador\",\"razao_social\":\"ST IMPORTACOES LTDA\"},{\"cnpj\":3789968000137,\"cargo\":\"Sócio\",\"razao_social\":\"BIT SERVICES INOVACAO E TECNOLOGIA LTDA.\"},{\"cnpj\":5886614000136,\"cargo\":\"Diretor\",\"razao_social\":\"DIRECT EXPRESS LOGISTICA INTEGRADA S/A\"},{\"cnpj\":8060852000186,\"cargo\":\"Administrador\",\"razao_social\":\"QSM DISTRIBUIDORA E LOGISTICA LTDA\"},{\"cnpj\":8596150000111,\"cargo\":\"Administrador\",\"razao_social\":\"FREIJO ADMINISTRACAO E PARTICIPACOES LTDA.\"},{\"cnpj\":8778355000118,\"cargo\":\"Administrador\",\"razao_social\":\"MESA EXPRESS SERVICO DE INFORMACAO NA INTERNET S.A.\"},{\"cnpj\":9114718000183,\"cargo\":\"Diretor\",\"razao_social\":\"B2W RENTAL S.A.\"},{\"cnpj\":26219896000198,\"cargo\":\"Sócio-Administrador\",\"razao_social\":\"BFF LOGISTICA E DISTRIBUICAO LTDA\"},{\"cnpj\":33014556000196,\"cargo\":\"Diretor\",\"razao_social\":\"LOJAS AMERICANAS S.A.\"}]},{\"socio\":{\"cnpj\":15121491000104,\"doc\":8525086000188,\"tipo_doc\":\"CNPJ\",\"nome\":\"ANNA CHRISTINA RAMOS SAICALI\",\"cargo\":\"Administrador\"},\"participacoes\":[{\"cnpj\":5886614000136,\"cargo\":\"Diretor\",\"razao_social\":\"DIRECT EXPRESS LOGISTICA INTEGRADA S/A\"},{\"cnpj\":8060852000186,\"cargo\":\"Administrador\",\"razao_social\":\"QSM DISTRIBUIDORA E LOGISTICA LTDA\"}]},{\"socio\":{\"cnpj\":15121491000104,\"doc\":2833453736,\"tipo_doc\":\"CPF\",\"nome\":\"FLAVIO DE ALMEIDA SERAPIAO\",\"cargo\":\"Administrador\"},\"participacoes\":[{\"cnpj\":776574000660,\"cargo\":\"Diretor\",\"razao_social\":\"B2W COMPANHIA DIGITAL\"},{\"cnpj\":2867220000142,\"cargo\":\"Administrador\",\"razao_social\":\"ST IMPORTACOES LTDA\"},{\"cnpj\":5886614000136,\"cargo\":\"Diretor\",\"razao_social\":\"DIRECT EXPRESS LOGISTICA INTEGRADA S/A\"},{\"cnpj\":8060852000186,\"cargo\":\"Administrador\",\"razao_social\":\"QSM DISTRIBUIDORA E LOGISTICA LTDA\"},{\"cnpj\":8778355000118,\"cargo\":\"Administrador\",\"razao_social\":\"MESA EXPRESS SERVICO DE INFORMACAO NA INTERNET S.A.\"},{\"cnpj\":9114718000183,\"cargo\":\"Diretor\",\"razao_social\":\"B2W RENTAL S.A.\"},{\"cnpj\":26219896000198,\"cargo\":\"Administrador\",\"razao_social\":\"BFF LOGISTICA E DISTRIBUICAO LTDA\"},{\"cnpj\":33014556000196,\"cargo\":\"Diretor\",\"razao_social\":\"LOJAS AMERICANAS S.A.\"}]},{\"socio\":{\"cnpj\":15121491000104,\"doc\":2532597704,\"tipo_doc\":\"CPF\",\"nome\":\"MARCIO CRUZ MEIRELLES\",\"cargo\":\"Administrador\"},\"participacoes\":[{\"cnpj\":776574000660,\"cargo\":\"Diretor\",\"razao_social\":\"B2W COMPANHIA DIGITAL\"},{\"cnpj\":2867220000142,\"cargo\":\"Administrador\",\"razao_social\":\"ST IMPORTACOES LTDA\"},{\"cnpj\":5886614000136,\"cargo\":\"Diretor\",\"razao_social\":\"DIRECT EXPRESS LOGISTICA INTEGRADA S/A\"},{\"cnpj\":8060852000186,\"cargo\":\"Administrador\",\"razao_social\":\"QSM DISTRIBUIDORA E LOGISTICA LTDA\"},{\"cnpj\":8778355000118,\"cargo\":\"Administrador\",\"razao_social\":\"MESA EXPRESS SERVICO DE INFORMACAO NA INTERNET S.A.\"},{\"cnpj\":9114718000183,\"cargo\":\"Diretor\",\"razao_social\":\"B2W RENTAL S.A.\"},{\"cnpj\":26219896000198,\"cargo\":\"Administrador\",\"razao_social\":\"BFF LOGISTICA E DISTRIBUICAO LTDA\"},{\"cnpj\":33014556000196,\"cargo\":\"Diretor\",\"razao_social\":\"LOJAS AMERICANAS S.A.\"}]},{\"socio\":{\"cnpj\":15121491000104,\"doc\":91738032604,\"tipo_doc\":\"CPF\",\"nome\":\"THIAGO MENDES BARREIRA\",\"cargo\":\"Administrador\"},\"participacoes\":[{\"cnpj\":776574000660,\"cargo\":\"Diretor\",\"razao_social\":\"B2W COMPANHIA DIGITAL\"},{\"cnpj\":1254615000107,\"cargo\":\"Sócio\",\"razao_social\":\"RJTC CONSULTORIA TECNICA LTDA\"},{\"cnpj\":2867220000142,\"cargo\":\"Administrador\",\"razao_social\":\"ST IMPORTACOES LTDA\"},{\"cnpj\":5886614000136,\"cargo\":\"Diretor\",\"razao_social\":\"DIRECT EXPRESS LOGISTICA INTEGRADA S/A\"},{\"cnpj\":8060852000186,\"cargo\":\"Administrador\",\"razao_social\":\"QSM DISTRIBUIDORA E LOGISTICA LTDA\"},{\"cnpj\":8778355000118,\"cargo\":\"Administrador\",\"razao_social\":\"MESA EXPRESS SERVICO DE INFORMACAO NA INTERNET S.A.\"},{\"cnpj\":9114718000183,\"cargo\":\"Diretor\",\"razao_social\":\"B2W RENTAL S.A.\"},{\"cnpj\":12989303000168,\"cargo\":\"Sócio-Administrador\",\"razao_social\":\"TCR CONSULTORIA ADMINISTRATIVA E FINANCEIRA LTDA.\"},{\"cnpj\":26219896000198,\"cargo\":\"Administrador\",\"razao_social\":\"BFF LOGISTICA E DISTRIBUICAO LTDA\"}]},{\"socio\":{\"cnpj\":15121491000104,\"doc\":2394252782,\"tipo_doc\":\"CPF\",\"nome\":\"CARLOS EDUARDO ROSALBA PADILHA\",\"cargo\":\"Administrador\"},\"participacoes\":[{\"cnpj\":776574000660,\"cargo\":\"Diretor\",\"razao_social\":\"B2W COMPANHIA DIGITAL\"},{\"cnpj\":5886614000136,\"cargo\":\"Diretor\",\"razao_social\":\"DIRECT EXPRESS LOGISTICA INTEGRADA S/A\"},{\"cnpj\":8060852000186,\"cargo\":\"Administrador\",\"razao_social\":\"QSM DISTRIBUIDORA E LOGISTICA LTDA\"},{\"cnpj\":26219896000198,\"cargo\":\"Administrador\",\"razao_social\":\"BFF LOGISTICA E DISTRIBUICAO LTDA\"},{\"cnpj\":33014556000196,\"cargo\":\"Diretor\",\"razao_social\":\"LOJAS AMERICANAS S.A.\"}]},{\"socio\":{\"cnpj\":15121491000104,\"doc\":8890521740,\"tipo_doc\":\"CPF\",\"nome\":\"FABIO DA SILVA ABRATE\",\"cargo\":\"Administrador\"},\"participacoes\":[{\"cnpj\":776574000660,\"cargo\":\"Diretor\",\"razao_social\":\"B2W COMPANHIA DIGITAL\"},{\"cnpj\":2867220000142,\"cargo\":\"Administrador\",\"razao_social\":\"ST IMPORTACOES LTDA\"},{\"cnpj\":3789968000137,\"cargo\":\"Administrador\",\"razao_social\":\"BIT SERVICES INOVACAO E TECNOLOGIA LTDA.\"},{\"cnpj\":5886614000136,\"cargo\":\"Diretor\",\"razao_social\":\"DIRECT EXPRESS LOGISTICA INTEGRADA S/A\"},{\"cnpj\":8060852000186,\"cargo\":\"Administrador\",\"razao_social\":\"QSM DISTRIBUIDORA E LOGISTICA LTDA\"},{\"cnpj\":8778355000118,\"cargo\":\"Diretor\",\"razao_social\":\"MESA EXPRESS SERVICO DE INFORMACAO NA INTERNET S.A.\"},{\"cnpj\":9114718000183,\"cargo\":\"Diretor\",\"razao_social\":\"B2W RENTAL S.A.\"},{\"cnpj\":13234013000177,\"cargo\":\"Sócio\",\"razao_social\":\"AAX 2011 REPRESENTACOES LTDA\"},{\"cnpj\":19271882000158,\"cargo\":\"Diretor\",\"razao_social\":\"INFOPRECOS S.A.\"},{\"cnpj\":26219896000198,\"cargo\":\"Administrador\",\"razao_social\":\"BFF LOGISTICA E DISTRIBUICAO LTDA\"}]},{\"socio\":{\"cnpj\":15121491000104,\"doc\":24659583805,\"tipo_doc\":\"CPF\",\"nome\":\"CARLOS HENRIQUE DE LUCCA FORTES GATTO\",\"cargo\":\"Administrador\"},\"participacoes\":[{\"cnpj\":776574000660,\"cargo\":\"Diretor\",\"razao_social\":\"B2W COMPANHIA DIGITAL\"},{\"cnpj\":3789968000137,\"cargo\":\"Administrador\",\"razao_social\":\"BIT SERVICES INOVACAO E TECNOLOGIA LTDA.\"},{\"cnpj\":5886614000136,\"cargo\":\"Diretor\",\"razao_social\":\"DIRECT EXPRESS LOGISTICA INTEGRADA S/A\"},{\"cnpj\":19271882000158,\"cargo\":\"Diretor\",\"razao_social\":\"INFOPRECOS S.A.\"},{\"cnpj\":26219896000198,\"cargo\":\"Administrador\",\"razao_social\":\"BFF LOGISTICA E DISTRIBUICAO LTDA\"}]},{\"socio\":{\"cnpj\":15121491000104,\"doc\":17653377807,\"tipo_doc\":\"CPF\",\"nome\":\"JEAN PIERRE LESSA E SANTOS FERREIRA\",\"cargo\":\"Administrador\"},\"participacoes\":[{\"cnpj\":776574000660,\"cargo\":\"Diretor\",\"razao_social\":\"B2W COMPANHIA DIGITAL\"},{\"cnpj\":2638789000136,\"cargo\":\"Sócio-Administrador\",\"razao_social\":\"CATALISE NEGOCIOS FINANCAS \\u0026 INFORMATICA LTDA\"},{\"cnpj\":3789968000137,\"cargo\":\"Administrador\",\"razao_social\":\"BIT SERVICES INOVACAO E TECNOLOGIA LTDA.\"},{\"cnpj\":5886614000136,\"cargo\":\"Diretor\",\"razao_social\":\"DIRECT EXPRESS LOGISTICA INTEGRADA S/A\"},{\"cnpj\":19271882000158,\"cargo\":\"Diretor\",\"razao_social\":\"INFOPRECOS S.A.\"},{\"cnpj\":26219896000198,\"cargo\":\"Administrador\",\"razao_social\":\"BFF LOGISTICA E DISTRIBUICAO LTDA\"}]}],\"cheques_empresa\":[],\"cheques_socios\":[],\"cheques_participacoes_empresa\":[],\"cheques_participacoes_socios\":[],\"cobertura_cartorios\":{\"qtd_mun\":19,\"qtd_cartorio\":31,\"qtd_cartorio_participa\":31}}";
			if(retorno.length()==0) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 2", null));
			}else {
				if(retorno.indexOf("\"msg\":") > 0) {
					int posIni = retorno.indexOf("{\"msg\":\"")+"{\"msg\":\"".length();
					int posFin = retorno.indexOf("\",\"status\":");
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							retorno.substring(posIni, posFin), null));
				}else{
					String array[] = new String[2];
					array = retorno.split("<>");
					
					Gson gson = new Gson();
					rescnpj = gson.fromJson(array[0], br.com.orpecredit.wscrediOnline.CrediOnLineRestritivoCNPJ.class);
					relcnpj = gson.fromJson(array[1], br.com.orpecredit.wscrediOnline.CrediOnLineRelatorioCNPJ.class);			
					this.openPopup();
				}			
			}
			//System.out.println("*****Conteudo Agora : "+rescnpj.getProtestos().getRegistros().get(1).getCartorio());
	
		}else if(con.equals("[52]")) {
			packagePage = "empresarialGold";
			page = "resposta";			
			widthPopupCrud = 1070;
			heightPopupCrud = 490;
			
			if(!this.valor8) {
				if(this.entradaCheque==null) {
					this.cmc7="";this.banco="";this.agencia="";this.numConta="";
					this.digConta="";this.numCheque="";this.digCheque="";
				}else if(this.entradaCheque.equals("1")) {
					this.cmc7="";
				}else{
					this.banco="";this.agencia="";this.numConta="";
					this.digConta="";this.numCheque="";this.digCheque="";
				}
			}
			
			//Preenche os dados da tela na entidade do produto define risco
			preencheProdutoDefine();
			
			define = consultaService.defineRisco(cnpj, pd, "[52]");
			if(define == null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 1", null));
			}else {
				if(define.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA()==0) {
					//Prepara a lista para printar na tela.
					if(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().size()>0) {
						listaConsultaMes = preencheListaConsultaMes();
					}
					valorTela0=valor0;
					valorTela1=valor1;
					valorTela2=valor2;
					valorTela3=valor3;
					valorTela4=valor4;
					valorTela5=valor5;
					valorTela6=valor6;
					valorTela7=valor7;
					valorTela8=valor8;
					valorTela9=valor9;
					
					this.openPopup();
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							define.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
				}
			}
			//System.out.println("*****HABILITA : "+define.getRESPOSTA().getDEFINERESPOSTA().getDEFPENDENCIASRESTRICOES().getDEFULTIMASOCORRENCIAS().getDEFPENDENCIARESTRICAO().get(0).getDEFDOCUMENTOORIGEM());			
		}else if(con.equals("[71]")) {
			packagePage = "buscaEndTelefoneCnpj";
			page = "resposta";			
			widthPopupCrud = 1070;
			heightPopupCrud = 490;
			
			define = consultaService.defineCadastro(cnpj, null);
			if(define == null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
				"Problemas de conexão com fornecedor 1", null));
			}else {
				if(define.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA()==0) {
					this.openPopup();
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							define.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
				}
			}
			//System.out.println("*****HABILITA : "+define.getRESPOSTA().getDEFINERESPOSTA().getDEFLOCALIZACAOCOMPLETO().getDEFMATRIZ().getDEFTELEFONEMATRIZ().getDEFTELEFONE());			
		}else if(con.equals("[74]")) {
			packagePage = "empresarialTop";
			page = "resposta";			
			widthPopupCrud = 1070;
			heightPopupCrud = 490;
		
			define = consultaService.defineRisco(cnpj, null, "[74]");
			if(define == null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Problemas de conexão com fornecedor 1", null));
			}else {
				if(define.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA()==0) {
					listaConsultaMes = preencheListaConsultaMes();
					this.openPopup();
				}else {
					FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
							define.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA(), null));					
				}
			}
			//System.out.println("*****HABILITA : "+define.getRESPOSTA().getDEFINERESPOSTA().getDEFPENDENCIASRESTRICOES().getDEFULTIMASOCORRENCIAS().getDEFPENDENCIARESTRICAO().get(0).getDEFDOCUMENTOORIGEM());			
			resetTela();
		}
	}

	public ConsultaService getConsultaService() {
		return consultaService;
	}

	public void setConsultaService(ConsultaService consultaService) {
		this.consultaService = consultaService;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstadoTela() {
		return estadoTela;
	}

	public void setEstadoTela(String estadoTela) {
		this.estadoTela = estadoTela;
	}

	public String getHoraAtual() {
		horaAtual = Formatador.getHoraMinutoSegundo();
		return horaAtual;
	}

	public String getDataAtual() {
		dataAtual = Formatador.getDataHoje();
		return dataAtual;
	}

	public String getCmc7() {
		return cmc7;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getDigConta() {
		return digConta;
	}

	public void setDigConta(String digConta) {
		this.digConta = digConta;
	}

	public String getNumCheque() {
		return numCheque;
	}

	public void setNumCheque(String numCheque) {
		this.numCheque = numCheque;
	}

	public String getDigCheque() {
		return digCheque;
	}

	public void setDigCheque(String digCheque) {
		this.digCheque = digCheque;
	}

	public String getQtdeCheque() {
		return qtdeCheque;
	}

	public void setQtdeCheque(String qtdeCheque) {
		this.qtdeCheque = qtdeCheque;
	}

	public Date getDataCheque() {
		return dataCheque;
	}

	public void setCmc7(String cmc7) {
		this.cmc7 = cmc7;
	}

	public void setDataCheque(Date dataCheque) {
		this.dataCheque = dataCheque;
	}

	public String getEntradaCheque() {
		return entradaCheque;
	}

	public void setEntradaCheque(String entradaCheque) {
		this.entradaCheque = entradaCheque;
	}

	public boolean isChequeSup() {
		return chequeSup;
	}

	public void setChequeSup(boolean chequeSup) {
		this.chequeSup = chequeSup;
	}

	public boolean isChequeInf() {
		return chequeInf;
	}

	public void setChequeInf(boolean chequeInf) {
		this.chequeInf = chequeInf;
	}

	public boolean isChequeOpcao() {
		return chequeOpcao;
	}

	public void setChequeOpcao(boolean chequeOpcao) {
		this.chequeOpcao = chequeOpcao;
	}

	public boolean isValor0() {
		return valor0;
	}

	public void setValor0(boolean valor0) {
		this.valor0 = valor0;
	}

	public boolean isValor1() {
		return valor1;
	}

	public void setValor1(boolean valor1) {
		this.valor1 = valor1;
	}

	public boolean isValor2() {
		return valor2;
	}

	public void setValor2(boolean valor2) {
		this.valor2 = valor2;
	}

	public boolean isValor3() {
		return valor3;
	}

	public void setValor3(boolean valor3) {
		this.valor3 = valor3;
	}

	public boolean isValor4() {
		return valor4;
	}

	public void setValor4(boolean valor4) {
		this.valor4 = valor4;
	}

	public boolean isValor5() {
		return valor5;
	}

	public void setValor5(boolean valor5) {
		this.valor5 = valor5;
	}

	public boolean isValor6() {
		return valor6;
	}

	public void setValor6(boolean valor6) {
		this.valor6 = valor6;
	}

	public boolean isValor7() {
		return valor7;
	}

	public void setValor7(boolean valor7) {
		this.valor7 = valor7;
	}

	public boolean isValor8() {
		return valor8;
	}

	public void setValor8(boolean valor8) {
		this.valor8 = valor8;
	}

	public boolean isValor9() {
		return valor9;
	}

	public void setValor9(boolean valor9) {
		this.valor9 = valor9;
	}

	public boolean isValorTela0() {
		return valorTela0;
	}

	public void setValorTela0(boolean valorTela0) {
		this.valorTela0 = valorTela0;
	}

	public boolean isValorTela1() {
		return valorTela1;
	}

	public void setValorTela1(boolean valorTela1) {
		this.valorTela1 = valorTela1;
	}

	public boolean isValorTela2() {
		return valorTela2;
	}

	public void setValorTela2(boolean valorTela2) {
		this.valorTela2 = valorTela2;
	}

	public boolean isValorTela3() {
		return valorTela3;
	}

	public void setValorTela3(boolean valorTela3) {
		this.valorTela3 = valorTela3;
	}

	public boolean isValorTela4() {
		return valorTela4;
	}

	public void setValorTela4(boolean valorTela4) {
		this.valorTela4 = valorTela4;
	}

	public boolean isValorTela5() {
		return valorTela5;
	}

	public void setValorTela5(boolean valorTela5) {
		this.valorTela5 = valorTela5;
	}

	public boolean isValorTela6() {
		return valorTela6;
	}

	public void setValorTela6(boolean valorTela6) {
		this.valorTela6 = valorTela6;
	}

	public boolean isValorTela7() {
		return valorTela7;
	}

	public void setValorTela7(boolean valorTela7) {
		this.valorTela7 = valorTela7;
	}

	public boolean isValorTela8() {
		return valorTela8;
	}

	public void setValorTela8(boolean valorTela8) {
		this.valorTela8 = valorTela8;
	}

	public boolean isValorTela9() {
		return valorTela9;
	}

	public void setValorTela9(boolean valorTela9) {
		this.valorTela9 = valorTela9;
	}

	public br.com.orpecredit.wscdlrio.acerta.SPCAXML getAcerta() {
		return acerta;
	}

	public void setAcerta(br.com.orpecredit.wscdlrio.acerta.SPCAXML acerta) {
		this.acerta = acerta;
	}

	public br.com.orpecredit.wscdlrio.scpcnet.SPCAXML getScpcnet() {
		return scpcnet;
	}

	public void setScpcnet(br.com.orpecredit.wscdlrio.scpcnet.SPCAXML scpcnet) {
		this.scpcnet = scpcnet;
	}

	public CrediOnLineRelatorioCPF getRelcpf() {
		return relcpf;
	}

	public void setRelcpf(CrediOnLineRelatorioCPF relcpf) {
		this.relcpf = relcpf;
	}

	public CrediOnLineRestritivoCPF getRescpf() {
		return rescpf;
	}

	public void setRescpf(CrediOnLineRestritivoCPF rescpf) {
		this.rescpf = rescpf;
	}

	public CrediOnLineChequeCPF getChecpf() {
		return checpf;
	}

	public void setChecpf(CrediOnLineChequeCPF checpf) {
		this.checpf = checpf;
	}

	public CrediOnLineRelatorioCNPJ getRelcnpj() {
		return relcnpj;
	}

	public void setRelcnpj(CrediOnLineRelatorioCNPJ relcnpj) {
		this.relcnpj = relcnpj;
	}
	
	public CrediOnLineRestritivoCNPJ getRescnpj() {
		return rescnpj;
	}

	public void setRescnpj(CrediOnLineRestritivoCNPJ rescnpj) {
		this.rescnpj = rescnpj;
	}

	public br.com.orpecredit.wscdlrio.define.SPCAXML getDefine() {
		return define;
	}

	public void setDefine(br.com.orpecredit.wscdlrio.define.SPCAXML define) {
		this.define = define;
	}

	public List<ConsultaResposta> getListaConsultaMes() {
		return listaConsultaMes;
	}

	public void setListaConsultaMes(List<ConsultaResposta> listaConsultaMes) {
		this.listaConsultaMes = listaConsultaMes;
	}
	
	public DEFSOCIO getDefSocio() {
		return defSocio;
	}

	public void setDefSocio(DEFSOCIO defSocio) {
		this.defSocio = defSocio;
	}

	public DEFADMINISTRADOR getDefAdmin() {
		return defAdmin;
	}

	public void setDefAdmin(DEFADMINISTRADOR defAdmin) {
		this.defAdmin = defAdmin;
	}

	public DEFPARTICIPACAOEMPRESACONSULTADA getDefParEmp() {
		return defParEmp;
	}

	public void setDefParEmp(DEFPARTICIPACAOEMPRESACONSULTADA defParEmp) {
		this.defParEmp = defParEmp;
	}

	public DEFSOCIOSPARTICIPANTES getDefSocioAdmin() {
		return defSocioAdmin;
	}

	public void setDefSocioAdmin(DEFSOCIOSPARTICIPANTES defSocioAdmin) {
		this.defSocioAdmin = defSocioAdmin;
	}

	public String[] getDataComportamento() {
		return dataComportamento;
	}

	public void setDataComportamento(String[] dataComportamento) {
		this.dataComportamento = dataComportamento;
	}

	public Integer[] getQtdeComportamento() {
		return qtdeComportamento;
	}

	public void setQtdeComportamento(Integer[] qtdeComportamento) {
		this.qtdeComportamento = qtdeComportamento;
	}

	public Double[] getValorComportamento() {
		return valorComportamento;
	}

	public void setValorComportamento(Double[] valorComportamento) {
		this.valorComportamento = valorComportamento;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String converteData(String data) {
		String data1 = "";
		if (!data.equals("")) {
			data1 = data.replace("-", "");
			data1 = data1.substring(6, 8)+"/"+data1.substring(4, 6)+"/"+data1.substring(0, 4);
		}
		if(data.indexOf("/") > 0) {
			data1 = data.substring(0, 10);
		}
		return data1;
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
	
	public String formataCEP(String cep) {
		String cep2 = "";
		if(!cep.equals("")) {
			cep2 = Formatador.formataCEP(cep);
		}
		return cep2;
	}
	
	public String formataTel(String ddd, String tel) {
		String telefone = "";
		if(!tel.equals("")) {
			telefone = "("+Formatador.retiraZerosEsquerda(ddd)+") "+Formatador.formataTelefone(Formatador.retiraZerosEsquerda(tel));
		}
		return telefone;
	}
	
	public String retiraZeros(String str) {
		return Formatador.retiraZerosEsquerda(str.trim());
	}

	public static String zeroLeft(String origem, int tamanho) {
		if (origem == null || origem.length() == 0) {
			origem = "";
		}
		
		StringBuffer buffer = new StringBuffer();

		if (origem.length() < tamanho) {
			for (int i = 0; i < (tamanho - origem.length()); i++) {
				buffer.append('0');
			}
			buffer.append(origem);
		} else {
			buffer.append(origem);
		}
		return buffer.toString();
	}
	
	public Double strDouble(String str) {
		if(str.length()>0) {
			return Double.parseDouble(str.replace(",", "."));
		}else {
			return null;
		}
	}
		
	public Double percentual(String str) {
		if(str.length()>0) {
			return Double.parseDouble(str)/100;
		}else {
			return null;
		}
	}
	
	public static String calcCobertura(String qtdCartorio, String qtdParticipantes) {
		if(!(qtdCartorio.equals("0") && !qtdParticipantes.equals("0")) && 
		  (!qtdCartorio.equals("")   && !qtdParticipantes.equals(""))) {
			Double valor = (Double.parseDouble(qtdParticipantes)/Double.parseDouble(qtdCartorio))*100;
			return String.valueOf(valor.intValue())+"%";
		}else {
			return "0%";
		}
	}
	
	public String situacaoCPF(String str) {
		if(str.equals("1")) {
			str = "Regular";
		}else if(str.equals("2")) {
			str = "Cancelado";
		}else if(str.equals("3")) {
			str = "Pendente";
		}else if(str.equals("4")) {
			str = "Suspenso";
		}else if(str.equals("5")) {
			str = "Inexistente";
		}else if(str.equals("6")) {
			str = "Dados Incompletos";
		}else if(str.equals("7")) {
			str = "Nula";
		}else if(str.equals("9")) {
			str = "Nao especificado";
		}
		return str;
	}

	public String tipoOcorrencia(String str) {
		if(str.equals("‘CC’")) {
			str = "Cartão de Crédito";
		}else if(str.equals("CD")) {
			str = "Crédito Direto";
		}else if(str.equals("CG")) {
			str = "Crédito Consignado";
		}else if(str.equals("CH")) {
			str = "Cheque";
		}else if(str.equals("CP")) {
			str = "Crédito Pessoal";
		}else if(str.equals("CV")) {
			str = "Crédito Veículos";
		}else if(str.equals("OU")) {
			str = "Outros";
		}else if(str.equals("FI")) {
			str = "Financeira";
		}else if(str.equals("ME")) {
			str = "Mercantil";
		}else if(str.equals("RC")) {
			str = "Renovação de Cadastro";			
		}
		return str;
	}
	
	public String condicao(String str) {
		if(str.equals("0")) {
			str = "Ativo";
		}else if(str.equals("1")) {
			str = "Inapto";
		}else if(str.equals("2")) {
			str = "Suspenso";
		}else if(str.equals("6")) {
			str = "Baixado";
		}else if(str.equals("7")) {
			str = "Nulo";
		}else if(str.equals("8")) {
			str = "Cancelado";
		}
		return str;
	}
	
	public void abrirCobertura() {
		packagePage = "crediOnlineCNPJ";
		page = "cobertura";			
		widthPopupCrud = 700;
		heightPopupCrud = 300;
		this.openPopup();
	}
	
	private void openPopup() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("draggable", true);
		options.put("resizable", true);
		options.put("minimizable", false);
		options.put("maximizable", false);
		options.put("responsive", true);
		options.put("contentWidth", widthPopupCrud);
		options.put("contentHeight", heightPopupCrud);
		//options.put("close", "document.formConsulta.cpf.focus();");
		if (appendToBody)
			options.put("appendToBody", true);

		RequestContext.getCurrentInstance().openDialog("/" + packagePage + "/" + page, options, null);
		//RequestContext.getCurrentInstance().execute("PrimeFaces.focus('formConsulta:cpf')");
	}
	
	protected void closePopup() {
		RequestContext.getCurrentInstance().closeDialog("/" + packagePage + "/" + page);
	} 
	
	public String voltar() {
		return "/index.jsf?faces-redirect=true";
	}
	
	public String voltar2() {
		resetTela();
		return "/index.jsf?faces-redirect=true";
	}
	
	public void preencheProdutoDefine() {
		pd = new ProdutoDefine();
		pd.setCmc7(this.cmc7);
		pd.setBanco(this.banco);
		pd.setAgencia(this.agencia);
		pd.setNumConta(this.numConta);
		pd.setDigConta(this.digConta);
		pd.setNumCheque(this.numCheque);	
		pd.setDigCheque(this.digCheque);
		pd.setQtdeCheque(this.qtdeCheque);
		pd.setEntradaCheque(this.entradaCheque);
		if(this.dataCheque!=null)
			pd.setDataCheque(DateUtil.parseDateStr(this.dataCheque).replace("/", ""));
		pd.setValor0(this.valor0);
		pd.setValor1(this.valor1);
		pd.setValor2(this.valor2);
		pd.setValor3(this.valor3);
		pd.setValor4(this.valor4);
		pd.setValor5(this.valor5);
		pd.setValor6(this.valor6);
		pd.setValor7(this.valor7);
		pd.setValor8(this.valor8);
		pd.setValor9(this.valor9);
	}
	
	public void resetTela() {
		this.cpf = "";
		this.cnpj = "";
		this.estado = "";
		this.cmc7 = "";
		this.banco = "";
		this.agencia = "";
		this.numConta = "";
		this.digConta = "";
		this.numCheque = "";		
		this.digCheque = "";
		this.qtdeCheque ="";
		this.entradaCheque = "";
		this.dataCheque = null;
		this.chequeOpcao = false;
		this.chequeSup = false;
		this.chequeInf = false;
		this.valor0 = false;
		this.valor1 = false;
		this.valor2 = false;
		this.valor3 = false;
		this.valor4 = false;
		this.valor5 = false;
		this.valor6 = false;
		this.valor7 = false;
		this.valor8 = false;
		this.valor9 = false;
	}
	
	public void resetValor(int num) {
		if(num==0) {
			this.valor0 = false;
		}else if(num==3){
			this.valor3 = false;
		}else if(num==6){
			this.valor6 = false;
		}else if(num==9){
			this.valor9 = false;
		}
	}
	
	public void resetOpcao() {
		if(this.chequeOpcao) {
			this.chequeOpcao = false;
		} else {
			this.chequeOpcao = true;
			this.entradaCheque = "1";
		}
	}
	
	public void resetEntradaCheque(int numero) {
		if(numero==1) {
			this.entradaCheque = "1";
		}else {
			this.entradaCheque = "2";
		}
	}
	
	public boolean comportamento(String pessoa, String tipoComp) {
		boolean ret = true;
		String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		String data = "";
		
		if (pessoa.equals("J")) {
			if (tipoComp.equals("T")) {
				if (rescnpj.getTitulos().getComportamento().size() == 0) {
					ret = false;
				}
				dataComportamento = new String[rescnpj.getTitulos().getComportamento().size()];
				qtdeComportamento = new Integer[rescnpj.getTitulos().getComportamento().size()];
				valorComportamento = new Double[rescnpj.getTitulos().getComportamento().size()];

				for (int i = 0; i < rescnpj.getTitulos().getComportamento().size(); i++) {
					// 2018-01
					data = rescnpj.getTitulos().getComportamento().get(i).getData();
					data = mes[Integer.parseInt(data.substring(5, 7)) - 1] + "/" + data.substring(2, 4);

					dataComportamento[i] = data;
					qtdeComportamento[i] = rescnpj.getTitulos().getComportamento().get(i).getQtd();
					valorComportamento[i] = rescnpj.getTitulos().getComportamento().get(i).getValor();
				}
			} else {
				if (rescnpj.getProtestos().getComportamento().size() == 0) {
					ret = false;
				}
				dataComportamento = new String[rescnpj.getProtestos().getComportamento().size()];
				qtdeComportamento = new Integer[rescnpj.getProtestos().getComportamento().size()];
				valorComportamento = new Double[rescnpj.getProtestos().getComportamento().size()];

				for (int i = 0; i < rescnpj.getProtestos().getComportamento().size(); i++) {
					// 2018-01
					data = rescnpj.getProtestos().getComportamento().get(i).getData();
					data = mes[Integer.parseInt(data.substring(5, 7)) - 1] + "/" + data.substring(2, 4);

					dataComportamento[i] = data;
					qtdeComportamento[i] = rescnpj.getProtestos().getComportamento().get(i).getQtd();
					valorComportamento[i] = rescnpj.getProtestos().getComportamento().get(i).getValor();
				}
			}
		} else {
			if (tipoComp.equals("T")) {
				if (rescpf.getTitulos().getComportamento().size() == 0) {
					ret = false;
				}
				dataComportamento = new String[rescpf.getTitulos().getComportamento().size()];
				qtdeComportamento = new Integer[rescpf.getTitulos().getComportamento().size()];
				valorComportamento = new Double[rescpf.getTitulos().getComportamento().size()];

				for (int i = 0; i < rescpf.getTitulos().getComportamento().size(); i++) {
					// 2018-01
					data = rescpf.getTitulos().getComportamento().get(i).getData();
					data = mes[Integer.parseInt(data.substring(5, 7)) - 1] + "/" + data.substring(2, 4);

					dataComportamento[i] = data;
					qtdeComportamento[i] = rescpf.getTitulos().getComportamento().get(i).getQtd();
					valorComportamento[i] = rescpf.getTitulos().getComportamento().get(i).getValor();
				}
			} else {
				if (rescpf.getProtestos().getComportamento().size() == 0) {
					ret = false;
				}
				dataComportamento = new String[rescpf.getProtestos().getComportamento().size()];
				qtdeComportamento = new Integer[rescpf.getProtestos().getComportamento().size()];
				valorComportamento = new Double[rescpf.getProtestos().getComportamento().size()];

				for (int i = 0; i < rescpf.getProtestos().getComportamento().size(); i++) {
					// 2018-01
					data = rescpf.getProtestos().getComportamento().get(i).getData();
					data = mes[Integer.parseInt(data.substring(5, 7)) - 1] + "/" + data.substring(2, 4);

					dataComportamento[i] = data;
					qtdeComportamento[i] = rescpf.getProtestos().getComportamento().get(i).getQtd();
					valorComportamento[i] = rescpf.getProtestos().getComportamento().get(i).getValor();
				}
			}
		}
		return ret;
	}
	
	public List<ConsultaResposta> preencheListaConsultaMes() {
		ConsultaResposta cons = new ConsultaResposta();
		List<ConsultaResposta> lista = new ArrayList<>();
		
		String anoIni = define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(0).getDEFMESANO().substring(2, 6);
		String mes;
		String ano;

		for (int i = 0; i < define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().size(); i++) {
			mes = define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFMESANO().substring(0, 2);
			ano = define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFMESANO().substring(2, 6);
			if (!ano.equals(anoIni)) {
				cons.setAno(anoIni);
				lista.add(cons);
				cons = new ConsultaResposta();
				anoIni = ano;
			}
			if (ano.equals(anoIni)) {
				if (mes.equals("01")) {
					cons.setJan(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("02")) {
					cons.setFev(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("03")) {
					cons.setMar(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("04")) {
					cons.setAbr(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("05")) {
					cons.setMai(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("06")) {
					cons.setJun(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("07")) {
					cons.setJul(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("08")) {
					cons.setAgo(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("09")) {
					cons.setSet(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("10")) {
					cons.setOut(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("11")) {
					cons.setNov(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
				if (mes.equals("12")) {
					cons.setDez(define.getRESPOSTA().getDEFINERESPOSTA().getDEFCONSULTAS().getDEFCONSULTASMES().get(i).getDEFQUANTIDADE());
				}
			}
			if ((i+1)>12) {
				cons.setAno(ano);
				lista.add(cons);
				cons = new ConsultaResposta();
			}
		}
		return lista;
	}
	
	public class ConsultaResposta {
		private String ano;
		private String jan;
		private String fev;
		private String mar;
		private String abr;
		private String mai;
		private String jun;
		private String jul;
		private String ago;
		private String set;
		private String out;
		private String nov;
		private String dez;
		
		public ConsultaResposta() {
			jan = "-";fev = "-";mar = "-";abr = "-";mai = "-";jun = "-";
			jul = "-";ago = "-";set = "-";out = "-";nov = "-";dez = "-";
		}
		
		public String getAno() {
			return ano;
		}
		public void setAno(String ano) {
			this.ano = ano;
		}
		public String getJan() {
			return jan;
		}
		public void setJan(String jan) {
			this.jan = jan;
		}
		public String getFev() {
			return fev;
		}
		public void setFev(String fev) {
			this.fev = fev;
		}
		public String getMar() {
			return mar;
		}
		public void setMar(String mar) {
			this.mar = mar;
		}
		public String getAbr() {
			return abr;
		}
		public void setAbr(String abr) {
			this.abr = abr;
		}
		public String getMai() {
			return mai;
		}
		public void setMai(String mai) {
			this.mai = mai;
		}
		public String getJun() {
			return jun;
		}
		public void setJun(String jun) {
			this.jun = jun;
		}
		public String getJul() {
			return jul;
		}
		public void setJul(String jul) {
			this.jul = jul;
		}
		public String getAgo() {
			return ago;
		}
		public void setAgo(String ago) {
			this.ago = ago;
		}
		public String getSet() {
			return set;
		}
		public void setSet(String set) {
			this.set = set;
		}
		public String getOut() {
			return out;
		}
		public void setOut(String out) {
			this.out = out;
		}
		public String getNov() {
			return nov;
		}
		public void setNov(String nov) {
			this.nov = nov;
		}
		public String getDez() {
			return dez;
		}
		public void setDez(String dez) {
			this.dez = dez;
		}
	}
	
	public String estadoExtenso(String uf) {
		String nomeEstado = "";
		     if(uf.equals("AC")) nomeEstado = "Acre";  
		else if(uf.equals("AL")) nomeEstado = "Alagoas";  
		else if(uf.equals("AM")) nomeEstado = "Amazonas";  
		else if(uf.equals("AP")) nomeEstado = "Amapá";  
		else if(uf.equals("BA")) nomeEstado = "Bahia";  
		else if(uf.equals("CE")) nomeEstado = "Ceará";  
		else if(uf.equals("DF")) nomeEstado = "Distrito Federal";  
		else if(uf.equals("ES")) nomeEstado = "Espirito Santo";  
		else if(uf.equals("GO")) nomeEstado = "Goias";  
		else if(uf.equals("MA")) nomeEstado = "Maranhão";  
		else if(uf.equals("MG")) nomeEstado = "Minas Gerais";  
		else if(uf.equals("MS")) nomeEstado = "Mato Grosso Sul";  
		else if(uf.equals("MT")) nomeEstado = "Mato Grosso";  
		else if(uf.equals("PA")) nomeEstado = "Pará";  
		else if(uf.equals("PB")) nomeEstado = "Paraiba";  
		else if(uf.equals("PE")) nomeEstado = "Pernambuco";  
		else if(uf.equals("PI")) nomeEstado = "Piaui";  
		else if(uf.equals("PR")) nomeEstado = "Parana";  
		else if(uf.equals("RJ")) nomeEstado = "Rio de Janeiro";  
		else if(uf.equals("RN")) nomeEstado = "Rio Grande do Norte";  
		else if(uf.equals("RO")) nomeEstado = "Rondônia";  
		else if(uf.equals("RR")) nomeEstado = "Roraima";  
		else if(uf.equals("RS")) nomeEstado = "Rio Grande do Sul";  
		else if(uf.equals("SC")) nomeEstado = "Santa Catarina";  
		else if(uf.equals("SE")) nomeEstado = "Sergipe";  
		else if(uf.equals("SP")) nomeEstado = "São Paulo";  
		else if(uf.equals("TO")) nomeEstado = "Tocantins";
		else 					 nomeEstado = "Estado nao encontrado";
			
		return nomeEstado.toUpperCase();
	}
	
}
