package br.com.orpecredit.service;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.orpecredit.entity.Extrato;
import br.com.orpecredit.entity.Produto;
import br.com.orpecredit.entity.Usuario;

public interface UsuarioService {

	@Transactional(readOnly = true)
	String consultaUsuario(Usuario usu, String novaSenha);
	
	@Transactional(readOnly = true)
	Extrato extratoConsulta(Extrato extrato, int idCliente, Date dataInicial, Date dataFinal, String idProduto);
	
	@Transactional(readOnly = true)
	List<Produto> listaProduto(String relacaoProduto);
	
}
