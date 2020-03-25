package br.com.orpecredit.repository;

import java.util.Date;
import java.util.List;

import br.com.orpecredit.entity.Extrato;
import br.com.orpecredit.entity.Produto;
import br.com.orpecredit.entity.Usuario;

public interface UsuarioDAO {
	
	String consultaUsuario(Usuario usu, String novaSenha);
	
	Extrato extratoConsulta(Extrato extrato, int idCliente, Date dataInicial, Date dataFinal, String idProduto);
	
	List<Produto> listaProduto(String relacaoProduto);
}
