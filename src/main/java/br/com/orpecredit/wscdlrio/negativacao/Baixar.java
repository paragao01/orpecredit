package br.com.orpecredit.wscdlrio.negativacao;

public class Baixar {

	private String codigo;
	private String senha;
	private String tipoPessoa;
	private String documento;
	private int idNegativacao;
	private String codigoRetorno;
	private String mensagemRetorno;
	private String ip;
	private DadosBaixa dadosBaixa;

	public Baixar() {
		if (dadosBaixa == null) {
			dadosBaixa = new DadosBaixa();
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
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

	public String getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getMensagemRetorno() {
		return mensagemRetorno;
	}

	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public DadosBaixa getDadosBaixa() {
		return dadosBaixa;
	}

	public void setDadosBaixa(DadosBaixa dadosBaixa) {
		this.dadosBaixa = dadosBaixa;
	}

	public static class DadosBaixa {
		private String contrato;
		private String motivo;
		private String nome;
		private String dataNascimento;
		private String cpf;
		private String documento;
		private String tipoDocumento;		
		private String estado;
		private String dataAtraso;
		private String valorParcela;
		
		public DadosBaixa() {}

		public String getContrato() {
			return contrato;
		}

		public void setContrato(String contrato) {
			this.contrato = contrato;
		}

		public String getMotivo() {
			return motivo;
		}

		public void setMotivo(String motivo) {
			this.motivo = motivo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getDocumento() {
			return documento;
		}

		public void setDocumento(String documento) {
			this.documento = documento;
		}

		public String getTipoDocumento() {
			return tipoDocumento;
		}

		public void setTipoDocumento(String tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getDataAtraso() {
			return dataAtraso;
		}

		public void setDataAtraso(String dataAtraso) {
			this.dataAtraso = dataAtraso;
		}

		public String getValorParcela() {
			return valorParcela;
		}

		public void setValorParcela(String valorParcela) {
			this.valorParcela = valorParcela;
		}
				
	}
	
}
