// JavaScript Document // JAVASCRIPT PARA CARPOOLING
function validar(formulario)
{

	//valida patente
	  if (formulario.patente.value=='') 
	  {
	    alert('Ingrese patente alfanumerica (Formato: AAA000)');
	    formulario.patente.focus();
	    return false;
	  }
	  

	//valida marca
	if(formulario.marca.value == '')
	{
	    alert('Ingrese la marca de su vehiculo');
	    formulario.marca.focus();
	    return false;
	}
	var letrasok = 'ABCDEFGHIJKLMN—OPQRSTUVWXYZ¡…Õ”⁄' + 'abcdefghijklmnÒopqrstuvwxyz·ÈÌÛ˙';
	  var letras = formulario.marca.value;
	  var validado= true; 
	  for (i = 0; i < letras.length; i++) 
	  {
	    ch = letras.charAt(i); 
	    for (j = 0; j < letrasok.length; j++)
	      if (ch == letrasok.charAt(j))
	        break;
	    if (j == letrasok.length) 
		{ 
	      validado = false; 
	      break; 
	    }
	  }
	  if (!validado) { 
	    alert('Escriba solo letras,por favor'); 
	    formulario.marca.focus(); 
	    return (false); 
	  } 

	//valida modelo
	if(formulario.modelo.value == '')
	{
	    alert('Ingrese modelo de su vehiculo');
	    formulario.modelo.focus();
	    return false;
	}
	 
	//valida asientos
	 var asientos = document.getElementById("asientos").value;
	if( !(/^\d{1}$/.test(asientos)) || asientos<=0  ) {
		alert('Seleccione la cantidad de asientos');
	  return false;
	}

	//validacion de envio
	//alert('Campos validados correctamente');
	return true;	
	}