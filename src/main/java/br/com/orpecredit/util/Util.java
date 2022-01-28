package br.com.orpecredit.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.axis2.context.MessageContext;

public class Util extends Formatador{	
	
	/**
	 * Verifica se a string esta branco
	 * @param str
	 * @return boolean
	 */
	public static boolean Empty(String str){
		if(str!=null)
			if(str.trim().length()==0) return true;
		return false;
	}
	
	/**
	 * Verifica se str1 esta contida em str
	 * @param str
	 * @param str1
	 * @return boolean
	 */
	public static boolean strstr(String str, String str1){
		if(str.indexOf(str1)>=0)return true;
		return false;
	}
	
	
	public static String copyStr (String src, String trg, int pos){
		int tamSrc    = src.length();
		int tamTrg    = trg.length();
		String trgAnt = trg.substring(0, pos);
		int tamAnt    = trgAnt.length();
		String trgPos = trg.substring(tamAnt+tamSrc,tamTrg);
		
		return (trgAnt+src+trgPos);
	}
	
	public static boolean isnumeric(String str){
		boolean valor = false;
		int i;		        
		int tam;
		
		tam = str.length();
		if (tam == 0)
			return false;

		str.replace(",", "."); //Converte a virgula em ponto.

		for (i=0;i < tam; i++) {
			if(strstr(String.valueOf(str.charAt(i)), ".")){ 
				if (valor==false)
					return false;
			}
			else
				if (isdigit(String.valueOf(str.charAt(i))))
					valor=true;
				else
					return true;
		}
		return valor;
	}
	
	public static boolean isdigit(String val){
		try {  
			int num = Integer.parseInt(val);
			if(num==0){} //So para tirar o warn;
			return true;
		} catch( NumberFormatException ex ) {
			return false;
		} catch( Exception exc ){
			return false;
		}
	}
	
	public static boolean IsZero (String str) {
		if(str==null)
			return true;
		str = str.trim();
		for (int i = 0; i < str.length(); i++) {
			if(!strstr(String.valueOf(str.charAt(i)), "0"))
                return false;
			
		}
		return true;
	}
	
	public static int val (String str, int inicio, int tam){
        String valor = "";
        String c;
        int inteiro;
        int i;
        
		try {
	        zeroEsquerda(valor, tam);

	        for (i=0;i < tam;i++) {
	        	c = String.valueOf(str.charAt(inicio+i));
	        	if (!isdigit(c))
	        		break;

	        	valor += c; // Obtem os numeros.
	        }
			
			inteiro = Integer.parseInt(valor);
			return inteiro;
		} catch( NumberFormatException ex ) {
			return 0;
		} catch( Exception exc ){
			return 0;
		}        
	}

	public static boolean IsCPF (String CPF){
		int i;int j;int d;

		if (CPF.length() == 0) return false;

		if (IsZero(CPF)) return false;

		unformatString(CPF);

		if (!isnumeric(CPF)) return false;

		if (CPF.length() > 11) return false;

		Util.zeroEsquerda(CPF, 11);

		for (i = 10; i <= 11; i++) {
			d = 0;
			for (j = i; j >= 2; j--)
				d += val(CPF, i-j, 1) * j;

			d = (d %= 11) < 2 ? 0 : 11 - d;
			if (val(CPF, i-1, 1) != d)
				return false;
		}

		return true;
	}
	
	public static boolean IsCNPJ (String str){
		int i;int j;int d;

		if (str.length() == 0) return false;

		if (IsZero(str)) return false;

		unformatString(str);

		if (!isnumeric(str)) return false;

		if (str.length() != 14)	return false;

		for (i = 13; i <= 14; i++) {
			d = 0;
			for (j = i; j >= 2; j--)
				d += val(str, i-j, 1) * ((j-2) % 8 + 2);

			d = (d %= 11) < 2 ? 0 : 11 - d;
			if (val(str, i-1, 1) != d)
				return false;
		}
		
		return true;
	}
	
	public static String geraProtocolo(){
	    Calendar calendar = Calendar.getInstance();
	    java.util.Date now = calendar.getTime();
	    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
	    String protocolo;

	    protocolo = currentTimestamp.toString();
	    protocolo = protocolo.replaceAll(" ","");
	    protocolo = protocolo.replaceAll("-","");
	    protocolo = protocolo.replaceAll(":","");

	    Random numRandon = new Random();
	    int numero = numRandon.nextInt(99999);

	    protocolo = protocolo + "." + Integer.toString(numero);

	    return protocolo;
	}
	
	/*
	 * Valida email retorna true se for valido e false se for invalido
	 * 	
	 */
    public static boolean isEmailValid(String email) {
        if ((email == null) || (email.trim().length() == 0))
            return false;

        String emailPattern = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";
        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public static boolean isDateValid(String dateString, String pattern) {   
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            if (sdf.format(sdf.parse(dateString)).equals(dateString))
                return true;
        }catch (ParseException pe) {}
        
        return false;
    }

