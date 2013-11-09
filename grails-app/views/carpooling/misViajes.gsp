<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Carpooling BA - Mis Viajes</title>

<link rel="stylesheet" type="text/css"
	href="${resource(dir: 'css', file: 'estilos.css')}" />
<link rel="stylesheet" type="text/css"
	href="${resource(dir: 'css', file: 'botones_redes_sociales.css')}" />
<link rel="stylesheet" type="text/css"
	href="${resource(dir: 'bootstrap/css', file: 'bootstrap-responsive.css')}"
	media="all" />
<link rel="stylesheet" type="text/css"
	href="${resource(dir: 'bootstrap/css', file: 'bootstrap.css')}"
	media="all" />
<script type="text/javascript"
	src="${resource(dir: 'bootstrap/js', file: 'jquery.js')}"></script>
<script type="text/javascript"
	src="${resource(dir: 'bootstrap/js', file: 'bootstrap.js')}"></script>

</head>

<body>

	<div id="bg_header">
		<img src="${resource(dir: 'images/carpooling', file: 'header_bg.jpg')}" height="114" width="960" alt="header_bg" />
		
		<hr class="linea"/>
		<div id="barra"></div>
		<div class="bg_contenido"></div>
	</div>

	<div id="contenedor">
		
		<div class="header">
			<g:link controller="index" action="renderIndexView">

				<img class="logo" src="${resource(dir: 'images/carpooling', file: 'logo.png')}" height="106" width="254" alt="logo" />
				
			</g:link>
			
			<ul id="m-soc4">
				<li><a class="facebook" href="#"><span>Facebook</span></a></li>
				<li><a class="twitter" href="#"><span>Twitter</span></a></li>
				<li><a class="youtube" href="#"><span>YouTube</span></a></li>
			</ul>
			
		</div><!--fin header_960-->

		<div class="menu">
			<ul class="menu_single">
                <li><g:link controller="index" action="renderIndexView">HOME</g:link></li>
				<li><g:link controller="ComoFunciona" action="renderComoFuncionaView">COMO FUNCIONA</g:link></li>
            </ul>
            
            <div class="dropdown">
                <a data-toggle="dropdown" href="#">
                <span>Fulanito de Tal</span>
                <span class="glyphicon glyphicon-user"></span>
              </a>
              <ul class="dropdown-menu" role="menu">
                <li><g:link controller="PerfilUsuario" action="renderPerfilUsuarioView">Mi Perfil</g:link></li>
                <li><g:link controller="MisViajes" action="redirectAgregarVehiculoController">Mis Viajes</g:link></li>
                <li><g:link controller="index" action="redirectTipoUsuarioController">Tipo Usuario</g:link></li>
                <li class="divider"></li>
                <li><a href="index.html">Cerrar Sesión</a></li>
              </ul>
            </div>
            
		</div><!--fin menu-->
		
		<div id="contenido">
		  <h1>Mis autos y Mis viajes</h1>
            <div class="seccion_imgs caja-sombra _imgs">
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>
                                Patente
                            </th>
                            <th>
                                Marca
                            </th>
                            <th>
                                Modelo
                            </th>
                            <th>
                                Cantidad de asientos
                            </th>
                        </tr>
                    </thead>
                      <tbody>
                    <g:each var="vehiculos" in="${map}">
                        <tr>
                            <td>
                            ${vehiculos.patente}
                            </td>
                            <td>
                            ${vehiculos.marca} 
                            </td>
                            <td>
                            ${vehiculos.modelo }
                            </td>
                            <td>
                            ${vehiculos.cantidadAsientos }
                            </td>
                           <td>
                          <g:link action="quitarVehiculo" id="${vehiculos.id}"><span class="glyphicon glyphicon-remove"></span></g:link>
  
                           </td>
                        </tr>
                        </g:each>
                    </tbody>
                </table>
                <br />
                <br />
                <br />
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>
                                Desde
                            </th>
                            <th>
                                Hasta
                            </th>
                            <th>
                                Dias
                            </th>
                            <th>
                                Hora
                            </th>
                            <th>
                                Vehiculo
                            </th>
                            <th>
                                Colaboracion
                            </th>
                            <th>
                                Comentario adicional
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                            </td>
                            <td>
                            </td>
                            <td>
                            </td>
                            <td>
                            </td>
                            <td>
                            </td>
                            <td>
                            </td>
                            <td>
                            </td>
                            <td>
                            </td>
                        </tr>
                    </tbody>
                </table>
                
                <center class="btn-vehiculo">
                    <g:link controller="AgregarVehiculo" action="renderAgregarVehiculoView" class="btn btn-sm btn-warning">Agregar Vehiculo</g:link>
                    <g:link controller="AgregarViaje" action="renderAgregarViajeView" class="btn btn-sm btn-warning">Agregar Viaje</g:link>
                </center>
            
            </div>
            <div style="clear: both"></div>
		</div><!--fin contenido-->
		<div id="push"></div>
	</div><!--fin contenedor-->
	
	<div id="footer">
		
		<div class="footer_960">
			
			<div id="foot_carpooling" class="secciones_foot">
				<h3>CARPOOLING</h3>
				<ul>
					<li><g:link controller="index" action="renderIndexView">Home</g:link></li>
					<li><g:link controller="ComoFunciona" action="renderComoFuncionaView">Como Funciona</g:link></li>
					<li><g:link controller="Registrate" action="renderRegistrateView">Registrate</g:link></li>
					<li><a href="#">Contacto</a></li>
				</ul>
			</div>
			
			<div id="foot_mas_info" class="secciones_foot">
				<h3>MAS INFORMACION</h3>
				<ul>
					<li><a href="#">Acerca de Carpooling</a></li>
					<li><a href="#">Preguntas Frecuentes (FAQ)</a></li>
					<li><a href="#">Términos y Condiciones</a></li>
					<li><a href="#">Políticas de Privacidad</a></li>
				</ul>
			</div>
			
			<div id="foot_redes_sociales" class="secciones_foot">
				<h3>REDES SOCIALES</h3>
				<img src="${resource(dir: 'images/carpooling', file: 'redes_icons.png')}" height="33" width="117" alt="redes_icons" />
			</div>

			<hr class="linea_2"/>

			<p>© 2013  |  Crossing Barriers  |  Todos los derechos Reservados</p>

		</div><!--fin footer_960-->

	</div><!--fin footer-->
</body>
</html>