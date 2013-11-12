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
alert('Viaje registrado correctamente');
return true;	
}