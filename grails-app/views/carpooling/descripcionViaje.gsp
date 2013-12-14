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
<script type="text/javascript"
	src="${resource(dir: 'js', file: 'holder.js')}"></script>

<script
	src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&libraries=places"></script>

<script type="text/javascript">

	var directionsDisplay;
	var directionsService = new google.maps.DirectionsService();
	var map;

	function initialize() {
		  directionsDisplay = new google.maps.DirectionsRenderer();
		  var mapOptions = {
				    zoom:10,
				    mapTypeId: google.maps.MapTypeId.ROADMAP,
				  }
		  
		  map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);
		  directionsDisplay.setMap(map);
		  
		  calcRoute();

			function calcRoute() {
				var start = $('<div />').html("${viaje.desde}").text();
				var end = $('<div />').html("${viaje.hasta}").text();

				var request = {
					  origin: start,
					  destination: end,
					  travelMode: google.maps.DirectionsTravelMode.DRIVING
				  };
				 directionsService.route(request, function(response, status) {
						if (status == google.maps.DirectionsStatus.OK) {
						  directionsDisplay.setDirections(response);
						}
					  });
			}
	}

			 
	function success() {
		$("textarea.form-control").attr("value","");
    	$("#success").attr("class","alert alert-info fade in");
		
		setTimeout(function () {
			$("#success").fadeOut(1500);
		},2000);
	}

	function precarga_1() {
			$("#success").attr("class","alert alert-info fade in");
			$("#success").html('<p style="text-align:center;"><img src="${resource(dir: 'images/carpooling', file: 'ajax-loader.gif')}"/></p>');
	}

	google.maps.event.addDomListener(window, 'load', initialize);
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
				<li class="pull-right"><g:link controller="MisMensajes"
						action="listarMensajes" title="Mis Mensajes">
						<span class="glyphicon glyphicon-envelope"></span>
						<em class="ml-count ch-hide" style="display: inline;">2</em>
					</g:link></li>

				<li class="pull-right" style="padding-right: 15px;">
					<div class="dropdown">
						<a data-toggle="dropdown" href="#"><span> ${session.usuarioLogueado.nombre}
						</span> <span class="glyphicon glyphicon-user"></span> </a>

						<ul class="dropdown-menu" role="menu">
							<li><g:link controller="perfilUsuario"
									action="renderPerfilUsuarioView">Mi Perfil</g:link></li>
							<li><g:link controller="viajesALosQueMeUni"
									action="renderMisViajesView">Mis Viajes</g:link></li>
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
			<h1>Descripción de viaje seleccionado</h1>
			<div class="seccion_imgs caja-sombra _imgs">
				<div class="col-md-6">

					<div class="row">
						<div class="col-md-8">
							<h4>Conductor</h4>
							<h5>
								<strong>Nombre: </strong>
								${usuario.nombre}
							</h5>
							<h5>
								<strong>Apellido: </strong>
								${usuario.apellido}
							</h5>
							<h5>
								<strong>DNI: </strong>
								${usuario.dni}
							</h5>
							<h5>
								<strong>Teléfono: </strong>
								${usuario.telefono}
							</h5>
							</br>
							<!-- Ver si lo saco -->

						</div>
						<div class="col-md-4">
							<div class="img-thumbnail">
								<img width="140px" height="140px" class="center-block"
									src="${createLink(controller:'MiembrosComunidad', action:'mostrarImagen', params: ['imagen': usuario.imagen])}"
									alt="${usuario.nombre}" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-6">
							<h4>Vehiculo</h4>
							<h5>
								<strong>Marca: </strong>
								${vehiculo.marca}
							</h5>
							<h5>
								<strong>Model: </strong>
								${vehiculo.modelo}
							</h5>
							<h5>
								<strong>Patente: </strong>
								${vehiculo.patente}
							</h5>
							</br>
							<h5>
								<strong>Colaboración: </strong>$${viaje.colaboracion}
							</h5>
						</div>
						<div class="col-md-6">
							<div class="img-thumbnail">
								<img width="220px" height="200px" class="center-block"
									src="${createLink(controller:'MiembrosComunidad', action:'mostrarImagen', params: ['imagen': vehiculo.imagen])}"
									alt="${vehiculo.patente}" />
							</div>
						</div>
					</div>

					<div class="row">
						<g:formRemote name="enviar_mensaje"
							url="[controller: 'DescripcionViaje', action:'guardarMensaje']"
							method="post" update="success" onSuccess="success()"
							onLoading="precarga_1()">
							<div class="form-group">
								<label for="comentario">Mensaje:</label>
								<g:textArea class="form-control" name="mensaje"
									placeholder="Enviale un mensaje al conductor..." />
								<g:field type="hidden" name="receptor"
									value="${usuario.username}" />
							</div>

							<div id="success" class="hidden"></div>

							<center class="btn_vehiculo">
								<button type="submit" class="btn btn-success btn-xs">Enviar</button>
								<button type="reset" class="btn btn-default btn-xs">Borrar</button>
							</center>
						</g:formRemote>
					</div>

				</div>

				<div class="col-md-6">
					<h4>Viaje</h4>
					<h5>
						<strong>Desde: </strong>
						${viaje.desde}
					</h5>
					<h5>
						<strong>Hasta: </strong>
						${viaje.hasta}
					</h5>
					<h5>
						<strong>Hora de Salida: </strong>
						${viaje.hora}:${viaje.minutos}
					</h5>
					<h5>
						<strong>Dia/as: </strong>
						${viaje.domingo}
						-
						${viaje.lunes}
						-
						${viaje.martes}
						-
						${viaje.miercoles}
						-
						${viaje.jueves}
						-
						${viaje.viernes}
						-
						${viaje.sabado}
					</h5>

					<div id="map-canvas"
						style="width: 410px; height: 281px; margin: 75px auto 0"></div>
					<center class="btn_vehiculo">
						<button type="submit" class="btn btn-lg btn-block btn-success">Unirme</button>
					</center>
				</div>
				<div class="clearfix"></div>


			</div>
			<divclass"clearfix">
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