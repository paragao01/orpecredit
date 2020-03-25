package br.com.orpecredit.wscrediOnline;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CrediOnLineChequeCPF {

	@SerializedName("cpf")
	@Expose
	private String cpf;
	@SerializedName("cheques")
	@Expose
	private Cheques cheques;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cheques getCheques() {
		return cheques;
	}

	public void setCheques(Cheques cheques) {
		this.cheques = cheques;
	}

	public class Cheques {

		@SerializedName("status")
		@Expose
		private Integer status;
		@SerializedName("cheques_pf")
		@Expose
		private List<ChequesPf> chequesPf = null;
		@SerializedName("cheques_participacoes")
		@Expose
		private List<ChequesParticipaco> chequesParticipacoes = null;

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<ChequesPf> getChequesPf() {
			return chequesPf;
		}

		public void setChequesPf(List<ChequesPf> chequesPf) {
			this.chequesPf = chequesPf;
		}

		public List<ChequesParticipaco> getChequesParticipacoes() {
			return chequesParticipacoes;
		}

		public void setChequesParticipacoes(List<ChequesParticipaco> chequesParticipacoes) {
			this.chequesParticipacoes = chequesParticipacoes;
		}
	}

	public class ChequesParticipaco {

		@SerializedName("num_cheques")
		@Expose
		private Integer numCheques;
		@SerializedName("data_ultimo_cheque")
		@Expose
		private String dataUltimoCheque;
		@SerializedName("doc")
		@Expose
		private String doc;
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

		public String getDoc() {
			return doc;
		}

		public void setDoc(String doc) {
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

	public class ChequesPf {

		@SerializedName("num_cheques")
		@Expose
		private Integer numCheques;
		@SerializedName("data_ultimo_cheque")
		@Expose
		private String dataUltimoCheque;
		@SerializedName("doc")
		@Expose
		private String doc;
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

		public String getDoc() {
			return doc;
		}

		public void setDoc(String doc) {
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
}
