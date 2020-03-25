package br.com.orpecredit.entity;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = -148823103648851750L;
	
	private String login;
	private String senha;
	private String relacaoProduto;
	private String status;
	private String nome;
	private String ip;
	private int idCliente;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRelacaoProduto() {
		return relacaoProduto;
	}
	public void setRelacaoProduto(String relacaoProduto) {
		this.relacaoProduto = relacaoProduto;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCliente;
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((relacaoProduto == null) ? 0 : relacaoProduto.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (idCliente != other.idCliente)
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (relacaoProduto == null) {
			if (other.relacaoProduto != null)
				return false;
		} else if (!relacaoProduto.equals(other.relacaoProduto))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", relacaoProduto=" + relacaoProduto + ", status="
				+ status + ", nome=" + nome + ", ip=" + ip + ", idCliente=" + idCliente + "]";
	}
		
}
