package br.com.orpecredit.entity;

import java.io.Serializable;

public class ProdutoDefine implements Serializable {

	private static final long serialVersionUID = -148823103648851750L;

	private String cmc7;
	private String banco;
	private String agencia;
	private String numConta;
	private String digConta;
	private String numCheque;
	private String digCheque;
	private String qtdeCheque;
	private String entradaCheque;	
	private String dataCheque;
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
	
	public String getCmc7() {
		return cmc7;
	}
	public void setCmc7(String cmc7) {
		this.cmc7 = cmc7;
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
	public String getEntradaCheque() {
		return entradaCheque;
	}
	public void setEntradaCheque(String entradaCheque) {
		this.entradaCheque = entradaCheque;
	}
	public String getDataCheque() {
		return dataCheque;
	}
	public void setDataCheque(String dataCheque) {
		this.dataCheque = dataCheque;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + ((banco == null) ? 0 : banco.hashCode());
		result = prime * result + ((cmc7 == null) ? 0 : cmc7.hashCode());
		result = prime * result + ((dataCheque == null) ? 0 : dataCheque.hashCode());
		result = prime * result + ((digCheque == null) ? 0 : digCheque.hashCode());
		result = prime * result + ((digConta == null) ? 0 : digConta.hashCode());
		result = prime * result + ((entradaCheque == null) ? 0 : entradaCheque.hashCode());
		result = prime * result + ((numCheque == null) ? 0 : numCheque.hashCode());
		result = prime * result + ((numConta == null) ? 0 : numConta.hashCode());
		result = prime * result + ((qtdeCheque == null) ? 0 : qtdeCheque.hashCode());
		result = prime * result + (valor0 ? 1231 : 1237);
		result = prime * result + (valor1 ? 1231 : 1237);
		result = prime * result + (valor2 ? 1231 : 1237);
		result = prime * result + (valor3 ? 1231 : 1237);
		result = prime * result + (valor4 ? 1231 : 1237);
		result = prime * result + (valor5 ? 1231 : 1237);
		result = prime * result + (valor6 ? 1231 : 1237);
		result = prime * result + (valor7 ? 1231 : 1237);
		result = prime * result + (valor8 ? 1231 : 1237);
		result = prime * result + (valor9 ? 1231 : 1237);
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
		ProdutoDefine other = (ProdutoDefine) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (banco == null) {
			if (other.banco != null)
				return false;
		} else if (!banco.equals(other.banco))
			return false;
		if (cmc7 == null) {
			if (other.cmc7 != null)
				return false;
		} else if (!cmc7.equals(other.cmc7))
			return false;
		if (dataCheque == null) {
			if (other.dataCheque != null)
				return false;
		} else if (!dataCheque.equals(other.dataCheque))
			return false;
		if (digCheque == null) {
			if (other.digCheque != null)
				return false;
		} else if (!digCheque.equals(other.digCheque))
			return false;
		if (digConta == null) {
			if (other.digConta != null)
				return false;
		} else if (!digConta.equals(other.digConta))
			return false;
		if (entradaCheque == null) {
			if (other.entradaCheque != null)
				return false;
		} else if (!entradaCheque.equals(other.entradaCheque))
			return false;
		if (numCheque == null) {
			if (other.numCheque != null)
				return false;
		} else if (!numCheque.equals(other.numCheque))
			return false;
		if (numConta == null) {
			if (other.numConta != null)
				return false;
		} else if (!numConta.equals(other.numConta))
			return false;
		if (qtdeCheque == null) {
			if (other.qtdeCheque != null)
				return false;
		} else if (!qtdeCheque.equals(other.qtdeCheque))
			return false;
		if (valor0 != other.valor0)
			return false;
		if (valor1 != other.valor1)
			return false;
		if (valor2 != other.valor2)
			return false;
		if (valor3 != other.valor3)
			return false;
		if (valor4 != other.valor4)
			return false;
		if (valor5 != other.valor5)
			return false;
		if (valor6 != other.valor6)
			return false;
		if (valor7 != other.valor7)
			return false;
		if (valor8 != other.valor8)
			return false;
		if (valor9 != other.valor9)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ProdutoDefine [cmc7=" + cmc7 + ", banco=" + banco + ", agencia=" + agencia + ", numConta=" + numConta
				+ ", digConta=" + digConta + ", numCheque=" + numCheque + ", digCheque=" + digCheque + ", qtdeCheque="
				+ qtdeCheque + ", entradaCheque=" + entradaCheque + ", dataCheque=" + dataCheque + ", valor0=" + valor0
				+ ", valor1=" + valor1 + ", valor2=" + valor2 + ", valor3=" + valor3 + ", valor4=" + valor4
				+ ", valor5=" + valor5 + ", valor6=" + valor6 + ", valor7=" + valor7 + ", valor8=" + valor8
				+ ", valor9=" + valor9 + "]";
	}

}
