<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Carpooling BA - Registrate</title>

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
				<li><a class="facebook" href="https://www.facebook.com"><span>Facebook</span></a></li>
				<li><a class="twitter" href="#"><span>Twitter</span></a></li>
				<li><a class="youtube" href="#"><span>YouTube</span></a></li>
			</ul>
			
		</div><!--fin header_960-->

		<div class="menu">
			<ul class="menu_single">
                <li><g:link controller="index" action="renderIndexView">HOME</g:link></li>
                <li><g:link controller="comoFunciona" action="renderComoFuncionaView">COMO FUNCIONA</g:link></li>
                <li><a class="activo">REGISTRATE</a></li>
            </ul>
            
		</div><!--fin menu-->
		
		<div id="contenido">
		  <h1>Registráte</h1>
            <div class="seccion_imgs caja-sombra _imgs">
                
                <form role="form">
				
				<div class="col-md-6">	
					<div class="form-group">
						<label for="patente">Nombre:</label>
						<input type="text" class="form-control" placeholder="Ingrese nombre..">
					</div>
					<div class="form-group">
						<label for="marca">Apellido:</label>
						<input type="text" class="form-control" placeholder="Ingrese apellido..">
					</div>
					<div class="form-group">
						<label for="Modelo">DNI:</label>
						<input type="text" class="form-control" placeholder="Ingrese dni..">
					</div>
					<div class="form-group">
						<label for="Modelo">Teléfono:</label>
						<input type="text" class="form-control" placeholder="Ingrese teléfono..">
					</div>
                </div>
                
                <div class="col-md-6">
                    <div class="form-group">
						<label for="telefono">E-mail:</label>
						<input type="text" class="form-control" placeholder="Ingrese e-mail..">
					</div>
					<div class="form-group">
						<label for="telefono">Repetir E-mail:</label>
						<input type="text" class="form-control" placeholder="Ingrese e-mail..">
					</div>
					<div class="form-group">
						<label for="Modelo">Contraseña:</label>
						<input type="text" class="form-control" placeholder="Ingrese contraseña..">
					</div>
					<div class="form-group">
						<label for="Modelo">Repetir Contraseña:</label>
						<input type="text" class="form-control" placeholder="Ingrese contraseña..">
					</div>
                </div>
                
                <div style="clear: both"></div>
                
                <center class="btn_vehiculo">
                    <button type="submit" class="btn btn-success">Registrarme</button>
                    <buttom type="reset" class="btn btn-default">Cancelar</buttom>
                </center>
                
                </form>
            </div>
			
		</div><!--fin contenido-->
		<div id="push"></div>
	</div><!--fin contenedor-->
	
	<div id="footer">
		
		<div class="footer_960">
			
			<div id="foot_carpooling" class="secciones_foot">
				<h3>CARPOOLING</h3>
				<ul>
					<li><g:link controller="index" action="renderIndexView">Home</g:link></li>
					<li><g:link controller="comoFunciona" action="renderComoFuncionaView">Como Funciona</g:link></li>
					<li><g:link controller="registrate" action="renderRegistrateView">Registrate</g:link></li>
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