	/*
	 * Calcula a diferenca entre datas param Date Data menor data maior return int
	 * Num. dias (Aragao)
	 */
	public static int diferencaEntreData(Date dtMenor, Date dtMaior) {
		GregorianCalendar ini = new GregorianCalendar();
		GregorianCalendar fim = new GregorianCalendar();
		float dt1 = 0;
		float dt2 = 0;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			ini.setTime(sdf.parse(Formatter.formatDate(dtMenor, "dd/MM/yyyy")));
			fim.setTime(sdf.parse(Formatter.formatDate(dtMaior, "dd/MM/yyyy")));

			dt1 = ini.getTime().getTime() / 24 / 60 / 60 / 1000;
			dt2 = fim.getTime().getTime() / 24 / 60 / 60 / 1000;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Float(dt2 - dt1).intValue();
	}
	
	/*Uma outra maneira com o spring para obter MD5 - obter a lib spring-core-4.3.14.RELEASE.jar
	 * 
	 *String password = org.springframework.util.DigestUtils.md5DigestAsHex("112233".getBytes());
	 *System.out.println(password);
	 **/
	public static String converteMD5(String source) {
		String hashtext = "";
        MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
	        byte[] messageDigest = md.digest(source.getBytes());
	        BigInteger number = new BigInteger(1, messageDigest);
	        hashtext = number.toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return hashtext.toUpperCase();
	}
	
	public static String lerTag(String tag, String xml) {
		String str = "";
		String tagFin = "";
		int posIni = 0;
		int posFin = 0;
		posIni = xml.indexOf(tag);
		if(posIni > 0) {
			tagFin = "</"+tag.substring(1, tag.length());
			posFin = xml.indexOf(tagFin);
			if(posFin > 0) {
				str = xml.substring(posIni+tag.length(), posFin);
			}
		}
		return str;
	}
	
	public static String gravaTag(String tag, String valorTag, String xml) {
		String tagFin = "";
		String str = "";
		int posIni = 0;
		int posFin = 0;
		posIni = xml.indexOf(tag);
		if(posIni > 0) {
			tagFin = "</"+tag.substring(1, tag.length());
			posFin = xml.indexOf(tagFin);
			if(posFin > 0) {
				str = tag+xml.substring(posIni+tag.length(), posFin)+tagFin;
				valorTag = tag+valorTag+tagFin;
				xml = xml.replace(str, valorTag);
			}
		}
		return xml;
	}
	
    public static String ipRemoto() {
        String ip = "127.0.0.1";
        if(MessageContext.getCurrentMessageContext()!=null) {
                ip = (String) (MessageContext.getCurrentMessageContext()).getProperty(MessageContext.REMOTE_ADDR);
        }
        //Caso seja localhost substituir
        if(ip.equals("0:0:0:0:0:0:0:1")) {
                ip = "127.0.0.1";
        }
        return ip;
    }
    

	/**
	 * Converte caracteres acentuados de uma string para caracteres ASCII
	 * correspondentes. Por exemplo, a string "João fará cinqüenta anos em 2025"
	 * será convertida para "Joao fara cinquenta anos em 2025".
	 * 
	 * @param str
	 *            String a ser convertida.
	 * @return Stringa convertida com caracteres acentudos já substituídos por
	 *         seus correspondentes ASCII.
	 * @throws RuntimeException
	 *             Caso algum caracter não ASCII, que não os acentuados, esteja
	 *             presente na string.
	 */
	public static String toAscii(String str) {
		String de = "áàãâäéèêëíìîïóòõôöúùûüç";
		String para = "aaaaaeeeeiiiiooooouuuuc";
		
		// Transforam string em array de carcteres.
		char[] chars = str.toCharArray();
		// Varre o array
		for (int i = 0; i < chars.length; ++i) {
			// Atribui a variavel ch o caracter da posicao i
			char ch = chars[i];
			// Verifica se o caracter e uma letra maiuscula
			boolean bMaiuscula = Character.isUpperCase(ch);
			// Se for maiuscula converte caracter para minuscula
			if (bMaiuscula) {
				ch = Character.toLowerCase(ch);
			}
			// Verifica se o caracter ch existe na string "de"
			int pos = de.indexOf(ch);
			// Se o caracter for encontrado entao a variavel pos terá a posicao
			// da
			// string "de" onde ele esta
			if (pos >= 0) {
				// Atribui a variavel ch a letra nao acentuada correspondente a
				// partir
				// da string "para"
				ch = para.charAt(pos);
				// Se o caracter era maiuscula converte ch para maiuscula
				if (bMaiuscula) {
					ch = Character.toUpperCase(ch);
				}
				// Substitui no array de caracteres o novo caracter convertido
				chars[i] = ch;
			} else {
				// Se o caracter nao tiver sido encontrado entao vamos verificar
				// que
				// ao menos seja um caracter ascii
				if (ch > 127) {
					// Excecoes RuntimeException e suas filhas nao precisam ser
					// tratadas
					// ou declaradas
					// throw new RuntimeException("Caracter ilegal na posicao "
					// +
					// i + ": '" + chars[i] + "'");

					// Substitui no array de caracteres branco
					chars[i] = ' ';
				}
				// Se o caracter for inferior a 33 (caracter de comunicacao ou
				// controle de impressora) mover branco.
				if (ch < 32) {
					chars[i] = ' ';
				}
			}
		}
		// Retorna nova string baseada no array de caracteres ja com as
		// substituicoes
		return new String(chars);
	}
}