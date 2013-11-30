<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Carpooling BA</title>

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
<script type="text/javascript"
	src="${resource(dir: 'js', file: 'google.js')}">
	
</script>
</head>

<body>

	<div id="bg_header">
		<img
			src="${resource(dir: 'images/carpooling', file: 'header_bg.jpg')}"
			height="114" width="1159" alt="header_bg" />

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
		</div>
		<!--fin header_960-->
<div class="menu">
			<ul class="menu_single">
				<li><g:link controller="index" action="renderIndexView">HOME</g:link></li>
				<li><g:link controller="comoFunciona"
						action="renderComoFuncionaView">COMO FUNCIONA</g:link></li>
				<li><a class="activo">COMUNIDAD</a></li>
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
			<h2 style="text-align: center">
				<i class="glyphicon glyphicon-globe"></i> Miembros de la comunidad
				Carpooling BA
			</h2>
			<div class="seccion_imgs caja-sombra _imgs">

				<g:each var="usuarios" in='${(usuario)}'>

					<div class="col-md-2">
						<div class="thumbnail" style="width: 145px;">
							<img data-src="js/holder.js/140x140" alt="usuario" />
						</div>
					</div>
					<p>
						<g:if test="${usuarios.conductor==true}">
							<h4 class="text-warning">
								<span class="glyphicon glyphicon-ok-sign"></span> Conductor
							</h4>
						</g:if>
						<g:if test="${usuarios.conductor==false }">
							<h4 class="text-warning">
								<span class="glyphicon glyphicon-ok-sign"></span> Pasajero
							</h4>

						</g:if>

					</p>
					<p>
						<h5>
							<strong><span class="glyphicon glyphicon-chevron-right"></span>
								Apellido - Nombre:</strong>
							${usuarios.apellido},
							${usuarios.nombre }

						</h5>
					</p>
					<p>
						<h5>
							<strong><span class="glyphicon glyphicon-chevron-right"></span>
								Email:</strong> <a href="mailto:#"> ${usuarios.email}
							</a>
						</h5>
					</p>
					<br></br>
				</g:each>

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
					<li><a href="index.html">Home</a></li>
					<li><a href="como_funciona.html">Como Funciona</a></li>
					<li><a href="#">Registrate</a></li>
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