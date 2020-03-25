package br.com.orpecredit.util.wsconexao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConexaoCrediOnline {
	
	private String endereco = "http://localhost:8080";
	//private String endereco = "http://webservices.orpecredit.com.br";
	
	public String consultaRelatorioCPF(String produto, String codigo, String senha, String cpf, String ip) {
		URL url;
		HttpURLConnection con;
		BufferedReader br = null;
		String resposta = "";
		String solicitacao = "";		
		int HTTP_COD_SUCESSO = 200;		
		
		try {
			solicitacao = endereco+"/axis2/services/ServicoOrpecPessoal/respostaJSON"+		
						  "?codigo=" + codigo +
						  "&senha=" + senha +
						  "&cpf="+cpf+
						  "&ip=" +ip;
			
            url = new URL(solicitacao);
            con = (HttpURLConnection) url.openConnection();
			
			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				System.out.println("ERRO: HTTP error code : "+con.getResponseCode());
			}

            br = new BufferedReader(new InputStreamReader((con.getInputStream())));

            String line;
            while ((line = br.readLine()) != null) {
                    resposta += line.trim();
            }
			
			resposta = resposta.replace("<ns:respostaJSONResponse xmlns:ns=\"http://servico.wsorpec.br\"><ns:return>", "");
			resposta = resposta.replace("</ns:return></ns:respostaJSONResponse>", "");
			resposta = resposta.replace("&lt;", "<");
			resposta = resposta.replace("&gt;", ">");
			
            br.close();
            con.disconnect();
						
		} catch (MalformedURLException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();			
		}
		return resposta;
	}

	public String consultaRelatorioCNPJ(String produto, String codigo, String senha, String cnpj, String ip) {
		URL url;
		HttpURLConnection con;
		BufferedReader br = null;
		String resposta = "";
		String solicitacao = "";		
		int HTTP_COD_SUCESSO = 200;		
		
		try {
			solicitacao = endereco+"/axis2/services/ServicoOrpecEmpresarial/respostaJSON"+
						  "?codigo=" + codigo +
						  "&senha=" + senha +
						  "&cnpj="+cnpj+
						  "&ip=" +ip;
			
            url = new URL(solicitacao);
            con = (HttpURLConnection) url.openConnection();
			
			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				System.out.println("ERRO: HTTP error code : "+con.getResponseCode());
			}

            br = new BufferedReader(new InputStreamReader((con.getInputStream())));

            String line;
            while ((line = br.readLine()) != null) {
                    resposta += line.trim();
            }
			
			resposta = resposta.replace("<ns:respostaJSONResponse xmlns:ns=\"http://servico.wsorpec.br\"><ns:return>", "");
			resposta = resposta.replace("</ns:return></ns:respostaJSONResponse>", "");
			resposta = resposta.replace("&lt;", "<");
			resposta = resposta.replace("&gt;", ">");
			
            br.close();
            con.disconnect();
						
		} catch (MalformedURLException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();			
		}
		return resposta;
	}

}
