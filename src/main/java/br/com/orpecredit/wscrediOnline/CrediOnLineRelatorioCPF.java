package br.com.orpecredit.wscrediOnline;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CrediOnLineRelatorioCPF {
	
	@SerializedName("msg")
	@Expose
	private String msg;
	@SerializedName("status")
	@Expose
	private Integer status;
	@SerializedName("cpf")
	@Expose
	private Long cpf;
	@SerializedName("nome")
	@Expose
	private String nome;
	@SerializedName("dt_nascimento")
	@Expose
	private String dtNascimento;
	@SerializedName("nome_mae")
	@Expose
	private String[] nomeMae = null;
	@SerializedName("emails")
	@Expose
	private List<Email> emails = null;
	@SerializedName("telefones")
	@Expose
	private List<Telefone> telefones = null;
	@SerializedName("enderecos")
	@Expose
	private List<Endereco> enderecos = null;
	@SerializedName("participacoes")
	@Expose
	private List<Participaco> participacoes = null;

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

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String[] getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String[] nomeMae) {
		this.nomeMae = nomeMae;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Participaco> getParticipacoes() {
		return participacoes;
	}

	public void setParticipacoes(List<Participaco> participacoes) {
		this.participacoes = participacoes;
	}

	public class Email {

		@SerializedName("email")
		@Expose
		private String email;
		@SerializedName("passagens")
		@Expose
		private String passagens;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassagens() {
			return passagens;
		}

		public void setPassagens(String passagens) {
			this.passagens = passagens;
		}

	}

	public class Endereco {

		@SerializedName("logradouro")
		@Expose
		private String logradouro;
		@SerializedName("numero")
		@Expose
		private String numero;
		@SerializedName("compl")
		@Expose
		private String compl;
		@SerializedName("bairro")
		@Expose
		private String bairro;
		@SerializedName("cidade")
		@Expose
		private String cidade;
		@SerializedName("estado")
		@Expose
		private String estado;
		@SerializedName("cep")
		@Expose
		private String cep;
		@SerializedName("passagens")
		@Expose
		private String passagens;

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

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
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

		public String getPassagens() {
			return passagens;
		}

		public void setPassagens(String passagens) {
			this.passagens = passagens;
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

	public class Telefone {

		@SerializedName("ddd")
		@Expose
		private String ddd;
		@SerializedName("tel")
		@Expose
		private String tel;
		@SerializedName("passagens")
		@Expose
		private String passagens;

		public String getDdd() {
			return ddd;
		}

		public void setDdd(String ddd) {
			this.ddd = ddd;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getPassagens() {
			return passagens;
		}

		public void setPassagens(String passagens) {
			this.passagens = passagens;
		}

	}

}
