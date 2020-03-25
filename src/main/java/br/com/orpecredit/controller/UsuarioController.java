package br.com.orpecredit.controller;

import java.io.Serializable;
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

import br.com.orpecredit.entity.Extrato;
import br.com.orpecredit.entity.Produto;
import br.com.orpecredit.entity.Usuario;
import br.com.orpecredit.service.UsuarioService;
import br.com.orpecredit.util.Util;


@Controller
@Scope("session")
public class UsuarioController extends ApplicationSessionController implements Serializable {

	private static final long serialVersionUID = -516687283353835875L;
	
	public String packagePage;
	public String page;
	public Integer widthPopupCrud;
	public Integer heightPopupCrud;
	public Boolean appendToBody = false;

	public UsuarioController() {}
	
	// VARIAVEIS CAMPOS
	private String atualSenha;
	private String novaSenha;
	private String confSenha;
	private int idCliente;
	private String idProduto;
	private Date dataInicial;
	private Date dataFinal;
	private Extrato extrato;
	private List<Produto> listaProduto;
			
	private boolean trocaSenha = Boolean.FALSE;
	
	@Autowired
	@Qualifier("usuarioService")
	private UsuarioService usuarioService;
						
	public Boolean getTrocaSenha() {
		return trocaSenha;
	}

	public void setTrocaSenha(Boolean trocaSenha) {
		this.trocaSenha = trocaSenha;
	}
	
	public String getAtualSenha() {
		return atualSenha;
	}

	public void setAtualSenha(String atualSenha) {
		this.atualSenha = atualSenha;
	}

	public String getNovaSenha() {
		return novaSenha;
	}

	public void setNovaSenha(String novaSenha) {
		this.novaSenha = novaSenha;
	}

	public String getConfSenha() {
		return confSenha;
	}

	public void setConfSenha(String confSenha) {
		this.confSenha = confSenha;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Extrato getExtrato() {
		return extrato;
	}

	public void setExtrato(Extrato extrato) {
		this.extrato = extrato;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}

	public void telaTrocaSenha() {
		packagePage = "trocaSenha";
		page = "consulta";			
		widthPopupCrud = 400;
		heightPopupCrud = 250;
		this.openPopup();
	}
	
	public void salvar() {
		if(!novaSenha.equals(confSenha)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
			"Senha de confirmação esta diferente da senha nova", null));
			return;
		}

		String result = "";
		Usuario usu = new Usuario();

		usu = this.getUsuarioSessao();
		
		if(usu==null) {
			this.logout();
		}
		
		if(!atualSenha.equals(usu.getSenha())) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
			"Senha atual inválida", null));	
			return;
		}
		
		result = usuarioService.consultaUsuario(usu, novaSenha);
		
		if(!result.equals("OK")) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
			result, null));
		}
		this.closePopup();
	}

	private void openPopup() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("draggable", true);
		options.put("resizable", true);
		options.put("contentWidth", widthPopupCrud);
		options.put("contentHeight", heightPopupCrud);
		if (appendToBody)
			options.put("appendToBody", true);

		RequestContext.getCurrentInstance().openDialog("/" + packagePage + "/" + page, options, null);
	}
	
	protected void closePopup() {
		RequestContext.getCurrentInstance().closeDialog("/" + packagePage + "/" + page);
	} 

	public void filtrarLista() {
		Usuario usu = new Usuario();
		
		usu = this.getUsuarioSessao();
		
		if(usu==null) {
			this.logout();
		}
		
		if(Util.diferencaEntreData(dataInicial, dataFinal)>90) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Intervalo do período maior que 90 dias", null));	
		}else {
			setExtrato(usuarioService.extratoConsulta(extrato, usu.getIdCliente(), dataInicial, dataFinal, idProduto));
			if(extrato==null) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"Nenhuma consulta para o período informado", null));	
			}
		}
	}

	public String voltar() {
		limpa();
		return "/index.jsf?faces-redirect=true";
	}

	public void limpa() {
		setDataInicial(null);
		setDataFinal(null);
		setIdCliente(0);
		setIdProduto("0");
		setExtrato(null);
	}
	
	public String telaExtrato() {
		setDataInicial(null);
		setDataFinal(null);
		setIdCliente(0);
		setExtrato(null);
		return "/extratoConsulta/extrato.jsf?faces-redirect=true";
	}
	
	public void buscaProduto() {
		Usuario usu = new Usuario();
		
		usu = this.getUsuarioSessao();
		
		if(usu==null) {
			this.logout();
		}
		
		setListaProduto(usuarioService.listaProduto(usu.getRelacaoProduto()));

		limpa();
	}
}
