/********************************************************
* Nome: fValidateLength
* Descricao: Verifica se na digitacao o campo ja estourou o tamanho maximo permitido, excluindo "." e ","
* Parametros: 
* oField  - O Objeto do campo
* oLength - O tamanho maximo permitido
*
********************************************************/
function fValidateLength(oField, oLength)
{
	var reg_exp = /,/g;
	var currvalue = oField.value;
	var valorOrigem = oField.value;
	var tamanho = currvalue.length;
	var caracter = currvalue.substring((tamanho-1), tamanho);
		
	if (isNaN(caracter) && caracter != "," && caracter != ".") {
		oField.value = currvalue.substring(0, (tamanho-1));
		return;
	}
	
	if(currvalue != "") {
		var aux = currvalue.replace(reg_exp,'');
		
		reg_exp = /\./g;
		aux = aux.replace(reg_exp,'');
		if (aux != "") {
			if (aux.length > parseInt(oLength)) {
				if (parseInt(aux, 10) != 100000) {
				    if (parseInt(aux, 10) != 10000) {
						currvalue = aux.substring(0, oLength);
					}
				}else{
					currvalue = aux.substring(0, aux.length-1);
				}
			}
		}
	}
	oField.value = currvalue;
	fApplyCurrencyMask(oField);
}

/********************************************************
* Nome: fApplyCurrencyMask
* Descricao: Aplica ao campo a mascara para valores:#.##0,00 .
* Parqmetros: 
* oField - O Objeto do campo
*
********************************************************/
function fApplyCurrencyMask(oField)
{
	var reg_exp = / /g;
	var currvalue = oField.value.replace(reg_exp,'');
	if(currvalue != "")
	{
		reg_exp = /,/g;
		var aux = currvalue.replace(reg_exp,'');
		
		reg_exp = /\./g;
		aux = aux.replace(reg_exp,'');
		if(aux != "")
		{
			if(aux.length == 1)
			{
				currvalue = "0,0" + aux;
			}
			else
			{
				var decimalpos = aux.length - 3;
				var qtdemilhar = 3, auxMilhar = 0;
				currvalue = "";
				for(iCount = aux.length-1; iCount >= 0;iCount--)
				{
					if(iCount == decimalpos)
						currvalue = "," + currvalue;
						
					if(iCount < decimalpos)
						auxMilhar++;
					
					if(auxMilhar == qtdemilhar)
					{
						currvalue = "." + currvalue;
						auxMilhar = 0;
					}

					currvalue = aux.charAt(iCount) + currvalue;
						
				}
				while(currvalue.charAt(0) == "0")
				{
					if(currvalue.charAt(1) != ",")
						currvalue = currvalue.substring(1);
					else
						break;
				}
			}
			
		}
		
	}
	oField.value = currvalue;
}

//-------------------------------------------------------------------
//isDigit(value)
//Returns true if value is a 1-character digit
//-------------------------------------------------------------------
function isDigit(num) {
	var string="1234567890";
	if (string.indexOf(num) != -1) {
		return true;
	}
	return false;
}
	