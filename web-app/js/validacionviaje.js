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
if( !(/^\d{2}$/.test(horario)) || horario<00 || horario>23  ) {
	alert('Ingrese hora en formato 24 hs');
 return false;
}


//valida minutos
var min = document.getElementById("minutos").value;
if( !(/^\d{2}$/.test(min)) || min<00 || min>59 ) {
	alert('Ingrese los minutos en formato 60 minutos');
return false;
}

//valida frecuencia
valido=false; 
for(a=0;a<formulario.elements.length;a++){ 
if(formulario[a].type=="checkbox" && formulario[a].checked==true){ 
valido=true; 
break 
} 

} 
if(!valido){ 
alert("Seleccione al menos un dia");
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
/* var disponibilidad = document.getElementById("lugares").value;
if( !(/^\d{1}$/.test(disponibilidad)) || disponibilidad<=0  ) {
	alert('Ingrese la cantidad de lugares disponibles!!');
  return false;
}*/

//Valida comentario
if(formulario.comentario.value == '')
{
    alert('Ingrese un comentario adicional');
    formulario.comentario.focus();
    return false;
}


//validacion de envio
//alert('Campos validados correctamente');
return true;	
}