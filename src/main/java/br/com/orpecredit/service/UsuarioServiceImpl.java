package br.com.orpecredit.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.orpecredit.entity.Extrato;
import br.com.orpecredit.entity.Produto;
import br.com.orpecredit.entity.Usuario;
import br.com.orpecredit.repository.UsuarioDAO;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public String consultaUsuario(Usuario usu, String novaSenha) {
		return this.usuarioDAO.consultaUsuario(usu, novaSenha);		
	}
	
	@Override
	public Extrato extratoConsulta(Extrato extraro, int idCliente, Date dataInicial, Date dataFinal, String idProduto) {
		return this.usuarioDAO.extratoConsulta(extraro, idCliente, dataInicial, dataFinal, idProduto);		
	}
	
	@Override
	public List<Produto> listaProduto(String relacaoProduto) {
		return this.usuarioDAO.listaProduto(relacaoProduto);		
	}

}
