// JavaScript Document // JAVASCRIPT PARA CARPOOLING - agregar viaje
function validar(formulario)
{

//valida desde
  if (formulario.desde.value=='') 
  {
    alert('Ingrese origen del viaje');
    formulario.desde.focus();
    return (false);
  }
  

//valida hasta
if(formulario.hasta.value == '')
{
    alert('Ingrese destino del viaje');
    formulario.hasta.focus();
    return false;
}

//valida hora
var horario= document.getElementById("hora").value;
if( !(/^\d{2}$/.test(horario)) || horario<=0  ) {
	alert('Ingrese hora en formato 24 hs');
 return false;
}


//valida minutos
var min = document.getElementById("minutos").value;
if( !(/^\d{2}$/.test(min)) || min<0  ) {
	alert('Ingrese los minutos');
return false;
}

 //valida colaboracion
if(formulario.colaboracion.value == '')
{
    alert('Ingrese colaboracion en pesos');
    formulario.colaboracion.focus();
    return false;
}
  

//valida lugares disponibles
 var disponibilidad = document.getElementById("lugares").value;
if( !(/^\d{1}$/.test(disponibilidad)) || disponibilidad<=0  ) {
	alert('Ingrese la cantidad de lugares disponibles');
  return false;
}

//valida comentario
if(formulario.comentario.value == '')
{
    alert('Ingrese comentario');
    formulario.comentario.focus();
    return false;
} 

  
//validacion de envio
//alert('Campos validados correctamente');
return true;	
}