package br.com.orpecredit.util.wsconexao;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.orpecredit.entity.ProdutoDefine;
import br.com.orpecredit.util.Util;
import br.com.orpecredit.wscdlrio.negativacao.Baixar;
import br.com.orpecredit.wscdlrio.negativacao.Incluir;
import br.com.orpecredit.wscdlrio.negativacao.Listar;
import br.com.orpecredit.wscdlrio.negativacao.Listar.ListaDocumentos;

public class ConexaoCdlRio {

	private String endereco = "http://localhost:8080";
	//private String endereco = "http://webservices.orpecredit.com.br";
	
	public br.com.orpecredit.wscdlrio.acerta.SPCAXML consultaCdlRioAcerta(String produto, String codigo, String senha, String cpf, String ip) {
		URL url;
		HttpURLConnection con;
		InputStream is = null;
		BufferedReader br = null;
		br.com.orpecredit.wscdlrio.acerta.SPCAXML acerta = null;
		String resposta = "";
		String solicitacao = "";
		int HTTP_COD_SUCESSO = 200;		

		try {
			if(produto.equals("[48]")) {
				solicitacao = endereco+"/axis2/services/ServicoPessoalGold/respostaXML"+
							  "?codigo=" + codigo +
							  "&senha=" + senha +
							  "&cpf="+ cpf +
							  "&ip=" +ip;
			}else if(produto.equals("[53]")) {
				solicitacao = endereco+"/axis2/services/ServicoBuscaEndTelefoneCpf/respostaXML"+
						  "?codigo=" + codigo +
						  "&senha=" + senha +
						  "&cpf="+cpf +
						  "&ip=" +ip;
			}
			url = new URL(solicitacao);
			con = (HttpURLConnection) url.openConnection();
			
			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				System.out.println("HTTP error code : "+con.getResponseCode());;
			}

			br = new BufferedReader(new InputStreamReader((con.getInputStream())));

			String line;
			while ((line = br.readLine()) != null) {
				resposta += line.trim();
			}
			
			resposta = resposta.replace("<ns:respostaXMLResponse xmlns:ns=\"http://servico.wsorpec.br\"><ns:return>&lt;SPCA-XML>", "<SPCA-XML>");
			resposta = resposta.replace("</ns:return></ns:respostaXMLResponse>", "");
			resposta = resposta.replace("&lt;", "<");
			resposta = resposta.replace("&gt;", ">");
			
			is = new ByteArrayInputStream(resposta.getBytes());
			br = new BufferedReader(new InputStreamReader(is));
			
			//Faco o parse aqui xml->classe java				
			JAXBContext jaxbContext = JAXBContext.newInstance(br.com.orpecredit.wscdlrio.acerta.SPCAXML.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			acerta = (br.com.orpecredit.wscdlrio.acerta.SPCAXML) jaxbUnmarshaller.unmarshal(br);

			is.close();
			br.close();
			con.disconnect();
						
		} catch (MalformedURLException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();			
		} catch (JAXBException e) {
			e.printStackTrace();			
		}
		return acerta;
	}
	
	public br.com.orpecredit.wscdlrio.scpcnet.SPCAXML consultaCdlRioSpcnet(String produto, String codigo, String senha, String doc, String estado, String ip) {
		URL url;
		HttpURLConnection con;
		InputStream is = null;
		BufferedReader br = null;
		br.com.orpecredit.wscdlrio.scpcnet.SPCAXML scpcnet = null;
		String resposta = "";
		String solicitacao = "";		
		int HTTP_COD_SUCESSO = 200;		
		
		try {
			if(produto.equals("[24]")) {
				solicitacao = endereco+"/axis2/services/ServicoSpcNetNacionalCpf/respostaXML"+
							  "?codigo=" + codigo +
							  "&senha=" + senha +
							  "&cpf="+doc+
							  "&ip=" +ip;
			}else if(produto.equals("[1]")) {
				solicitacao = endereco+"/axis2/services/ServicoSpcNetEstadualCpf/respostaXML"+
						  	  "?codigo=" + codigo +
						  	  "&senha=" + senha +
						  	  "&cpf="+doc+
						  	  "&uf="+estado+
							  "&ip=" +ip;
			}else if(produto.equals("[47]")) {
				solicitacao = endereco+"/axis2/services/ServicoSpcNetNacionalCnpj/respostaXML"+
					  	  "?codigo=" + codigo +
					  	  "&senha=" + senha +
					  	  "&cnpj="+doc+
						  "&ip=" +ip;
			}else if(produto.equals("[40]")) {
				solicitacao = endereco+"/axis2/services/ServicoSpcNetEstadualCnpj/respostaXML"+
					  	  "?codigo=" + codigo +
					  	  "&senha=" + senha +
					  	  "&cnpj="+doc+
					  	  "&uf="+estado+
						  "&ip=" +ip;
			}
			url = new URL(solicitacao);
			con = (HttpURLConnection) url.openConnection();
			
			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				System.out.println("ERRO: HTTP error code : "+con.getResponseCode());;
			}

			br = new BufferedReader(new InputStreamReader((con.getInputStream())));

			String line;
			while ((line = br.readLine()) != null) {
				resposta += line.trim();
			}
			resposta = resposta.replace("<ns:respostaXMLResponse xmlns:ns=\"http://servico.wsorpec.br\"><ns:return>&lt;SPCA-XML>", "<SPCA-XML>");
			resposta = resposta.replace("</ns:return></ns:respostaXMLResponse>", "");
			resposta = resposta.replace("&lt;", "<");
			resposta = resposta.replace("&gt;", ">");
			
			is = new ByteArrayInputStream(resposta.getBytes());
			br = new BufferedReader(new InputStreamReader(is));
						
			//Faco o parse aqui xml->classe java				
			JAXBContext jaxbContext = JAXBContext.newInstance(br.com.orpecredit.wscdlrio.scpcnet.SPCAXML.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			scpcnet = (br.com.orpecredit.wscdlrio.scpcnet.SPCAXML) jaxbUnmarshaller.unmarshal(br);

			is.close();
			br.close();
			con.disconnect();
						
		} catch (MalformedURLException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();			
		} catch (JAXBException e) {
			e.printStackTrace();			
		}
		return scpcnet;
	}
	
