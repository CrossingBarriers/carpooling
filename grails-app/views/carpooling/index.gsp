<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Carpooling BA</title>

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

			<ul id="m-soc4">
				<li><a class="facebook" href="https://www.facebook.com"><span>Facebook</span></a></li>
				<li><a class="twitter" href="#"><span>Twitter</span></a></li>
				<li><a class="youtube" href="#"><span>YouTube</span></a></li>
			</ul>

		</div>
		<!--fin header_960-->

		<div class="menu">
			<ul class="menu_single">
				<li><a class="activo">HOME</a></li>
				<li><g:link controller="comoFunciona" action="renderComoFuncionaView">COMO FUNCIONA</g:link></li>
				<li><g:link controller="registrate" action="renderRegistrateView">REGISTRATE</g:link></li>
			</ul>
		</div>
		<!--fin menu-->

		<div id="contenido">

			<div id="columna_izquierda">
				<h1>Beneficios de Compartir Auto</h1>

				<div class="contenedor_secciones">

					<span></span>

					<div class="seccion_img uno caja-sombra">
						<span></span> <img
							src="${resource(dir: 'images/carpooling', file: 'ahorro_dinero.png')}"
							height="184" width="140" alt="" />
						<h4>Ahorras Dinero</h4>

					</div>

					<img class="mas"
						src="${resource(dir: 'images/carpooling', file: 'mas.png')}"
						height="100" width="80" alt="" />

					<div class="seccion_img dos caja-sombra">
						<span></span> <img
							src="${resource(dir: 'images/carpooling', file: 'fraternidad.png')}"
							height="99" width="185" alt="" />
						<h4 class="fraternidad_h4">Fomenta las relaciones laborales</h4>
					</div>

					<div style="clear: both"></div>

				</div>

				<div class="contenedor_secciones">

					<span></span>

					<div class="seccion_img uno caja-sombra">
						<span></span> <img
							src="${resource(dir: 'images/carpooling', file: 'menos_trafico.png')}"
							height="182" width="182" alt="" />
						<h4>Menos tráfico</h4>
					</div>

					<img class="mas"
						src="${resource(dir: 'images/carpooling', file: 'mas.png')}"
						height="100" width="80" alt="" />

					<div class="seccion_img dos caja-sombra">
						<span></span> <img
							src="${resource(dir: 'images/carpooling', file: 'plantita.png')}"
							height="147" width="197" alt="" />
						<h4>Menos contaminación</h4>

					</div>
					<div style="clear: both"></div>

				</div>

			</div>
			<!--fin columna_izquierda -->

			<div id="columna_derecha">

				<h3>Ingresa</h3>

				<div class="login seccion_img caja-sombra">

					<form role="form">
						<div class="form-group">
							<label for="usuario">Usuario</label> <input type="text"
								class="form-control" placeholder="Ingrese usuario..." />
						</div>
						<div class="form-group">
							<label for="password">Password</label> <input type="password"
								class="form-control" placeholder="Ingrese contraseña..." />
						</div>
						<button type="submit" class="btn btn-success">Ingresar</button>
					</form>

				</div>
			</div>
			<!-- fin columna_derecha-->

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
					<li><g:link controller="comoFunciona" action="renderComoFuncionaView">Como Funciona</g:link></li>
					<li><g:link controller="registrate" action="renderRegistrateView">Registrate</g:link></li>
					<li><a href="#">Contacto</a></li>
					<li><g:link controller="index"
							action="redirectMiembrosComunidadController">Miembros de la comunidad</g:link></li>
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