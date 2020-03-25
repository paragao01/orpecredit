package br.com.orpecredit.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
	
	/**
	* Retorna a Data e Hora corrente 
	*
	* @return java.util.Calendar
	*/
	public static java.util.Calendar getNow() {
		Calendar agora = Calendar.getInstance();
		agora.setTimeInMillis(System.currentTimeMillis());
		return agora;
	}
	
	
	/**
	* Retorna a Data e Hora corrente em string para logs
	*
	* @return java.util.Calendar
	*/
	public static String getNowString() {
		Date agora  = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return sdf.format(agora);
		
	}
	
	/**
	* Converte um java.util.Date para um objeto java.sql.Timestamp. Caso a data seja vazia ou nula,
	* retorna null 
	*
	* @param data java.util.Date
	* @return java.sql.Timestamp
	*/
	public static java.sql.Timestamp parseTimestampSQL(java.util.Date data) {
		if (data == null) {
			return null;
		}
		return new java.sql.Timestamp(data.getTime());
	} 
	
	/**
	* Converte uma String para um objeto java.sql.Date. Caso a String seja vazia ou nula,
	* retorna null - para facilitar em casos onde formulários podem ter campos
	* de datas vazios.
	*
	* @param strData String no formato dd/MM/yyyy a ser formatada
	* @return java.sql.Date
	* @throws Exception Caso a String esteja no formato errado
	*/
	public static Date parseDate(String strData) throws Exception {
		if (strData == null || strData.equals("")) {
			return null;
		}
		java.util.Date date = null;
		try {
			//melhor usar o formato "dd/MM/yy" ao inves de "dd/MM/yyyy" porque 
			//com o "yy" ele já faz a conversao do seculo, por exemplo para o formato
			//"yyyy" se for informado 14 ele converterá para 0014 agora com o formato
			//"yy" se for 14 ele entende que a data é do mesmo seculo ou seja 2014
			DateFormat f = new SimpleDateFormat("dd/MM/yy");
			date = (java.util.Date) f.parse(strData);
		} catch (ParseException e) {
			throw new Exception("Data com formato inválido");
		}
		return date;
	}
	
	/**
	* Converte uma String para um objeto java.sql.Date. Caso a String seja vazia ou nula,
	* retorna null - para facilitar em casos onde formulários podem ter campos
	* de datas vazios.
	*
	* @param strData String no formato a ser formatada
	* @param strFormato String formato a ser aplicado na conversão da data (default "yyyy-MM-dd")
	* @return java.sql.Date
	* @throws Exception Caso a String esteja no formato errado
	*/
	public static Date parseDate(String strData, String strFormato) throws Exception {
		if (strData == null || strData.equals("")) {
			return null;
		}
		if(strFormato == null || strFormato.isEmpty()) {
			strFormato = "yyyy-MM-dd";
		}
		java.util.Date date = null;
		try {
			DateFormat f = new SimpleDateFormat(strFormato);
			date = (java.util.Date) f.parse(strData);
		} catch (ParseException e) {
			throw new Exception("Data com formato inválido");
		}
		return date;
	}
	
	/**
	* Converte um java.util.Date para um objeto java.sql.Date. Caso a data seja vazia ou nula,
	* retorna null 
	*
	* @param data java.util.Date
	* @return java.sql.Date
	*/
	public static java.sql.Date parseDateSQL(java.util.Date data) {
		if (data == null) {
			return null;
		}
		return new java.sql.Date(data.getTime());
	} 
	
	/**
	* Converte uma String para um objeto java.sql.Date. Caso a String seja vazia ou nula,
	* retorna null - para facilitar em casos onde formulários podem ter campos
	* de datas vazios.
	*
	* @param strData String no formato dd/MM/yyyy a ser formatada
	* @return java.sql.Date
	* @throws Exception Caso a String esteja no formato errado
	*/
	public static java.sql.Date parseDateSQL(String strData) throws Exception {
		if (strData == null || strData.equals("")) {
			return null;
		}
		java.util.Date date = null;
		try {
			DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
			date = (java.util.Date) f.parse(strData);
		} catch (ParseException e) {
			throw new Exception("Data com formato inválido");
		}
		return new java.sql.Date(date.getTime());
	}
	
	/**
	* Converte uma String para um objeto java.util.Calendar. Caso a String seja vazia ou nula,
	* retorna null - para facilitar em casos onde formulários podem ter campos de datas vazios.
	*
	* @param strData String no formato dd/MM/yyyy a ser formatada
	* @return java.util.Calendar
	* @throws Exception Caso a String esteja no formato errado
	*/
	public static java.util.Calendar parseStringCalendar(String strData) throws Exception {
		if (strData == null || strData.trim().equals("")) {
			return null;
		}
		java.util.Date date = null;
		try {
			DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
			f.setLenient(false); // aqui o pulo do gato para validação da data   
			date = (java.util.Date) f.parse(strData);
		} catch (ParseException e) {
			throw new Exception("Data inválida");
		}
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
	
	/**
	* Converte uma String para um objeto java.util.Calendar. Caso a String seja vazia ou nula,
	* retorna null - para facilitar em casos onde formulários podem ter campos de datas vazios.
	*
	* @param strData String no formato dd/MM/yyyy a ser formatada
	* @param strHora String no formato hh:m:ss a ser formatada
	* @return java.util.Calendar
	* @throws Exception Caso a String esteja no formato errado
	*/
	public static java.util.Calendar parseStringCalendar(String strData, String strHora) throws Exception {
		if (strData == null || strData.trim().equals("")) {
			return null;
		}
		return parseStringCalendarFormat(strData + " " + strHora, "dd/MM/yyyy HH:mm:ss");
	}

	/**
	* Converte uma String para um objeto java.util.Calendar. Caso a String seja vazia ou nula,
	* retorna null - para facilitar em casos onde formulários podem ter campos de datas vazios.
	*
	* @param strData String no formato a ser formatada
	* @param strFormato String formato a ser aplicado na conversão da data (default "yyyy-MM-dd HH:mm:ss")
	* @return java.util.Calendar
	* @throws Exception Caso a String esteja no formato errado
	*/
	public static java.util.Calendar parseStringCalendarFormat(String strData, String strFormato) throws Exception {
		if (strData == null || strData.trim().equals("")) {
			return null;
		}
		if(strFormato == null || strFormato.isEmpty()) {
			strFormato = "yyyy-MM-dd HH:mm:ss";
		}
		java.util.Date date = null; 
		try {
			DateFormat f = new SimpleDateFormat(strFormato);
			f.setLenient(false); // aqui o pulo do gato para validação da data   
			date = (java.util.Date) f.parse(strData);
		} catch (ParseException e) {
			throw new Exception("Data inválida");
		}
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	/**
	* Converte um objeto java.util.Date para java.util.Calendar. Caso o objeto seja nulo,
	* retorna null - para facilitar em casos onde formulários podem ter campos de datas vazios.
	*
	* @param utilData java.sql.Date
	* @return java.util.Calendar
	*/
	public static java.util.Calendar parseDateCalendar(java.util.Date utilData) {
		if (utilData == null || utilData.toString().trim().equals("")) {
			return null;
		}
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(utilData);
		return cal;
	}
	
	/**
	* Converte um objeto java.sql.Date para java.util.Calendar. Caso o objeto seja nulo,
	* retorna null - para facilitar em casos onde formulários podem ter campos de datas vazios.
	*
	* @param sqlData java.sql.Date
	* @return java.util.Calendar
	*/
	public static java.util.Calendar parseDateCalendar(java.sql.Date sqlData) {
		if (sqlData == null || sqlData.toString().trim().equals("")) {
			return null;
		}
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(sqlData);
		return cal;
	}

	/**
	* Converte um objeto java.util.Calendar para java.sql.Date. Caso o objeto seja nulo,
	* retorna null - para facilitar em casos onde formulários podem ter campos de datas vazios.
	*
	* @param  calDate java.util.Calendar
	* @return java.sql.Date
	*/
	public static java.sql.Date parseCalendarDate(java.util.Calendar calData) {
		if (calData == null || calData.toString().trim().equals("")) {
			return null;
		}
		//System.out.println("calData.getTime().getTime():" + calData.getTime().getTime());
		return new java.sql.Date(calData.getTime().getTime());
		
	}

	/**
	* Converte um objeto java.util.Calendar para String "dd/MM/yyyy". Caso o objeto seja nulo,
	* retorna null - para facilitar em casos onde formulários podem ter campos de datas vazios.
	*
	* @param  calDate java.util.Calendar
	* @return String
	*/
	public static String parseCalendarDateStr(java.util.Calendar calData) {
		if (calData == null || calData.toString().trim().equals("")) {
			return null;
		}
		java.sql.Date data = new java.sql.Date(calData.getTime().getTime());
		return parseDateStr(data, "dd/MM/yyyy");
	}
	
	/**
	* Converte uma data java.util.Calendar para um objeto java.sql.Timestamp. Caso a data seja vazia ou nula,
	* retorna null 
	*
	* @param calData java.util.Calendar 
	* @return java.sql.Timestamp
	*/
	public static java.sql.Timestamp parseTimestampCalendar(java.util.Calendar calData) {
		if (calData == null) {
			return null;
		}
		java.sql.Timestamp sqlData = new java.sql.Timestamp(calData.getTimeInMillis());
		return sqlData ;
	} 
	
	/**
	* Converte uma data java.sql.Timestamp para um objeto java.util.Calendar. Caso a data seja vazia ou nula,
	* retorna null 
	*
	* @param tspData java.sql.Timestamp 
	* @return java.util.Calendar
	*/
	public static java.util.Calendar parseCalendarTimestamp(java.sql.Timestamp tspData) {
		if (tspData == null) {
			return null;
		}
		java.util.Calendar calData = java.util.Calendar.getInstance();
		calData.setTimeInMillis(tspData.getTime());
		return calData ;
	} 
	
	/**
	* Converte uma data java.util.Date para uma String com o formato "dd/MM/yyyy".
	*
	* @param data java.util.Date 
	* @return String "dd/MM/yyyy"
	*/
	public static String parseDateStr(java.util.Date data) {
		return parseDateStr(data, "dd/MM/yyyy");
	}
	
	/**
	 * Compara se duas datas são iguais
	 * @param data1
	 * @param data2
	 * @return
	 */
	public static boolean compareEqual(Calendar data1, Calendar data2) {
		String formato = "yyyyMMddHHmmss";
		if(data1 == null && data2 == null) {
			return true;
		}
		if(data1 == null || data2 == null) {
			return false;
		}
		if(parseCalendarStr(data1, formato).equals(parseCalendarStr(data2,formato))) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	* Converte uma data java.util.Date para uma String com o formato informado. Caso a data seja vazia ou nula,
	* retorna null 
	*
	* @param data java.util.Date 
	* @return String
	*/
	public static String parseDateStr(java.util.Date data, String formato) {
		return parseDateStr(data, formato, new Locale("pt", "BR"));
	}
	public static String parseDateStr(java.util.Date data, String formato, Locale local) {
		if (data == null || data.toString().isEmpty() || formato == null || formato.isEmpty()) {
			return null;
		}
		SimpleDateFormat fd = new SimpleDateFormat(formato, local);
		return fd.format(data);
	}
	
	/**
	* Converte uma data java.util.Calendar para uma String com o formato informado. Caso a data seja vazia ou nula,
	* retorna null 
	*
	* @param data java.util.Date 
	* @return String
	*/
	public static String parseCalendarStr(java.util.Calendar calData, String formato) {
		if (calData == null || calData.toString().trim().equals("")) {
			return null;
		}
		java.sql.Date data = new java.sql.Date(calData.getTime().getTime());
		return parseDateStr(data, formato);
	}

	/**
	* retorna ultimo dia do mes
	* retorna null 
	*
	* @param data java.util.Calendar
	* @return data java.util.Calendar
	*/
	public static java.util.Calendar getUltimoDiaMes(java.util.Calendar calData) {
		if (calData == null || calData.toString().trim().equals("")) {
			return null;
		}
		/* Foi criada uma nova instancia da classe calendar para evitar a utilização por referência
		 * garantindo um novo valor sempre que for solicitada */
		Calendar novaData = Calendar.getInstance();
		novaData.setTimeInMillis(calData.getTimeInMillis());
		novaData.set(Calendar.DAY_OF_MONTH, 1);
		novaData.add(Calendar.MONTH, 1);
		novaData.add(Calendar.DAY_OF_MONTH, -1);
		return novaData;
	}

	/**
	* retorna último dia útil do mês
	* retorna null 
	*
	* @param data java.util.Calendar
	* @return data java.util.Calendar
	*/
	public static java.util.Calendar getUltimoDiaUtilMes(java.util.Calendar calData) {
		Calendar novaData = getUltimoDiaMes(calData);
		if (novaData != null && !novaData.toString().trim().isEmpty()) {
			int diaDaSemana = novaData.get(Calendar.DAY_OF_WEEK);
			 switch (diaDaSemana) {
			 case Calendar.SATURDAY:
				  novaData.add(Calendar.DAY_OF_MONTH, -1);
				  break;
			 case Calendar.SUNDAY:
				  novaData.add(Calendar.DAY_OF_MONTH, -2);
			      break;                             
			 }                                     
		}
		 return novaData;
	}
	
	/**
	* soma ou diminui dia útil
	* retorna null 
	*
	* @param data java.util.Calendar, dia int 
	* @return data java.util.Calendar
	*/
	public static java.util.Calendar getSomaDiaUtil(java.util.Calendar calData, int dia) {
		if (calData == null || calData.toString().trim().equals("")) {
			return null;
		}
		/* Foi criada uma nova instancia da classe calendar para evitar a utilização por referência
		 * garantindo um novo valor sempre que for solicitada */
		Calendar novaData = Calendar.getInstance();
		novaData.setTimeInMillis(calData.getTimeInMillis());
		novaData.add(Calendar.DAY_OF_MONTH, dia);
		int diaDaSemana = novaData.get(Calendar.DAY_OF_WEEK);
		 switch (diaDaSemana) {
		 case Calendar.SATURDAY:
			  if(dia < 0){
				  novaData.add(Calendar.DAY_OF_MONTH, -1);
			  } else {
				  novaData.add(Calendar.DAY_OF_MONTH, 2);
			  }
			  break;
		 case Calendar.SUNDAY:
			  if(dia < 0){
				  novaData.add(Calendar.DAY_OF_MONTH, -2);
			  } else {
				  novaData.add(Calendar.DAY_OF_MONTH, 1);
			  }
		      break;
		 }
		 return novaData;
	}
	
	/**
	* Retorna o número de dias resultante de calData1 - calData2
	* retorna null 
	*
	* @param data java.util.Calendar, java.util.Calendar 
	* @return data java.util.Calendar
	*/
	public static Integer getNumeroDias(java.util.Calendar calData1, java.util.Calendar calData2) {
		if (calData1 == null || calData1.toString().trim().equals("")) {
			return null;
		}
		if (calData2 == null || calData2.toString().trim().equals("")) {
			return null;
		}
		Long numeroDias = 			calData1.getTimeInMillis() / (1000 * 60 * 60 * 24);
		numeroDias 	= numeroDias  - calData2.getTimeInMillis() / (1000 * 60 * 60 * 24);
		return numeroDias.intValue();
	}
	
	/**
	* Retorna data calData1 por extenso
	* Ex.: 15/03/2012 - 15 de março de 2012
	* retorna null 
	*
	* @param data java.util.Calendar 
	* @return String
	*/
	public static String getDataPorExtenso(java.util.Calendar calData) {
		return parseDateStr(parseCalendarDate(calData), "dd' de 'MMMM' de 'yyyy");
	}
}
