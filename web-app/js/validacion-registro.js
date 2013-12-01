// JAVASCRIPT PARA VALIDAR REGISTRO DE USUARIOS
function validar(formulario)
{

//valida nombre
  if (formulario.nombre.value=='') 
  {
    alert('Ingrese su nombre.');
    formulario.nombre.focus();
    return (false);
  }
  var letrasok = 'ABCDEFGHIJKLMN—OPQRSTUVWXYZ¡…Õ”⁄' + 'abcdefghijklmnÒopqrstuvwxyz·ÈÌÛ˙';
  var letras = formulario.nombre.value;
  var validado = true; 
  for (i = 0; i < letras.length; i++) 
  {
    ch = letras.charAt(i); //charAt devuelve un valor de car·cter igual al car·cter situado en la posiciÛn especificada por index. 
    for (j = 0; j < letrasok.length; j++)
      if (ch == letrasok.charAt(j))
        break;
    if (j == letrasok.length) 
	{ 
      validado= false; 
      break; 
    }
  }
  if (!validado) 
  { 
    alert('Escriba sÛlo letras'); 
    formulario.nombre.focus(); 
    return (false); 
  } 

//valida apellido
if(formulario.apellido.value == '')
{
    alert('Ingrese su apellido');
    formulario.apellido.focus();
    return false;
}
var letrasok = 'ABCDEFGHIJKLMN—OPQRSTUVWXYZ¡…Õ”⁄' + 'abcdefghijklmnÒopqrstuvwxyz·ÈÌÛ˙';
  var letras = formulario.apellido.value;
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
    alert('Escriba sÛlo letras,por favor'); 
    formulario.apellido.focus(); 
    return (false); 
  } 
  
//valida dni
  valor = document.getElementById("dni").value;
if( !(/^\d{8}$/.test(valor)) ) {
	alert('Ingrese su documento de identidad');
  return false;
}
//valida telefono
if(formulario.telefono.value == '')
{
    alert('Ingrese su numero telefonico');
    formulario.telefono.focus();
    return false;
}
//valida direccion de mail
if(formulario.email.value.indexOf('@')==-1) 
{
	alert('Debe ingresar su correo electronico.');
	formulario.email.focus();
	return false;
}
if(formulario.email.value.indexOf('.')==-1)
{
	alert('Debe ingresar su correo electronico correctamente');
	formulario.email.focus();
	return false;
}	

 //valida contraseÒa
if(formulario.contrasenia.value==''){
alert('Ingrese su contrasenia');
formulario.contrasenia.focus();
return false;
}
//Valida repetir contraseÒa
if(formulario.repetircontrasenia.value==''){
alert('Ingrese nuevamente su contrasenia');
formulario.repetircontrasenia.focus();
return false;
}
//valida que las contraseÒas sean iguales
if(formulario.contrasenia.value!=formulario.repetircontrasenia.value){
alert('Las contrasenias deben coincidir');
return false;
}


return true;	
}