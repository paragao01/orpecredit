package br.com.orpecredit.service;

import org.springframework.stereotype.Service;

import main.java.br.com.orpecredit.controller.ApplicationSessionController;
import main.java.br.com.orpecredit.entity.ProdutoDefine;
import main.java.br.com.orpecredit.entity.Usuario;
import main.java.br.com.orpecredit.util.wsconexao.ConexaoCdlRio;
import main.java.br.com.orpecredit.util.wsconexao.ConexaoCrediOnline;
import main.java.br.com.orpecredit.wscdlrio.negativacao.Baixar;
import main.java.br.com.orpecredit.wscdlrio.negativacao.Incluir;
import main.java.br.com.orpecredit.wscdlrio.negativacao.Listar;

@Service("consultaService")
public class ConsultaServiceImpl implements ConsultaService{

	private Usuario usu = new Usuario();
	private ApplicationSessionController sessao = new  ApplicationSessionController();
	private ConexaoCdlRio cdlrio = new ConexaoCdlRio();
	private ConexaoCrediOnline crediOnline = new ConexaoCrediOnline();
	
	@Override
	public void consultaLogin() {
	}

	@Override
	public br.com.orpecredit.wscdlrio.acerta.SPCAXML acerta(String cpf, String estado) {
		
		br.com.orpecredit.wscdlrio.acerta.SPCAXML acerta = null;
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			acerta = cdlrio.consultaCdlRioAcerta("[73]", usu.getLogin(), usu.getSenha(), cpf, estado, usu.getIp());
		}
			
		return acerta;
	}

	@Override
	public br.com.orpecredit.wscdlrio.acerta.SPCAXML acertaEssencial(String cpf) {
		
		br.com.orpecredit.wscdlrio.acerta.SPCAXML acerta = null;
		String estado = ""; //Para aproveitar o metodo para todos
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			acerta = cdlrio.consultaCdlRioAcerta("[48]", usu.getLogin(), usu.getSenha(), cpf, estado, usu.getIp());
		}
			
		return acerta;
	}
	
	@Override
	public br.com.orpecredit.wscdlrio.acerta.SPCAXML acertaCadastral(String cpf) {
		
		br.com.orpecredit.wscdlrio.acerta.SPCAXML acerta = null;
		String estado = ""; //Para aproveitar o metodo para todos
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			acerta = cdlrio.consultaCdlRioAcerta("[53]", usu.getLogin(), usu.getSenha(), cpf, estado, usu.getIp());
		}
			
		return acerta;
	}
	
	@Override
	public br.com.orpecredit.wscdlrio.scpcnet.SPCAXML spcnetNacionalCPF(String cpf) {
		
		br.com.orpecredit.wscdlrio.scpcnet.SPCAXML scpcnet = null;
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			scpcnet = cdlrio.consultaCdlRioSpcnet("[24]", usu.getLogin(), usu.getSenha(), cpf, "", usu.getIp());
		}
			
		return scpcnet;
	}
	
	@Override
	public br.com.orpecredit.wscdlrio.scpcnet.SPCAXML spcnetRegionalCPF(String cpf, String estado) {
		
		br.com.orpecredit.wscdlrio.scpcnet.SPCAXML scpcnet = null;
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			scpcnet = cdlrio.consultaCdlRioSpcnet("[1]", usu.getLogin(), usu.getSenha(), cpf, estado, usu.getIp());
		}
			
		return scpcnet;
	}

	@Override
	public br.com.orpecredit.wscdlrio.scpcnet.SPCAXML spcnetNacionalCNPJ(String cnpj) {
		
		br.com.orpecredit.wscdlrio.scpcnet.SPCAXML scpcnet = null;
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			scpcnet = cdlrio.consultaCdlRioSpcnet("[47]", usu.getLogin(), usu.getSenha(), cnpj, "", usu.getIp());
		}
			
		return scpcnet;
	}
	
	@Override
	public br.com.orpecredit.wscdlrio.scpcnet.SPCAXML spcnetRegionalCNPJ(String cnpj, String estado) {
		
		br.com.orpecredit.wscdlrio.scpcnet.SPCAXML scpcnet = null;
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			scpcnet = cdlrio.consultaCdlRioSpcnet("[40]", usu.getLogin(), usu.getSenha(), cnpj, estado, usu.getIp());
		}
			
		return scpcnet;
	}

	@Override
	public String crediOnlineCPF(String cpf) {
		
		String retorno = null;
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			retorno = crediOnline.consultaRelatorioCPF("[60]", usu.getLogin(), usu.getSenha(), cpf, usu.getIp());
		}
			
		return retorno;
	}

	@Override
	public String crediOnlineCNPJ(String cnpj) {
		
		String retorno = null;
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			retorno = crediOnline.consultaRelatorioCNPJ("[55]", usu.getLogin(), usu.getSenha(), cnpj, usu.getIp());
		}
			
		return retorno;
	}
	
	@Override
	public br.com.orpecredit.wscdlrio.define.SPCAXML defineRisco(String cnpj, ProdutoDefine pd, String produto) {
		
		br.com.orpecredit.wscdlrio.define.SPCAXML defineRisco = null;
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			if(produto.equals("[52]")) {
				defineRisco = cdlrio.consultaCdlRioDefine(produto, usu.getLogin(), usu.getSenha(), cnpj, pd, usu.getIp());
			}else if(produto.equals("[74]")) {
				defineRisco = cdlrio.consultaCdlRioDefine(produto, usu.getLogin(), usu.getSenha(), cnpj, pd, usu.getIp());
			}
		}
			
		return defineRisco;
	}

	@Override
	public br.com.orpecredit.wscdlrio.define.SPCAXML defineCadastro(String cnpj, ProdutoDefine pd) {
		
		br.com.orpecredit.wscdlrio.define.SPCAXML defineCadastro = null;
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			defineCadastro = cdlrio.consultaCdlRioDefine("[71]", usu.getLogin(), usu.getSenha(), cnpj, pd, usu.getIp());
		}
			
		return defineCadastro;
	}
	
	@Override
	public br.com.orpecredit.wscdlrio.negativacao.Incluir negativacaoIncluir(Incluir inc) {
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			inc.setCodigo(usu.getLogin());
			inc.setSenha(usu.getSenha());
			inc.setIp(usu.getIp());
			inc = (Incluir) cdlrio.negativacao("I", inc);
		}
		return inc;
	}

	@Override
	public br.com.orpecredit.wscdlrio.negativacao.Baixar negativacaoBaixar(Baixar bai) {
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			bai.setCodigo(usu.getLogin());
			bai.setSenha(usu.getSenha());
			bai.setIp(usu.getIp());
			bai = (Baixar) cdlrio.negativacao("B", bai);
		}
		return bai;
	}

	@Override
	public br.com.orpecredit.wscdlrio.negativacao.Listar negativacaoListar(Listar lis) {
		
		usu = (Usuario) sessao.getUsuarioSessao();
		
		if(usu != null) {
			lis.setCodigo(usu.getLogin());
			lis.setSenha(usu.getSenha());
			lis.setIp(usu.getIp());
			lis = (Listar) cdlrio.negativacao("L", lis);
		}
		return lis;
	}
	
}
