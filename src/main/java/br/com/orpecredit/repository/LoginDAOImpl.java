package br.com.orpecredit.repository;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.orpecredit.entity.Usuario;
import br.com.orpecredit.util.Util;

@Repository
public class LoginDAOImpl implements LoginDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Usuario consultaLogin(Usuario usu) {
		StringBuffer sql = new StringBuffer();

        sql.append("SELECT Cliente.idCliente, Cliente.NomeFantasia, Produto.idProduto, Cliente.Senha, 					\n");
        sql.append("       Produto.codigoProdutoFornecedor, Produto.fornecedor                                       \n");        
        sql.append("  FROM Produto                                                                                      \n");
        sql.append(" INNER JOIN ProdutoPlano ON Produto.idProduto = ProdutoPlano.idProduto                              \n");
        sql.append(" INNER JOIN ClienteProdutoPlano ON ProdutoPlano.idProdutoPlano = ClienteProdutoPlano.idProdutoPlano \n");
        sql.append(" INNER JOIN Cliente ON ClienteProdutoPlano.idCliente = Cliente.idCliente                            \n");
        sql.append(" WHERE Cliente.CodigoCliente=:Cliente.CodigoCliente                                                 \n");
        sql.append("   AND Cliente.Senha=:Cliente.Senha                                                                 \n");
		
		Query q = this.sessionFactory.getCurrentSession().createSQLQuery(sql.toString());
		q.setParameter("Cliente.CodigoCliente", usu.getLogin());
		q.setParameter("Cliente.Senha", Util.converteMD5(usu.getSenha()));
		List<?> resultList = q.list();
		
		if (resultList.size() > 0) {
			String idProduto = "";			
			Iterator<?> it = resultList.iterator();
			while (it.hasNext()) {
				Object[] row = (Object[]) it.next();
				usu.setIdCliente((int) row[0]);				
				usu.setNome((String) row[1]);
				idProduto += "["+String.valueOf(row[2])+"]";
			}
			
			usu.setStatus("OK");
			usu.setRelacaoProduto(idProduto);
			return usu;
		}else {
			usu.setStatus("NOK");
			return usu;
		}
	}
}
