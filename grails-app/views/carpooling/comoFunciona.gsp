<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Carpooling BA</title>

<title>Carpooling BA - Como Funciona</title>

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
				<li><a class="facebook" href="https://www.facebook.com"><span>Facebook</span></a></li>
				<li><a class="twitter" href="#"><span>Twitter</span></a></li>
				<li><a class="youtube" href="#"><span>YouTube</span></a></li>
			</ul>

		</div>
		<!--fin header_960-->

		<g:if test="${sec.loggedInUserInfo(field: 'username') == ''}">
			<div class="menu">
				<ul class="menu_single">
					<li><g:link controller="index" action="renderIndexView">HOME</g:link></li>
					<li><g:link controller="comoFunciona"
							action="renderComoFuncionaView">COMO FUNCIONA</g:link></li>
					<li><g:link controller="registrate"
							action="renderRegistrateView">REGISTRATE</g:link></li>
				</ul>
			</div>
		</g:if>
		<sec:ifLoggedIn>
			<div class="menu">
				<ul class="menu_single">
					<li><g:link controller="index" action="renderIndexView">HOME</g:link></li>
					<li><g:link controller="comoFunciona"
							action="renderComoFuncionaView">COMO FUNCIONA</g:link></li>
				</ul>
			</div>
		</sec:ifLoggedIn>
		<!--fin menu-->

		<div id="contenido">
			<h1>El sistema es muy fácil de usar</h1>
			<h1>
				<small class="text-info">¡sigue estos simples pasos!</small>
			</h1>

			<div class="seccion_img caja-sombra como_funciona_1">
				<span></span> <img
					src="${resource(dir: 'images/carpooling', file: 'formulario.png')}"
					height="140" width="130" alt="" />
				<h3>Te registras</h3>
			</div>

			<img class="flecha"
				src="${resource(dir: 'images/carpooling', file: 'flecha.png')}"
				height="79" width="148" alt="" />

			<div class="seccion_img caja-sombra como_funciona_2">
				<span></span> <img
					src="${resource(dir: 'images/carpooling', file: 'mapa.png')}"
					height="140" width="248" alt="" />
				<h3>Cargas tu ruta de Viaje</h3>
			</div>

			<div class="seccion_img caja-sombra como_funciona_1">
				<span></span> <img
					src="${resource(dir: 'images/carpooling', file: 'lupa.png')}"
					height="147" width="124" alt="" />
				<h3>Busca coincidencias de Viaje</h3>
			</div>

			<img class="flecha"
				src="${resource(dir: 'images/carpooling', file: 'flecha.png')}"
				height="79" width="148" alt="" />

			<div class="seccion_img caja-sombra como_funciona_2">
				<span></span> <img
					src="${resource(dir: 'images/carpooling', file: 'auto.png')}"
					height="142" width="270" alt="" />
				<h3>Y a compartir el viaje!</h3>
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