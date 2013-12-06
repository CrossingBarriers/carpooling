<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Carpooling BA - Resultado de la Busqueda</title>

<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'estilos.css')}" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="${resource(dir: 'css', file: 'botones_redes_sociales.css')}" />
<link rel="stylesheet"
	href="${resource(dir: 'bootstrap/css', file: 'bootstrap-responsive.css')}"
	media="all" type="text/css" />
<link rel="stylesheet"
	href="${resource(dir: 'bootstrap/css', file: 'bootstrap.css')}"
	media="all" type="text/css" />
<script type="text/javascript"
	src="${resource(dir: 'bootstrap/js', file: 'jquery.js')}"></script>
<script type="text/javascript"
	src="${resource(dir: 'bootstrap/js', file: 'bootstrap.js')}"></script>

</head>

<body>

	<div id="bg_header">
		<img
			src="${resource(dir: 'images/carpooling', file: 'header_bg.jpg')}"
			height="114" width="960" alt="header_bg" />

		<hr class="linea" />
		<div id="barra"></div>
		<div class="bg_contenido"></div>
	</div>

	<div id="contenedor">

		<div class="header">
			<g:link controller="index" action="renderIndexView">

				<img class="logo"
					src="${resource(dir: 'images/carpooling', file: 'logo.png')}"
					height="106" width="254" alt="logo" />

			</g:link>

			<ul id="m-soc4">
				<li><a class="facebook" href="#"><span>Facebook</span></a></li>
				<li><a class="twitter" href="#"><span>Twitter</span></a></li>
				<li><a class="youtube" href="#"><span>YouTube</span></a></li>
			</ul>

		</div>
		<!--fin header_960-->

		<div class="menu">
			<ul class="menu_single">
				<li><g:link controller="index" action="renderIndexView">HOME</g:link></li>
				<li><g:link controller="comoFunciona"
						action="renderComoFuncionaView">COMO FUNCIONA</g:link></li>
				<li class="pull-right">
					<g:link controller="MisMensajes" action="listarMensajes" title="Mis Mensajes">
						<span class="glyphicon glyphicon-envelope"></span>
						<em class="ml-count ch-hide" style="display: inline;">2</em>
					</g:link>
				</li>
				
				<li class="pull-right" style="padding-right:15px;">
					<div class="dropdown">
						<a data-toggle="dropdown" href="#"><span>Fulanito de Tal</span>
							<span class="glyphicon glyphicon-user"></span>
						</a>
						
						<ul class="dropdown-menu" role="menu">
							<li><g:link controller="perfilUsuario"
									action="renderPerfilUsuarioView">Mi Perfil</g:link></li>
							<li><g:link controller="viajesALosQueMeUni"
									action="renderMisViajesView">Mis Viajes</g:link></li>
							<li><g:link controller="tipoUsuario"
									action="renderTipoUsuarioView">Tipo Usuario</g:link></li>
							<li class="divider"></li>
							<li><a href="index.html">Cerrar Sesión</a></li>
						</ul>
					</div>
				</li>
				<div class="clearfix"></div>
			</ul>

		</div>
		<!--fin menu-->

		<div id="contenido">
			<h1>
				<i class="glyphicon glyphicon-map-marker"></i> Viajes publicados que
				coinciden con su busqueda
			</h1>

			<div class="seccion_imgs caja-sombra _imgs">

				<g:each var="resultado" in = "${resultado}">
				
				<g:form controller="descripcionViaje"
					action="renderDescripcionViajeView" method="post">
				
				<div class="alert alert-info">
					<h4>${resultado.desde.tokenize(',').first()} - ${resultado.hasta.tokenize(',').first()}</h4>
					<h5><strong>Desde:</strong> ${resultado.desde}<strong>Hasta:</strong> ${resultado.hasta}</h5>
					<div class="col-md-6 col-xs-3 col-sm-4">
						<ul>
							<li><strong>Chofer: </strong>${resultado.vehiculo.usuario.nombre} ${resultado.vehiculo.usuario.apellido}</li>
							<li><strong>Vehiculo: </strong>${resultado.vehiculo.marca} ${resultado.vehiculo.modelo}</li>
						</ul>
					</div>
					<div class="col-md-6 col-xs-3 col-sm-4">
						<ul class="pull-left">
							<li><strong>Lugares disponibles: </strong>${resultado.asientosLibres}</li>
							<li><strong>Colaboración: </strong>$${resultado.colaboracion}</li>
						</ul>
						<g:link class="btn btn-warning btn-xs pull-right"
							controller="DescripcionViaje" action="renderDescripcionViajeView">Ver detalle</g:link>
						
						<button type="submit" class="btn btn-warning">Ver detalle</button>
							
					</div>
					<div class="clearfix"></div>
				</div>
				
				</g:form>
				
				</g:each>

			</div>

			<div style="clear: both"></div>
		</div>
		<!--fin contenido-->
		<div id="push"></div>
	</div>

	<!--fin contenedor-->

	<div id="footer">

		<div class="footer_960">

			<div id="foot_carpooling" class="secciones_foot">
				<h3>CARPOOLING</h3>
				<ul>
					<li><g:link controller="index" action="renderIndexView">Home</g:link></li>
					<li><g:link controller="comoFunciona"
							action="renderComoFuncionaView">Como Funciona</g:link></li>
					<li><g:link controller="registrate"
							action="renderRegistrateView">Registrate</g:link></li>
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
				<img
					src="${resource(dir: 'images/carpooling', file: 'redes_icons.png')}"
					height="33" width="117" alt="redes_icons" />
			</div>

			<hr class="linea_2" />

			<p>© 2013 | Crossing Barriers | Todos los derechos Reservados</p>

		</div>
		<!--fin footer_960-->

	</div>
	<!--fin footer-->
</body>
</html>