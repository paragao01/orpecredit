package br.com.orpecredit.wscrediOnline;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CrediOnLineRelatorioCNPJ {

	@SerializedName("msg")
	@Expose
	private String msg;
	@SerializedName("status")
	@Expose
	private Integer status;	
	@SerializedName("cnpj")
	@Expose
	private Long cnpj;
	@SerializedName("tipo_estab")
	@Expose
	private String tipoEstab;
	@SerializedName("data_abertura")
	@Expose
	private String dataAbertura;
	@SerializedName("razao_social")
	@Expose
	private String razaoSocial;
	@SerializedName("fantasia")
	@Expose
	private String fantasia;
	@SerializedName("atividade_01")
	@Expose
	private String atividade01;
	@SerializedName("atividade_02")
	@Expose
	private List<String> atividade02 = null;
	@SerializedName("nat_jur")
	@Expose
	private String natJur;
	@SerializedName("logradouro")
	@Expose
	private String logradouro;
	@SerializedName("numero")
	@Expose
	private String numero;
	@SerializedName("compl")
	@Expose
	private String compl;
	@SerializedName("cep")
	@Expose
	private String cep;
	@SerializedName("bairro")
	@Expose
	private String bairro;
	@SerializedName("municipio")
	@Expose
	private String municipio;
	@SerializedName("uf")
	@Expose
	private String uf;
	@SerializedName("efr")
	@Expose
	private String efr;
	@SerializedName("sit_cad")
	@Expose
	private String sitCad;
	@SerializedName("data_sit_cad")
	@Expose
	private String dataSitCad;
	@SerializedName("motivo_sit_cad")
	@Expose
	private String motivoSitCad;
	@SerializedName("sit_esp")
	@Expose
	private String sitEsp;
	@SerializedName("data_sit_esp")
	@Expose
	private String dataSitEsp;
	@SerializedName("capital_social")
	@Expose
	private String capitalSocial;
	@SerializedName("razoes_anteriores")
	@Expose
	private List<RazoesAnteriore> razoesAnteriores = null;
	@SerializedName("emails")
	@Expose
	private List<String> emails = null;
	@SerializedName("qtd_estabelecimentos")
	@Expose
	private Integer qtdEstabelecimentos;
	@SerializedName("limite_credito")
	@Expose
	private Integer limiteCredito;
	@SerializedName("ies")
	@Expose
	private Ies ies;
	@SerializedName("telefones")
	@Expose
	private List<Telefone> telefones = null;
	@SerializedName("socios")
	@Expose
	private List<Socio> socios = null;
	@SerializedName("participacoes_empresa")
	@Expose
	private List<ParticipacoesEmpresa> participacoesEmpresa = null;
	@SerializedName("participacoes_socios")
	@Expose
	private List<ParticipacoesSocio> participacoesSocios = null;
	@SerializedName("cheques_empresa")
	@Expose
	private List<ChequesEmpresa> chequesEmpresa = null;
	@SerializedName("cheques_participacoes_empresa")
	@Expose
	private List<ChequesParticipacoesEmpresa> chequesParticipacoesEmpresa = null;
	@SerializedName("cheques_socios")
	@Expose
	private List<ChequesSocio> chequesSocios = null;
	@SerializedName("cheques_participacoes_socios")
	@Expose
	private List<ChequesParticipacoesSocio> chequesParticipacoesSocios = null;
	@SerializedName("cobertura_cartorios")
	@Expose
	private CoberturaCartorios coberturaCartorios;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoEstab() {
		return tipoEstab;
	}

	public void setTipoEstab(String tipoEstab) {
		this.tipoEstab = tipoEstab;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getAtividade01() {
		return atividade01;
	}

	public void setAtividade01(String atividade01) {
		this.atividade01 = atividade01;
	}

	public List<String> getAtividade02() {
		return atividade02;
	}

	public void setAtividade02(List<String> atividade02) {
		this.atividade02 = atividade02;
	}

	public String getNatJur() {
		return natJur;
	}

	public void setNatJur(String natJur) {
		this.natJur = natJur;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCompl() {
		return compl;
	}

	public void setCompl(String compl) {
		this.compl = compl;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getEfr() {
		return efr;
	}

	public void setEfr(String efr) {
		this.efr = efr;
	}

	public String getSitCad() {
		return sitCad;
	}

	public void setSitCad(String sitCad) {
		this.sitCad = sitCad;
	}

	public String getDataSitCad() {
		return dataSitCad;
	}

	public void setDataSitCad(String dataSitCad) {
		this.dataSitCad = dataSitCad;
	}

	public String getMotivoSitCad() {
		return motivoSitCad;
	}

	public void setMotivoSitCad(String motivoSitCad) {
		this.motivoSitCad = motivoSitCad;
	}

	public String getSitEsp() {
		return sitEsp;
	}

	public void setSitEsp(String sitEsp) {
		this.sitEsp = sitEsp;
	}

	public String getDataSitEsp() {
		return dataSitEsp;
	}

	public void setDataSitEsp(String dataSitEsp) {
		this.dataSitEsp = dataSitEsp;
	}

	public String getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(String capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public List<RazoesAnteriore> getRazoesAnteriores() {
		return razoesAnteriores;
	}

	public void setRazoesAnteriores(List<RazoesAnteriore> razoesAnteriores) {
		this.razoesAnteriores = razoesAnteriores;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public Integer getQtdEstabelecimentos() {
		return qtdEstabelecimentos;
	}

	public void setQtdEstabelecimentos(Integer qtdEstabelecimentos) {
		this.qtdEstabelecimentos = qtdEstabelecimentos;
	}

	public Integer getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Integer limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Ies getIes() {
		return ies;
	}

	public void setIes(Ies ies) {
		this.ies = ies;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Socio> getSocios() {
		return socios;
	}

	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}

	public List<ParticipacoesEmpresa> getParticipacoesEmpresa() {
		return participacoesEmpresa;
	}

	public void setParticipacoesEmpresa(List<ParticipacoesEmpresa> participacoesEmpresa) {
		this.participacoesEmpresa = participacoesEmpresa;
	}

	public List<ParticipacoesSocio> getParticipacoesSocios() {
		return participacoesSocios;
	}

	public void setParticipacoesSocios(List<ParticipacoesSocio> participacoesSocios) {
		this.participacoesSocios = participacoesSocios;
	}

	public List<ChequesEmpresa> getChequesEmpresa() {
		return chequesEmpresa;
	}

	public void setChequesEmpresa(List<ChequesEmpresa> chequesEmpresa) {
		this.chequesEmpresa = chequesEmpresa;
	}

	public List<ChequesParticipacoesEmpresa> getChequesParticipacoesEmpresa() {
		return chequesParticipacoesEmpresa;
	}

	public void setChequesParticipacoesEmpresa(List<ChequesParticipacoesEmpresa> chequesParticipacoesEmpresa) {
		this.chequesParticipacoesEmpresa = chequesParticipacoesEmpresa;
	}

	public List<ChequesSocio> getChequesSocios() {
		return chequesSocios;
	}

	public void setChequesSocios(List<ChequesSocio> chequesSocios) {
		this.chequesSocios = chequesSocios;
	}

	public List<ChequesParticipacoesSocio> getChequesParticipacoesSocios() {
		return chequesParticipacoesSocios;
	}

	public void setChequesParticipacoesSocios(List<ChequesParticipacoesSocio> chequesParticipacoesSocios) {
		this.chequesParticipacoesSocios = chequesParticipacoesSocios;
	}

	public CoberturaCartorios getCoberturaCartorios() {
		return coberturaCartorios;
	}

	public void setCoberturaCartorios(CoberturaCartorios coberturaCartorios) {
		this.coberturaCartorios = coberturaCartorios;
	}

	public class ChequesEmpresa {

		@SerializedName("num_cheques")
		@Expose
		private Integer numCheques;
		@SerializedName("data_ultimo_cheque")
		@Expose
		private String dataUltimoCheque;
		@SerializedName("doc")
		@Expose
		private Long doc;
		@SerializedName("tipo_doc")
		@Expose
		private String tipoDoc;
		@SerializedName("banco")
		@Expose
		private Integer banco;
		@SerializedName("agencia")
		@Expose
		private Integer agencia;
		@SerializedName("nome")
		@Expose
		private String nome;

		public Integer getNumCheques() {
			return numCheques;
		}

		public void setNumCheques(Integer numCheques) {
			this.numCheques = numCheques;
		}

		public String getDataUltimoCheque() {
			return dataUltimoCheque;
		}

		public void setDataUltimoCheque(String dataUltimoCheque) {
			this.dataUltimoCheque = dataUltimoCheque;
		}

		public Long getDoc() {
			return doc;
		}

		public void setDoc(Long doc) {
			this.doc = doc;
		}

		public String getTipoDoc() {
			return tipoDoc;
		}

		public void setTipoDoc(String tipoDoc) {
			this.tipoDoc = tipoDoc;
		}

		public Integer getBanco() {
			return banco;
		}

		public void setBanco(Integer banco) {
			this.banco = banco;
		}

		public Integer getAgencia() {
			return agencia;
		}

		public void setAgencia(Integer agencia) {
			this.agencia = agencia;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	}

	public class ChequesParticipacoesEmpresa {

		@SerializedName("num_cheques")
		@Expose
		private Integer numCheques;
		@SerializedName("data_ultimo_cheque")
		@Expose
		private String dataUltimoCheque;
		@SerializedName("doc")
		@Expose
		private Long doc;
		@SerializedName("tipo_doc")
		@Expose
		private String tipoDoc;
		@SerializedName("banco")
		@Expose
		private Integer banco;
		@SerializedName("agencia")
		@Expose
		private Integer agencia;
		@SerializedName("nome")
		@Expose
		private String nome;

		public Integer getNumCheques() {
			return numCheques;
		}

		public void setNumCheques(Integer numCheques) {
			this.numCheques = numCheques;
		}

		public String getDataUltimoCheque() {
			return dataUltimoCheque;
		}

		public void setDataUltimoCheque(String dataUltimoCheque) {
			this.dataUltimoCheque = dataUltimoCheque;
		}

		public Long getDoc() {
			return doc;
		}

		public void setDoc(Long doc) {
			this.doc = doc;
		}

		public String getTipoDoc() {
			return tipoDoc;
		}

		public void setTipoDoc(String tipoDoc) {
			this.tipoDoc = tipoDoc;
		}

		public Integer getBanco() {
			return banco;
		}

		public void setBanco(Integer banco) {
			this.banco = banco;
		}

		public Integer getAgencia() {
			return agencia;
		}

		public void setAgencia(Integer agencia) {
			this.agencia = agencia;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	}
	
	public class ChequesParticipacoesSocio {

		@SerializedName("num_cheques")
		@Expose
		private Integer numCheques;
		@SerializedName("data_ultimo_cheque")
		@Expose
		private String dataUltimoCheque;
		@SerializedName("doc")
		@Expose
		private Long doc;
		@SerializedName("tipo_doc")
		@Expose
		private String tipoDoc;
		@SerializedName("banco")
		@Expose
		private Integer banco;
		@SerializedName("agencia")
		@Expose
		private Integer agencia;
		@SerializedName("nome")
		@Expose
		private String nome;

		public Integer getNumCheques() {
			return numCheques;
		}

		public void setNumCheques(Integer numCheques) {
			this.numCheques = numCheques;
		}

		public String getDataUltimoCheque() {
			return dataUltimoCheque;
		}

		public void setDataUltimoCheque(String dataUltimoCheque) {
			this.dataUltimoCheque = dataUltimoCheque;
		}

		public Long getDoc() {
			return doc;
		}

		public void setDoc(Long doc) {
			this.doc = doc;
		}

		public String getTipoDoc() {
			return tipoDoc;
		}

		public void setTipoDoc(String tipoDoc) {
			this.tipoDoc = tipoDoc;
		}

		public Integer getBanco() {
			return banco;
		}

		public void setBanco(Integer banco) {
			this.banco = banco;
		}

		public Integer getAgencia() {
			return agencia;
		}

		public void setAgencia(Integer agencia) {
			this.agencia = agencia;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	}

	public class ChequesSocio {

		@SerializedName("num_cheques")
		@Expose
		private Integer numCheques;
		@SerializedName("data_ultimo_cheque")
		@Expose
		private String dataUltimoCheque;
		@SerializedName("doc")
		@Expose
		private Long doc;
		@SerializedName("tipo_doc")
		@Expose
		private String tipoDoc;
		@SerializedName("banco")
		@Expose
		private Integer banco;
		@SerializedName("agencia")
		@Expose
		private Integer agencia;
		@SerializedName("nome")
		@Expose
		private String nome;

		public Integer getNumCheques() {
			return numCheques;
		}

		public void setNumCheques(Integer numCheques) {
			this.numCheques = numCheques;
		}

		public String getDataUltimoCheque() {
			return dataUltimoCheque;
		}

		public void setDataUltimoCheque(String dataUltimoCheque) {
			this.dataUltimoCheque = dataUltimoCheque;
		}

		public Long getDoc() {
			return doc;
		}

		public void setDoc(Long doc) {
			this.doc = doc;
		}

		public String getTipoDoc() {
			return tipoDoc;
		}

		public void setTipoDoc(String tipoDoc) {
			this.tipoDoc = tipoDoc;
		}

		public Integer getBanco() {
			return banco;
		}

		public void setBanco(Integer banco) {
			this.banco = banco;
		}

		public Integer getAgencia() {
			return agencia;
		}

		public void setAgencia(Integer agencia) {
			this.agencia = agencia;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	}

	public class CoberturaCartorios {

		@SerializedName("qtd_mun")
		@Expose
		private Integer qtdMun;
		@SerializedName("qtd_cartorio")
		@Expose
		private Integer qtdCartorio;
		@SerializedName("qtd_cartorio_participa")
		@Expose
		private Integer qtdCartorioParticipa;

		public Integer getQtdMun() {
			return qtdMun;
		}

		public void setQtdMun(Integer qtdMun) {
			this.qtdMun = qtdMun;
		}

		public Integer getQtdCartorio() {
			return qtdCartorio;
		}

		public void setQtdCartorio(Integer qtdCartorio) {
			this.qtdCartorio = qtdCartorio;
		}

		public Integer getQtdCartorioParticipa() {
			return qtdCartorioParticipa;
		}

		public void setQtdCartorioParticipa(Integer qtdCartorioParticipa) {
			this.qtdCartorioParticipa = qtdCartorioParticipa;
		}

	}

	public class Ies {

		@SerializedName("habilitadas")
		@Expose
		private Integer habilitadas;
		@SerializedName("nao_habilitada")
		@Expose
		private Integer naoHabilitada;
		@SerializedName("lista_ies")
		@Expose
		private List<ListaY> listaIes = null;

		public Integer getHabilitadas() {
			return habilitadas;
		}

		public void setHabilitadas(Integer habilitadas) {
			this.habilitadas = habilitadas;
		}

		public Integer getNaoHabilitada() {
			return naoHabilitada;
		}

		public void setNaoHabilitada(Integer naoHabilitada) {
			this.naoHabilitada = naoHabilitada;
		}

		public List<ListaY> getListaIes() {
			return listaIes;
		}

		public void setListaIes(List<ListaY> listaIes) {
			this.listaIes = listaIes;
		}

	}

	public class ListaY {

		@SerializedName("ie")
		@Expose
		private String ie;
		@SerializedName("sit_cad")
		@Expose
		private String sitCad;
		@SerializedName("data_sit_cad")
		@Expose
		private String dataSitCad;

		public String getIe() {
			return ie;
		}

		public void setIe(String ie) {
			this.ie = ie;
		}

		public String getSitCad() {
			return sitCad;
		}

		public void setSitCad(String sitCad) {
			this.sitCad = sitCad;
		}

		public String getDataSitCad() {
			return dataSitCad;
		}

		public void setDataSitCad(String dataSitCad) {
			this.dataSitCad = dataSitCad;
		}

	}

	public class Participaco {

		@SerializedName("cnpj")
		@Expose
		private Long cnpj;
		@SerializedName("cargo")
		@Expose
		private String cargo;
		@SerializedName("razao_social")
		@Expose
		private String razaoSocial;

		public Long getCnpj() {
			return cnpj;
		}

		public void setCnpj(Long cnpj) {
			this.cnpj = cnpj;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public String getRazaoSocial() {
			return razaoSocial;
		}

		public void setRazaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
		}

	}

	public class ParticipacoesEmpresa {

		@SerializedName("cnpj")
		@Expose
		private Long cnpj;
		@SerializedName("cargo")
		@Expose
		private String cargo;
		@SerializedName("razao_social")
		@Expose
		private String razaoSocial;

		public Long getCnpj() {
			return cnpj;
		}

		public void setCnpj(Long cnpj) {
			this.cnpj = cnpj;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public String getRazaoSocial() {
			return razaoSocial;
		}

		public void setRazaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
		}

	}

	public class ParticipacoesSocio {

		@SerializedName("socio")
		@Expose
		private Socio_ socio;
		@SerializedName("participacoes")
		@Expose
		private List<Participaco> participacoes = null;

		public Socio_ getSocio() {
			return socio;
		}

		public void setSocio(Socio_ socio) {
			this.socio = socio;
		}

		public List<Participaco> getParticipacoes() {
			return participacoes;
		}

		public void setParticipacoes(List<Participaco> participacoes) {
			this.participacoes = participacoes;
		}

	}

	public class RazoesAnteriore {

		@SerializedName("razao_social")
		@Expose
		private String razaoSocial;
		@SerializedName("data_referencia")
		@Expose
		private String dataReferencia;

		public String getRazaoSocial() {
			return razaoSocial;
		}

		public void setRazaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
		}

		public String getDataReferencia() {
			return dataReferencia;
		}

		public void setDataReferencia(String dataReferencia) {
			this.dataReferencia = dataReferencia;
		}

	}

	public class Socio {

		@SerializedName("cnpj")
		@Expose
		private Long cnpj;
		@SerializedName("doc")
		@Expose
		private Long doc;
		@SerializedName("tipo_doc")
		@Expose
		private String tipoDoc;
		@SerializedName("nome")
		@Expose
		private String nome;
		@SerializedName("cargo")
		@Expose
		private String cargo;

		public Long getCnpj() {
			return cnpj;
		}

		public void setCnpj(Long cnpj) {
			this.cnpj = cnpj;
		}

		public Long getDoc() {
			return doc;
		}

		public void setDoc(Long doc) {
			this.doc = doc;
		}

		public String getTipoDoc() {
			return tipoDoc;
		}

		public void setTipoDoc(String tipoDoc) {
			this.tipoDoc = tipoDoc;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

	}

	public class Socio_ {

		@SerializedName("cnpj")
		@Expose
		private Long cnpj;
		@SerializedName("doc")
		@Expose
		private Long doc;
		@SerializedName("tipo_doc")
		@Expose
		private String tipoDoc;
		@SerializedName("nome")
		@Expose
		private String nome;
		@SerializedName("cargo")
		@Expose
		private String cargo;

		public Long getCnpj() {
			return cnpj;
		}

		public void setCnpj(Long cnpj) {
			this.cnpj = cnpj;
		}

		public Long getDoc() {
			return doc;
		}

		public void setDoc(Long doc) {
			this.doc = doc;
		}

		public String getTipoDoc() {
			return tipoDoc;
		}

		public void setTipoDoc(String tipoDoc) {
			this.tipoDoc = tipoDoc;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

	}

	public class Telefone {

		@SerializedName("ddd")
		@Expose
		private Integer ddd;
		@SerializedName("tel")
		@Expose
		private Integer tel;
		@SerializedName("rfb")
		@Expose
		private Boolean rfb;

		public Integer getDdd() {
			return ddd;
		}

		public void setDdd(Integer ddd) {
			this.ddd = ddd;
		}

		public Integer getTel() {
			return tel;
		}

		public void setTel(Integer tel) {
			this.tel = tel;
		}

		public Boolean getRfb() {
			return rfb;
		}

		public void setRfb(Boolean rfb) {
			this.rfb = rfb;
		}

	}
}
