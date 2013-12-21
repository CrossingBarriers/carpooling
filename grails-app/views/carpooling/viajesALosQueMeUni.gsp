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
				<li><g:link controller="miembrosComunidad"
						action="renderMiembrosComunidadView">COMUNIDAD</g:link></li>
				<li class="pull-right"><g:link controller="MisMensajes"
						action="listarMensajes" title="Mis Mensajes">
						<span class="glyphicon glyphicon-envelope"></span>
						<em class="ml-count ch-hide" style="display: inline;"></em>
					</g:link></li>

				<li class="pull-right" style="padding-right: 15px;">
					<div class="dropdown">
						<a data-toggle="dropdown" href="#"><span> <g:if
									test="${session.usuarioLogueado.nombre == null}">
									<li><g:link controller="index" action="renderIndexView"></g:link></li>
								</g:if>
								<g:else>
									${session.usuarioLogueado.nombre}
								</g:else>
						</span> <span class="glyphicon glyphicon-user"></span> </a>

						<ul class="dropdown-menu" role="menu">
							<li><g:link controller="perfilUsuario"
									action="renderPerfilUsuarioView">Mi Perfil</g:link></li>
							<li><g:link controller="viajesALosQueMeUni"
									action="renderViajesALosQueMeUniView">Mis Viajes</g:link></li>
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
			<h1>Viajes a los que me uní</h1>
			<div class="seccion_imgs caja-sombra _imgs">
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>
								<p class="text-center">
									<strong> Desde </strong>
								</p>
							</th>
							<th>
								<p class="text-center">
									<strong> Hasta </strong>
								</p>
							</th>
							<th>
								<p class="text-center">
									<strong> Días </strong>
								</p>
							</th>
							<th>
								<p class="text-center">
									<strong> Horario </strong>
								</p>
							</th>
							<th>
								<p class="text-center">
									<strong> Colaboración </strong>
								</p>
							</th>

						</tr>
					</thead>
					<tbody>
						<g:each var="unido" in="${viajeConPasajero}">
							<tr>
								<td>
									<center>
										${unido.viaje.desde}
									</center>
								</td>
								<td>
									<center>
										${unido.viaje.hasta}
									</center>
								</td>
								<td>
									<center>
										<g:if test="${unido.dia=='D'}">
											<strong class="text-warning">Dom</strong>
										</g:if>
										<g:else>
											<strong class="text-muted">Dom</strong>
										</g:else>
										<g:if test="${unido.dia=='L'}">
											<strong class="text-warning">Lun</strong>
										</g:if>
										<g:else>
											<strong class="text-muted">Lun</strong>
										</g:else>
										<g:if test="${unido.dia=='M'}">
											<strong class="text-warning">Mar</strong>
										</g:if>
										<g:else>
											<strong class="text-muted">Mar</strong>
										</g:else>
										<g:if test="${unido.dia=='X'}">
											<strong class="text-warning">Mie</strong>
										</g:if>
										<g:else>
											<strong class="text-muted">Mie</strong>
										</g:else>

										<g:if test="${unido.dia=='J'}">
											<strong class="text-warning">Jue</strong>
										</g:if>
										<g:else>
											<strong class="text-muted">Jue</strong>
										</g:else>
										<g:if test="${unido.dia=='V'}">
											<strong class="text-warning">Vie</strong>
										</g:if>
										<g:else>
											<strong class="text-muted">Vie</strong>
										</g:else>
										<g:if test="${unido.dia=='S'}">
											<strong class="text-warning">Sab</strong>
										</g:if>
										<g:else>
											<strong class="text-muted">Sab</strong>
										</g:else>
									</center>
								</td>
								<td>
									<center>
										${unido.viaje.hora}:${unido.viaje.minutos}
									</center>
								</td>
								<td>
									<center>
										$
										${unido.viaje.colaboracion}
									</center>
								</td>
								<td><g:link controller="viajesALosQueMeUni"
										action="quitarUsuarioUnido" id="${unido.id}" type="button"
										class="btn btn-warning btn-xs">
										<span class="glyphicon glyphicon-remove-sign"></span>
										 Eliminar
										 </g:link></td>
							</tr>
						</g:each>
					</tbody>
				</table>
				<br></br>
				<center class="btn-vehiculo">
					<g:link controller="busquedaDeViajes"
						action="renderBusquedaDeViajesView" type="button"
						class="btn btn-warning btn-xs">
						<span class="glyphicon glyphicon-search"></span> Buscar viaje </g:link>
				</center>
				<br />

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