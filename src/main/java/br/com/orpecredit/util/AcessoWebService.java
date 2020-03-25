package br.com.orpecredit.util;

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

import br.com.orpecredit.wscdlrio.acerta.SPCAXML;

public class AcessoWebService {
	/*
	public static void main(String[] args) {
		try {
			ServicoAcertaEssencialLocator loc = new ServicoAcertaEssencialLocator();
			ServicoAcertaEssencialPortType soap = loc.getServicoAcertaEssencialHttpSoap11Endpoint();
			AcertaEssencial acerta = (AcertaEssencial) soap.acertaEssencial("00001", "08493296", "74071785772");
			
			System.out.println("**************** : "+acerta.getMensagemRetorno());
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

*/	
	public static void main(String[] args) {
		URL url;
		HttpURLConnection con;
		InputStream is = null;
		BufferedReader br = null;
		SPCAXML acerta = new SPCAXML();
		String resposta = "";
		String solicitacao = "";		
		int HTTP_COD_SUCESSO = 200;		
		
		try {
			solicitacao = "http://localhost:8080/axis2/services/ServicoAcertaEssencial/respostaXML?codigo=00001&senha=08493296&cpf=74071785772";
			
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
			
			System.out.println(resposta);
			
			//Faco o parse aqui xml->classe java				
			JAXBContext jaxbContext = JAXBContext.newInstance(SPCAXML.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			acerta = (SPCAXML) jaxbUnmarshaller.unmarshal(br);

			is.close();
			br.close();
			con.disconnect();
			
			System.out.println(acerta.getRESPOSTA().getRESPOSTARETORNO().getSTATUSRESPOSTA());
			System.out.println(acerta.getRESPOSTA().getRESPOSTARETORNO().getMENSAGEMRESPOSTA());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();			
		} catch (JAXBException e) {
			e.printStackTrace();			
		}
	}

}
