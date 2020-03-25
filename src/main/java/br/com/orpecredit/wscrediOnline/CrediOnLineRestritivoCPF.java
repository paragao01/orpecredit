package br.com.orpecredit.wscrediOnline;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CrediOnLineRestritivoCPF {

	@SerializedName("cpf")
	@Expose
	private String cpf;
	@SerializedName("protestos")
	@Expose
	private Protestos protestos;
	@SerializedName("titulos")
	@Expose
	private Titulos titulos;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Protestos getProtestos() {
		return protestos;
	}

	public void setProtestos(Protestos protestos) {
		this.protestos = protestos;
	}

	public Titulos getTitulos() {
		return titulos;
	}

	public void setTitulos(Titulos titulos) {
		this.titulos = titulos;
	}

	public class Comportamento {

		@SerializedName("data")
		@Expose
		private String data;
		@SerializedName("qtd")
		@Expose
		private Integer qtd;
		@SerializedName("valor")
		@Expose
		private Double valor;

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Integer getQtd() {
			return qtd;
		}

		public void setQtd(Integer qtd) {
			this.qtd = qtd;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}
	}

	public class Comportamento_ {

		@SerializedName("data")
		@Expose
		private String data;
		@SerializedName("qtd")
		@Expose
		private Integer qtd;
		@SerializedName("valor")
		@Expose
		private Double valor;

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Integer getQtd() {
			return qtd;
		}

		public void setQtd(Integer qtd) {
			this.qtd = qtd;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}
	}

	public class Protestos {

		@SerializedName("status")
		@Expose
		private Boolean status;
		@SerializedName("consta")
		@Expose
		private Boolean consta;
		@SerializedName("resumo")
		@Expose
		private Resumo resumo;
		@SerializedName("registros")
		@Expose
		private List<Registro> registros = null;
		@SerializedName("comportamento")
		@Expose
		private List<Comportamento> comportamento = null;

		public Boolean getStatus() {
			return status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public Boolean getConsta() {
			return consta;
		}

		public void setConsta(Boolean consta) {
			this.consta = consta;
		}

		public Resumo getResumo() {
			return resumo;
		}

		public void setResumo(Resumo resumo) {
			this.resumo = resumo;
		}

		public List<Registro> getRegistros() {
			return registros;
		}

		public void setRegistros(List<Registro> registros) {
			this.registros = registros;
		}

		public List<Comportamento> getComportamento() {
			return comportamento;
		}

		public void setComportamento(List<Comportamento> comportamento) {
			this.comportamento = comportamento;
		}
	}

	public class Registro {

		@SerializedName("data")
		@Expose
		private String data;
		@SerializedName("valor")
		@Expose
		private Double valor;
		@SerializedName("cartorio")
		@Expose
		private String cartorio;
		@SerializedName("cidade")
		@Expose
		private String cidade;
		@SerializedName("uf")
		@Expose
		private String uf;

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}

		public String getCartorio() {
			return cartorio;
		}

		public void setCartorio(String cartorio) {
			this.cartorio = cartorio;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getUf() {
			return uf;
		}

		public void setUf(String uf) {
			this.uf = uf;
		}
	}

	public class Registro_ {

		@SerializedName("data")
		@Expose
		private String data;
		@SerializedName("valor")
		@Expose
		private Double valor;
		@SerializedName("informante")
		@Expose
		private String informante;
		@SerializedName("cidade")
		@Expose
		private String cidade;
		@SerializedName("uf")
		@Expose
		private String uf;
		@SerializedName("contrato")
		@Expose
		private String contrato;
		@SerializedName("data_validade")
		@Expose
		private String dataValidade;
		@SerializedName("entidade_origem")
		@Expose
		private String entidadeOrigem;

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}

		public String getInformante() {
			return informante;
		}

		public void setInformante(String informante) {
			this.informante = informante;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getUf() {
			return uf;
		}

		public void setUf(String uf) {
			this.uf = uf;
		}

		public String getContrato() {
			return contrato;
		}

		public void setContrato(String contrato) {
			this.contrato = contrato;
		}

		public String getDataValidade() {
			return dataValidade;
		}

		public void setDataValidade(String dataValidade) {
			this.dataValidade = dataValidade;
		}

		public String getEntidadeOrigem() {
			return entidadeOrigem;
		}

		public void setEntidadeOrigem(String entidadeOrigem) {
			this.entidadeOrigem = entidadeOrigem;
		}
	}

	public class Resumo {

		@SerializedName("produto")
		@Expose
		private String produto;
		@SerializedName("quantidade")
		@Expose
		private Integer quantidade;
		@SerializedName("valor_total")
		@Expose
		private Double valorTotal;
		@SerializedName("data_ultimo")
		@Expose
		private String dataUltimo;

		public String getProduto() {
			return produto;
		}

		public void setProduto(String produto) {
			this.produto = produto;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public Double getValorTotal() {
			return valorTotal;
		}

		public void setValorTotal(Double valorTotal) {
			this.valorTotal = valorTotal;
		}

		public String getDataUltimo() {
			return dataUltimo;
		}

		public void setDataUltimo(String dataUltimo) {
			this.dataUltimo = dataUltimo;
		}
	}

	public class Resumo_ {

		@SerializedName("produto")
		@Expose
		private String produto;
		@SerializedName("quantidade")
		@Expose
		private Integer quantidade;
		@SerializedName("valor_total")
		@Expose
		private Double valorTotal;
		@SerializedName("data_ultimo")
		@Expose
		private String dataUltimo;

		public String getProduto() {
			return produto;
		}

		public void setProduto(String produto) {
			this.produto = produto;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public Double getValorTotal() {
			return valorTotal;
		}

		public void setValorTotal(Double valorTotal) {
			this.valorTotal = valorTotal;
		}

		public String getDataUltimo() {
			return dataUltimo;
		}

		public void setDataUltimo(String dataUltimo) {
			this.dataUltimo = dataUltimo;
		}
	}

	public class Titulos {

		@SerializedName("status")
		@Expose
		private Boolean status;
		@SerializedName("consta")
		@Expose
		private Boolean consta;
		@SerializedName("resumo")
		@Expose
		private Resumo_ resumo;
		@SerializedName("registros")
		@Expose
		private List<Registro_> registros = null;
		@SerializedName("comportamento")
		@Expose
		private List<Comportamento_> comportamento = null;

		public Boolean getStatus() {
			return status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public Boolean getConsta() {
			return consta;
		}

		public void setConsta(Boolean consta) {
			this.consta = consta;
		}

		public Resumo_ getResumo() {
			return resumo;
		}

		public void setResumo(Resumo_ resumo) {
			this.resumo = resumo;
		}

		public List<Registro_> getRegistros() {
			return registros;
		}

		public void setRegistros(List<Registro_> registros) {
			this.registros = registros;
		}

		public List<Comportamento_> getComportamento() {
			return comportamento;
		}

		public void setComportamento(List<Comportamento_> comportamento) {
			this.comportamento = comportamento;
		}
	}
}