	public br.com.orpecredit.wscdlrio.define.SPCAXML consultaCdlRioDefine(String produto, 
																		  String codigo, 
																		  String senha, 
																		  String cnpj, 
																		  ProdutoDefine pd,
																		  String ip) {
		URL url;
		HttpURLConnection con = null;
		InputStream is = null;
		BufferedReader br = null;
		br.com.orpecredit.wscdlrio.define.SPCAXML define = null;
		String resposta = "";
		String solicitacao = "";
		int HTTP_COD_SUCESSO = 200;		

		try {
			if(produto.equals("[52]")) {
				solicitacao = endereco+"/axis2/services/ServicoEmpresarialGold/respostaXML"+
							  "?codigo="+codigo+
							  "&senha="+senha+
							  "&cnpj="+cnpj;
				if(pd.isValor8()) {
					solicitacao +="&banco="+pd.getBanco()+
							  	  "&agencia="+pd.getAgencia()+
							  	  "&numConta="+pd.getNumConta()+
							  	  "&dvConta="+pd.getDigConta()+
							  	  "&numCheque="+pd.getNumCheque()+
							  	  "&dvCheque="+pd.getDigCheque()+
							  	  "&cmc7="+pd.getCmc7()+
							  	  "&chequeOrigem="+(pd.getEntradaCheque().equals("1")?"D":"C")+
							  	  "&qtdeCheque="+pd.getQtdeCheque()+
							  	  "&dataCheque="+pd.getDataCheque();
				} else {
					solicitacao +="&banco=&agencia=&numConta=&dvConta=&numCheque="+
							      "&dvCheque=&cmc7=&chequeOrigem=&qtdeCheque=&dataCheque=";
				}
				solicitacao += "&quadroSocial="+(pd.isValor0()?"S":"N")+
							   "&quadroSocialRestricao="+(pd.isValor3()?"S":"N")+
							   "&participacoes="+(pd.isValor6()?"S":"N")+
							   "&participacoesRestricao="+(pd.isValor9()?"S":"N")+
							   "&decisao="+(pd.isValor1()?"S":"N")+							  
							   "&faturamentoPresumido="+(pd.isValor4()?"S":"N")+
							   "&limiteCredito="+(pd.isValor7()?"S":"N")+
							   "&anvisa="+(pd.isValor2()?"S":"N")+
							   "&empresaMesmoEndereco="+(pd.isValor5()?"S":"N")+
							   "&cheque="+(pd.isValor8()?"S":"N")+
							   "&ip=" +ip;
			} else if(produto.equals("[71]")) {
				solicitacao = endereco+"/axis2/services/ServicoBuscaEndTelefoneCnpj/respostaXML"+
						  	  "?codigo="+codigo+
						  	  "&senha="+senha+
						  	  "&cnpj="+cnpj+
						  	  "&ip=" +ip;
			}
			
			url = new URL(solicitacao);
			con = (HttpURLConnection) url.openConnection();

			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				System.out.println("HTTP error code : "+con.getResponseCode());;
			}

			br = new BufferedReader(new InputStreamReader((con.getInputStream())));

			String line;
			while ((line = br.readLine()) != null) {
				resposta += line.trim();
			}
			
			resposta = resposta.replace("<ns:respostaXMLResponse xmlns:ns=\"http://servico.wsorpec.br\"><ns:return>&lt;SPCA-XML>", "<SPCA-XML>");
			resposta = resposta.replace("</ns:return></ns:respostaXMLResponse>", "");
			resposta = resposta.replace("&lt;", "<");
			resposta = resposta.replace("&gt;", ">");
			
			is = new ByteArrayInputStream(resposta.getBytes());
			br = new BufferedReader(new InputStreamReader(is));
			
			//Faco o parse aqui xml->classe java				
			JAXBContext jaxbContext = JAXBContext.newInstance(br.com.orpecredit.wscdlrio.define.SPCAXML.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			define = (br.com.orpecredit.wscdlrio.define.SPCAXML) jaxbUnmarshaller.unmarshal(br);

			is.close();
			br.close();
			con.disconnect();
						
		} catch (MalformedURLException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();			
		} catch (JAXBException e) {
			e.printStackTrace();			
		}
		return define;
	}

