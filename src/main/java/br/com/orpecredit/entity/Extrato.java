package br.com.orpecredit.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Extrato implements Serializable {
	
	private static final long serialVersionUID = -148823103648851750L;
	
	private int idCliente;
	private String ip;
	private int codigoProduto;
	private String nomeProduto;
	private String documento;
	private Double valorProduto;
	private Date   dataConsulta;
	private List<Extrato> consultas;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public List<Extrato> getConsultas() {
		return consultas;
	}
	public void setConsultas(List<Extrato> consultas) {
		this.consultas = consultas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoProduto;
		result = prime * result + ((consultas == null) ? 0 : consultas.hashCode());
		result = prime * result + ((dataConsulta == null) ? 0 : dataConsulta.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + idCliente;
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((nomeProduto == null) ? 0 : nomeProduto.hashCode());
		result = prime * result + ((valorProduto == null) ? 0 : valorProduto.hashCode());
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
		Extrato other = (Extrato) obj;
		if (codigoProduto != other.codigoProduto)
			return false;
		if (consultas == null) {
			if (other.consultas != null)
				return false;
		} else if (!consultas.equals(other.consultas))
			return false;
		if (dataConsulta == null) {
			if (other.dataConsulta != null)
				return false;
		} else if (!dataConsulta.equals(other.dataConsulta))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (nomeProduto == null) {
			if (other.nomeProduto != null)
				return false;
		} else if (!nomeProduto.equals(other.nomeProduto))
			return false;
		if (valorProduto == null) {
			if (other.valorProduto != null)
				return false;
		} else if (!valorProduto.equals(other.valorProduto))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Extrato [idCliente=" + idCliente + ", ip=" + ip + ", codigoProduto=" + codigoProduto + ", nomeProduto="
				+ nomeProduto + ", documento=" + documento + ", valorProduto=" + valorProduto + ", dataConsulta="
				+ dataConsulta + ", consultas=" + consultas + "]";
	}
		
}

