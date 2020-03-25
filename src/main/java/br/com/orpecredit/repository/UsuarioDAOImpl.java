package br.com.orpecredit.repository;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.orpecredit.entity.Extrato;
import br.com.orpecredit.entity.Produto;
import br.com.orpecredit.entity.Usuario;
import br.com.orpecredit.util.Util;
import br.com.orpecredit.validator.CnpjValidador;
import br.com.orpecredit.validator.CpfValidador;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String consultaUsuario(Usuario usu, String novaSenha) {
		StringBuffer sql = new StringBuffer();

        sql.append("UPDATE Cliente SET Senha=:SenhaNova	\n");
        sql.append(" WHERE CodigoCliente=:CodigoCliente	\n");
        sql.append("   AND Senha=:Senha 				\n");
		
		Query q = this.sessionFactory.getCurrentSession().createSQLQuery(sql.toString());
		q.setParameter("SenhaNova", Util.converteMD5(novaSenha));		
		q.setParameter("CodigoCliente", usu.getLogin());
		q.setParameter("Senha", Util.converteMD5(usu.getSenha()));
				
		if (q.executeUpdate() > 0) {
			return "OK";
		}else {
			usu.setStatus("NOK");
			return "Senha atual não cadastrada";
		}
	}
	
	public Extrato extratoConsulta(Extrato extrato, int idCliente, Date dataInicial, Date dataFinal, String idProduto) {
		StringBuffer sql = new StringBuffer();
		SimpleDateFormat sdf;
		String doc = "";
		List<Extrato> listaExtrato = new ArrayList<>();
		
		/*
		sql.append("Select bil.idCliente, pro.idProduto,     \n");
		sql.append("       pro.Nome, bil.DataConsulta,       \n");
		sql.append("       pro.PrecoAdicional, bil.IPCliente,\n");
		sql.append("       bil.Documento 					 \n");
		sql.append("  From Produto pro, Bilhetagem bil       \n");
		sql.append(" Where bil.DataConsulta>=:DataInicial    \n");
		sql.append("   And bil.DataConsulta<=:DataFinal      \n");
		sql.append("   And bil.idProduto = pro.idProduto     \n");
		sql.append("   And bil.idCliente=:CodigoCliente      \n");
		if(!idProduto.equals("0")) {
			sql.append("   And pro.idProduto=:CodigoProduto  \n");
		}
		
		Query q = this.sessionFactory.getCurrentSession().createSQLQuery(sql.toString());
		q.setParameter("DataInicial", dataInicial);		
		q.setParameter("DataFinal", dataFinal);
		q.setParameter("CodigoCliente", idCliente);
		if(!idProduto.equals("0")) {
			q.setParameter("CodigoProduto", Integer.parseInt(idProduto));
		}
		
		Query q = this.sessionFactory.getCurrentSession().createSQLQuery(sql.toString());
		List<?> resultList = q.list();
		
		if (resultList.size() > 0) {
			BigDecimal bd = null;
			Iterator<?> it = resultList.iterator();
			while (it.hasNext()) {
				Object[] row = (Object[]) it.next();
				extrato = new Extrato();	
				extrato.setIdCliente((int)       row[0]);								
				extrato.setCodigoProduto((int)   row[1]);				
				extrato.setNomeProduto((String)  row[2]);
				extrato.setDataConsulta((Date)   row[3]);
				bd = (BigDecimal) row[4];
				if(bd!=null)
					extrato.setValorProduto((Double) bd.doubleValue());
				extrato.setIp((String)           row[5]);
				doc = (String) row[6];
				if(CpfValidador.validaCPF(doc)) {
					extrato.setDocumento(Util.formataCPF(doc));
				}else if(CnpjValidador.validaCNPJ(doc)){
					extrato.setDocumento(Util.formataCNPJ(doc));
				}
				listaExtrato.add(extrato);
			}	
			extrato.setConsultas(listaExtrato);			
			return extrato;
		}else {
			extrato.setConsultas(null);
			return extrato;
		}
		*/
		String data1 = "";
		String data2 = "";
		
		sdf = new SimpleDateFormat("yyyy-MM-dd 00:01");
		data1 = sdf.format(dataInicial);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd 23:59");
		data2 = sdf.format(dataFinal);

		sql.append("EXEC [IntranetOrpecCredit].[dbo].[spExtratoClientes] :CodigoCliente , :DataInicial , :DataFinal");
		Query q = this.sessionFactory.getCurrentSession().createSQLQuery(sql.toString());
		q.setParameter("CodigoCliente", idCliente);		
		q.setParameter("DataInicial", data1);		
		q.setParameter("DataFinal", data2);

		List<?> resultList = q.list();
		
		if (resultList.size() > 0) {
			Iterator<?> it = resultList.iterator();
			while (it.hasNext()) {
				Object[] row = (Object[]) it.next();
				extrato = new Extrato();
				extrato.setDataConsulta((Date)   row[0]);
				extrato.setNomeProduto((String)  row[1]);
				doc = (String) row[2];
				if(CpfValidador.validaCPF(doc)) {
					extrato.setDocumento(Util.formataCPF(doc));
				}else if(CnpjValidador.validaCNPJ(doc)){
					extrato.setDocumento(Util.formataCNPJ(doc));
				}
				listaExtrato.add(extrato);
			}	
			extrato.setConsultas(listaExtrato);			
			return extrato;
		}else {
			return null;
		}
	}

	public List<Produto> listaProduto(String relacaoProduto) {
		Produto pro = new Produto();
		String sql  = "";
		List<Produto> listaProduto = new ArrayList<>();
		
		relacaoProduto = relacaoProduto.replace("[", "");
		relacaoProduto = relacaoProduto.replace("]", ", ");
		relacaoProduto = "("+relacaoProduto+")";
		relacaoProduto = relacaoProduto.replace(", )", ")");

		sql = "select idProduto, Nome from Produto where idProduto in "+relacaoProduto;
		
		//Caso tenha produtos filhos
		if(relacaoProduto.indexOf("52")>0) {
			sql = sql + " or idTipoProduto = 2";
		}
		
		Query q = this.sessionFactory.getCurrentSession().createSQLQuery(sql);
		List<?> resultList = q.list();
		
		if (resultList.size() > 0) {			
			Iterator<?> it = resultList.iterator();
			while (it.hasNext()) {
				Object[] row = (Object[]) it.next();
				pro = new Produto();
				pro.setIdProduto((String) Integer.toString((int) row[0]));								
				pro.setNomeProduto((String) row[1]);
				listaProduto.add(pro);				
			}
			return listaProduto;
		}else {
			return null;
		}
	}
}