	public Object negativacao(String produto, Object obj) {
		URL url;
		HttpURLConnection con;
		BufferedReader br = null;
		XStream stream = new XStream(new DomDriver());
		String resposta = "";
		String solicitacao = "";
		String xml = "";
		int HTTP_COD_SUCESSO = 200;		

		try {
			if(produto.equals("I")) {			
				Incluir inc = new Incluir();
				inc = (Incluir) obj;
				stream.alias("Incluir", Incluir.class);
				xml = stream.toXML(inc);
				xml = xml.replace("\n", "");
				xml = xml.replace(">  <", "><");
				xml = xml.replace(">    <", "><");
				xml = xml.replace(" ", "%20");				
				/*Substitui os caracteres especiais*/
				xml = Util.toAscii(xml);
				
				solicitacao = endereco+"/axis2/services/ServicoNegativacao/incluir?xml="+xml;
			}else if(produto.equals("B")) {
				Baixar bai = new Baixar();
				bai = (Baixar) obj;
				stream.alias("Baixar", Baixar.class);
				xml = stream.toXML(bai);
				xml = xml.replace("\n", "");
				xml = xml.replace(">  <", "><");
				xml = xml.replace(">    <", "><");
				xml = xml.replace(" ", "%20");

				solicitacao = endereco+"/axis2/services/ServicoNegativacao/baixar?xml="+xml;
			}else if(produto.equals("L")) {
				Listar lis = new Listar();
				lis = (Listar) obj;
				stream.alias("Listar", Listar.class);
				stream.alias("ListaDocumentos", ListaDocumentos.class);
				xml = stream.toXML(lis);
				xml = xml.replace("\n", "");
				xml = xml.replace(">  <", "><");
				xml = xml.replace(">    <", "><");
				xml = xml.replace(">      <", "><");
				xml = xml.replace(">        <", "><");				
				xml = xml.replace(" ", "%20");
				
				solicitacao = endereco+"/axis2/services/ServicoNegativacao/listar?xml="+xml;
			}
			
			url = new URL(solicitacao);
			con = (HttpURLConnection) url.openConnection();
			
			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				System.out.println("HTTP error code : "+con.getResponseCode());
			}

			br = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String line;
			while ((line = br.readLine()) != null) {
				resposta += line.trim();
			}
						
			if(produto.equals("I")) {
				resposta = resposta.replace("<ns:incluirResponse xmlns:ns=\"http://servico.wsorpec.br\"><ns:return>", "");				
				resposta = resposta.replace("&lt;", "<");
				resposta = resposta.replace("&gt;", ">");				
				resposta = resposta.replace("</ns:return></ns:incluirResponse>", "");
				resposta = resposta.replace("%20", " ");
				
				stream.alias("Incluir", Incluir.class);
				obj = (Incluir) stream.fromXML(resposta);
			}else if(produto.equals("B")) {
				resposta = resposta.replace("<ns:baixarResponse xmlns:ns=\"http://servico.wsorpec.br\"><ns:return>", "");				
				resposta = resposta.replace("&lt;", "<");
				resposta = resposta.replace("&gt;", ">");				
				resposta = resposta.replace("</ns:return></ns:baixarResponse>", "");
				resposta = resposta.replace("%20", " ");
				
				stream.alias("Baixar", Baixar.class);
				obj = (Baixar) stream.fromXML(resposta);
			}else if(produto.equals("L")) {
				resposta = resposta.replace("<ns:listarResponse xmlns:ns=\"http://servico.wsorpec.br\"><ns:return>", "");				
				resposta = resposta.replace("&lt;", "<");
				resposta = resposta.replace("&gt;", ">");				
				resposta = resposta.replace("</ns:return></ns:listarResponse>", "");
				resposta = resposta.replace("%20", " ");

				stream.alias("listar", Listar.class);
				stream.alias("ListaDocumentos", ListaDocumentos.class);
				obj = (Listar) stream.fromXML(resposta);
			}
			
			br.close();
			con.disconnect();
						
		} catch (MalformedURLException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();			
		}
		return obj;
	}
	
}
