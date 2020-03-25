package br.com.orpecredit.wscdlrio.negativacao;

public class Incluir {

	private String codigo;
	private String senha;
	private String tipoPessoa;
	private String documento;
	private String codigoRetorno;
	private String mensagemRetorno;
	private String ip;
	private String Observacao;
	private DadosContrato dadosContrato;
	private DadosDevedor dadosDevedor;
	private DadosDocumento dadosDocumento;
	private DadosEndereco dadosEndereco;
	private DadosTelefone dadosTelefone;

	public Incluir() {
		if (dadosContrato == null) {
			dadosContrato = new DadosContrato();
		}
		if (dadosDevedor == null) {
			dadosDevedor = new DadosDevedor();
		}
		if (dadosDocumento == null) {
			dadosDocumento = new DadosDocumento();
		}
		if (dadosEndereco == null) {
			dadosEndereco = new DadosEndereco();
		}
		if (dadosTelefone == null) {
			dadosTelefone = new DadosTelefone();
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

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

	public DadosContrato getDadosContrato() {
		return dadosContrato;
	}

	public void setDadosContrato(DadosContrato dadosContrato) {
		this.dadosContrato = dadosContrato;
	}

	public DadosDevedor getDadosDevedor() {
		return dadosDevedor;
	}

	public void setDadosDevedor(DadosDevedor dadosDevedor) {
		this.dadosDevedor = dadosDevedor;
	}

	public DadosDocumento getDadosDocumento() {
		return dadosDocumento;
	}

	public void setDadosDocumento(DadosDocumento dadosDocumento) {
		this.dadosDocumento = dadosDocumento;
	}

	public DadosEndereco getDadosEndereco() {
		return dadosEndereco;
	}

	public void setDadosEndereco(DadosEndereco dadosEndereco) {
		this.dadosEndereco = dadosEndereco;
	}

	public DadosTelefone getDadosTelefone() {
		return dadosTelefone;
	}

	public void setDadosTelefone(DadosTelefone dadosTelefone) {
		this.dadosTelefone = dadosTelefone;
	}

	public static class DadosContrato {
		private String contrato;
		private String naturezaOperacao;
		private String dataAtTraso;
		private String dataTermino;
		private String valorParcela;
		private String quantidade;
		private String moeda;

		public DadosContrato() {}

		public String getContrato() {
			return contrato;
		}

		public void setContrato(String contrato) {
			this.contrato = contrato;
		}

		public String getNaturezaOperacao() {
			return naturezaOperacao;
		}

		public void setNaturezaOperacao(String naturezaOperacao) {
			this.naturezaOperacao = naturezaOperacao;
		}

		public String getDataAtTraso() {
			return dataAtTraso;
		}

		public void setDataAtTraso(String dataAtTraso) {
			this.dataAtTraso = dataAtTraso;
		}

		public String getDataTermino() {
			return dataTermino;
		}

		public void setDataTermino(String dataTermino) {
			this.dataTermino = dataTermino;
		}

		public String getValorParcela() {
			return valorParcela;
		}

		public void setValorParcela(String valorParcela) {
			this.valorParcela = valorParcela;
		}

		public String getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(String quantidade) {
			this.quantidade = quantidade;
		}

		public String getMoeda() {
			return moeda;
		}

		public void setMoeda(String moeda) {
			this.moeda = moeda;
		}
		
	}

	public static class DadosDevedor {
		private String tipoDevedor;
		private String nome;
		private String dataNascimento;
		private String filiacaoMae;
		private String sexo;
		private String estadoCivil;
		private String naturalidade;
		private String cpf;
		
		public DadosDevedor() {}

		public String getTipoDevedor() {
			return tipoDevedor;
		}

		public void setTipoDevedor(String tipoDevedor) {
			this.tipoDevedor = tipoDevedor;
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

		public String getFiliacaoMae() {
			return filiacaoMae;
		}

		public void setFiliacaoMae(String filiacaoMae) {
			this.filiacaoMae = filiacaoMae;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String getEstadoCivil() {
			return estadoCivil;
		}

		public void setEstadoCivil(String estadoCivil) {
			this.estadoCivil = estadoCivil;
		}

		public String getNaturalidade() {
			return naturalidade;
		}

		public void setNaturalidade(String naturalidade) {
			this.naturalidade = naturalidade;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
	}
	
	public static class DadosDocumento {
		private String numero;
		private String tipo;	
		private String estado;
		
		public DadosDocumento() {}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
		
	}
	
	public static class DadosEndereco {
		private String logradouro;
		private String bairro;
		private String municipio;	
		private String estado;
		private String cep;
		private String tipo;
		
		public DadosEndereco() {}

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

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
	}
	
	public static class DadosTelefone {
		private String ddd1;
		private String numero1;	
		private String ramal1;
		private String tipo1;
		private String ddd2;
		private String numero2;	
		private String ramal2;
		private String tipo2;
		
		public DadosTelefone() {}

		public String getDdd1() {
			return ddd1;
		}

		public void setDdd1(String ddd1) {
			this.ddd1 = ddd1;
		}

		public String getNumero1() {
			return numero1;
		}

		public void setNumero1(String numero1) {
			this.numero1 = numero1;
		}

		public String getRamal1() {
			return ramal1;
		}

		public void setRamal1(String ramal1) {
			this.ramal1 = ramal1;
		}

		public String getTipo1() {
			return tipo1;
		}

		public void setTipo1(String tipo1) {
			this.tipo1 = tipo1;
		}

		public String getDdd2() {
			return ddd2;
		}

		public void setDdd2(String ddd2) {
			this.ddd2 = ddd2;
		}

		public String getNumero2() {
			return numero2;
		}

		public void setNumero2(String numero2) {
			this.numero2 = numero2;
		}

		public String getRamal2() {
			return ramal2;
		}

		public void setRamal2(String ramal2) {
			this.ramal2 = ramal2;
		}

		public String getTipo2() {
			return tipo2;
		}

		public void setTipo2(String tipo2) {
			this.tipo2 = tipo2;
		}
		
	}
	
}


