<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Carpooling BA - Agregar Viaje</title>

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
<script type="text/javascript"
	src="${resource(dir:'js', file:'validacionviaje.js') }"></script>
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
				<li><g:link controller="comoFunciona"
						action="renderComoFuncionaView">COMO FUNCIONA</g:link></li>
				<li class="pull-right"><g:link controller="MisMensajes"
						action="listarMensajes" title="Mis Mensajes">
						<span class="glyphicon glyphicon-envelope"></span>
						<em class="ml-count ch-hide" style="display: inline;"></em>
					</g:link></li>

				<li class="pull-right" style="padding-right: 15px;">
					<div class="dropdown">
						<a data-toggle="dropdown" href="#"><span> ${session.usuarioLogueado.nombre}
						</span> <span class="glyphicon glyphicon-user"></span> </a>

						<ul class="dropdown-menu" role="menu">
							<li><g:link controller="perfilUsuario"
									action="renderPerfilUsuarioView">Mi Perfil</g:link></li>
							<li><g:link controller="misViajes" action="index">Mis Viajes</g:link></li>
							<li><g:link controller="tipoUsuario"
									action="renderTipoUsuarioView">Tipo Usuario</g:link></li>
							<li class="divider"></li>
							<li><g:link controller='logout'>Cerrar Sesión</g:link></li>
						</ul>
					</div>
				</li>
				<div class="clearfix"></div>
			</ul>

		</div>
		<!--fin menu-->

		<div id="contenido">
			<g:each in="${miPatente}" var="vehiculo">
				<h2>
					Agregar nuevo viaje asociado a su vehículo:
					${vehiculo.patente }
				</h2>
				<div class="seccion_imgs caja-sombra _imgs">

					<fieldset>
						<g:form onSubmit="return validar(this)" controller="agregarViaje"
							action="guardarViaje" method="post">

							<div class="col-md-6">
								<div class="form-group">
									<label for="desde">Desde:</label>
									<g:field name="desde" id="desde" type="text"
										class="form-control" id="desde" />
								</div>
								<div class="form-group">
									<div class="col-xs-4">
										<!--<center>Latitud</center>-->
										<g:hiddenField name="desdelat" id="desdelat"
											class="form-control" />
									</div>

									<div class="col-xs-4">
										<!--<center>Longitud</center>-->
										<g:hiddenField name="desdelong" id="desdelong" type="text"
											class="form-control" />
									</div>
									<div class="clearfix"></div>
								</div>
								<div class="form-group">
									<label for="hasta">Hasta:</label>
									<g:field name="hasta" id="hasta" type="text"
										class="form-control" id="hasta" />
								</div>
								<div class="form-group">
									<div class="col-xs-4">
										<!--<center>Latitud</center>-->
										<g:hiddenField name="hastalat" id="hastalat" type="text"
											class="form-control" />
									</div>

									<div class="col-xs-4">
										<!--<center>Longitud</center>-->
										<g:hiddenField name="hastalong" id="hastalong" type="text"
											class="form-control" />
									</div>
									<div class="clearfix"></div>
								</div>
								<div class="form-group">
									<label for="hora" class="pull-left">Hora de salida:</label>
									<div class="col-xs-3">
										<g:field name="hora" id="hora" type="text"
											class="form-control" placeholder="hh" />
									</div>
									<label for="hora" class="pull-left" style="padding-left: 0;">:</label>
									<div class="col-xs-3">
										<g:field type="text" name="minutos" id="minutos"
											class="form-control" placeholder="mm" />
									</div>
									<div class="clearfix"></div>
								</div>
								<br /> <label for="frecuencia">Frecuencia:</label>
								<div id="checkboxset">
									<g:checkBox type="checkbox" id="checkbox1" name="domingo"
										value="D" checked="false" />
									<label for="checkbox1">Dom</label>
									<g:checkBox type="checkbox" id="checkbox2" name="lunes"
										value="L" checked="false" />
									<label for="checkbox2">Lun</label>
									<g:checkBox type="checkbox" id="checkbox3" name="martes"
										value="M" checked="false" />
									<label for="checkbox3">Mar</label>
									<g:checkBox type="checkbox" id="checkbox4" name="miercoles"
										value="X" checked="false" />
									<label for="checkbox4">Mier</label>
									<g:checkBox type="checkbox" id="checkbox5" name="jueves"
										value="J" checked="false" />
									<label for="checkbox5">Jue</label>
									<g:checkBox type="checkbox" id="checkbox6" name="viernes"
										value="V" checked="false" />
									<label for="checkbox6">Vie</label>
									<g:checkBox type="checkbox" id="checkbox7" name="sabado"
										value="S" checked="false" />
									<label for="checkbox7">Sab</label>
								</div>
								<br />
								<div class="form-group">
									<label for="colaboracion">Colaboración:</label>
									<g:field name="colaboracion" id="colaboracion" type="text"
										class="form-control" placeholder="Pesos" />
								</div>
								<br /> <br /> <br />

							</div>
							<div class="col-md-6">

								<div id="map-canvas"
									style="width: 390px; height: 261px; margin: 0 auto 17px;"></div>
								<br />
								<div class="form-group">
									<label for="comentario">Comentario:</label>
									<g:textArea name="comentario" id="comentario"
										class="form-control" rows="5" cols="15"
										placeholder="Algun detalle mas para agregar..." />
								</div>
							</div>
							<div style="clear: both"></div>
							<center class="btn_vehiculo">
								<g:submitButton name="submit" value="Publicar mi viaje"
									class="btn btn-warning" />
								<g:submitButton name="reset" type="reset"
									class="btn btn-default" value="Borrar" />
							</center>
						</g:form>
					</fieldset>
				</div>
			</g:each>
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