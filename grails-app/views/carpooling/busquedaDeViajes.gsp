<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Carpooling BA - Busqueda de Viaje</title>

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
<script
	src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&libraries=places"></script>
<script type="text/javascript"
	src="${resource(dir: 'js', file: 'google.js')}">
	
</script>

<link rel="stylesheet"
	href="${resource(dir: 'css', file: 'jquery-ui-1.10.3.custom.css')}"
	media="all" type="text/css" />
<script type="text/javascript"
	src="${resource(dir: 'js', file: 'jquery-ui-1.10.3.custom.js')}">
	
</script>

<script>
	$(function() {
		$("#checkboxset").buttonset();
	});
</script>

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
			<g:link controller="busquedaDeViajes" action="redirectIndex">

				<img class="logo"
					src="${resource(dir: 'images/carpooling', file: 'logo.png')}"
					height="106" width="254" alt="logo" />

			</g:link>

			<ul id="m-soc4">
				<li><a class="facebook" href="https://www.facebook.com"><span>Facebook</span></a></li>
				<li><a class="twitter" href="#"><span>Twitter</span></a></li>
				<li><a class="youtube" href="#"><span>YouTube</span></a></li>
			</ul>

		</div>
		<!--fin header_960-->

		<div class="menu">

			<ul class="menu_single">
				<li><g:link controller="index" action="renderIndexView">HOME</g:link></li>
				<li><g:link controller="ComoFunciona"
						action="renderComoFuncionaView">COMO FUNCIONA</g:link></li>
			</ul>

			<div class="dropdown">
				<a data-toggle="dropdown" href="#"> <span>Fulanito de Tal</span>
					<span class="glyphicon glyphicon-user"></span>
				</a>
				<ul class="dropdown-menu" role="menu">
					<li><g:link controller="PerfilUsuario"
							action="renderPerfilUsuarioView">Mi Perfil</g:link></li>
					<li><g:link controller="ViajesALosQueMeUni"
							action="renderMisViajesView">Mis Viajes</g:link></li>
					<li><g:link controller="index"
							action="redirectTipoUsuarioController">Tipo Usuario</g:link></li>
					<li class="divider"></li>
					<li><a href="index.html">Cerrar Sesión</a></li>
				</ul>
			</div>

		</div>
		<!--fin menu-->
		<div id="contenido">
			<h2>Realizar nueva busqueda</h2>
			<div class="seccion_imgs _imgs caja-sombra">
				<g:form controller="resultadoBusqueda"
					action="renderResultadoBusquedaView" method="post">
					<div class="col-md-6">
						<div class="form-group">
							<label for="desde">Desde:</label>
							<input type="text" id="desde" name="desde" class="form-control" />
						</div>
						<div class="form-group">
							<label for="hasta">Hasta:</label>
							<input type="text" id="hasta" name="hasta" class="form-control" />
						</div>
						
						<div class="form-group">
							<label for="hora" class="pull-left">Hora de salida:</label>
							<div class="col-xs-3">
							<input type="text"name="hh" class="form-control" placeholder="hh" />
							</div>
							<label for="dos_puntos" class="pull-left" style="padding-left:0;">:</label>
							<div class="col-xs-3">
							<input type="text" name="mm" class="form-control" placeholder="mm" />
						   </div>
						   <div class="clearfix"></div>
						</div>

						<label for="frecuencia">Frecuencia:</label>
						<div id="checkboxset">
							<input type="checkbox" id="checkbox1" name="checkbox" /><label
								for="checkbox1">Dom</label> <input type="checkbox"
								id="checkbox2" name="checkbox" /><label for="checkbox2">Lun</label>
							<input type="checkbox" id="checkbox3" name="checkbox" /><label
								for="checkbox3">Mar</label> <input type="checkbox"
								id="checkbox4" name="checkbox" /><label for="checkbox4">Mier</label>
							<input type="checkbox" id="checkbox5" name="checkbox" /><label
								for="checkbox5">Jue</label> <input type="checkbox"
								id="checkbox6" name="checkbox" /><label for="checkbox6">Vie</label>
							<input type="checkbox" id="checkbox7" name="checkbox" /><label
								for="checkbox7">Sab</label>
						</div>
					</div>

					<div class="col-md-6">
						<div id="map-canvas"
							style="width: 410px; height: 281px; margin: auto"></div>
					</div>

					<div style="clear: both"></div>

					<center class="btn_vehiculo">
						<button type="submit" class="btn btn-warning">Buscar</button>
						<button type="reset" class="btn btn-default">Borrar</button>
					</center>
					<div style="clear: both"></div>
				</g:form>
			</div>
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
					<li><g:link controller="ComoFunciona"
							action="renderComoFuncionaView">Como Funciona</g:link></li>
					<li><g:link controller="Registrate"
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