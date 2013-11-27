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
	src="${resource(dir: 'js', file: 'jquery.timeago.js')}"></script>
<script type="text/javascript"
	src="${resource(dir: 'js', file: 'jquery.timeago.es.js')}"></script>
	
<script type="text/javascript">
$(document).ready(function(){
	
	jQuery("abbr.timeago").timeago();

	$('#contenido .alert textarea.mis_mensajes').focus(function () {
	    $(this).animate({ height: "60px" }, 500);
	    var current = $("textarea.mis_mensajes").index(this);

	    
	    $(".btn_vehiculo:eq("+parseInt(current)+")").attr("class","btn_vehiculo show"); 
	});
})
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
							<!--<li><g:link controller="viajesALosQueMeUni"
									action="renderMisViajesView">Mis Viajes</g:link></li>-->
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
			<h2>Mis Mensajes</h2>

			<div class="seccion_imgs caja-sombra _imgs">

				<g:each in = "${mensajes}">
				<div class="alert alert-info">
					<h4>Mensaje de: ${it.receptor.nombre} ${it.receptor.apellido}</h4>
					<p>${it.mensaje} <abbr class="timeago" title="${it.dateCreated}" style="font-size: 12px; color: #68B0D3; cursor: default; border-bottom: 0;"></abbr></p>
					<g:form controller="DescripcionViaje" action="guardarMensaje" method="post">
    				        <div class="form-group">
        						<g:textArea class="form-control mis_mensajes" name="mensaje" placeholder="Reponder mensaje..."/>
        						<g:field type="hidden" name="receptor" value="29157077"/>
        					</div>
        					
        					<center class="btn_vehiculo hidden">
                                <button type="submit" class="btn btn-success btn-xs">Enviar</button>
                                <button type="reset" class="btn btn-default btn-xs">Borrar</button>
                            </center>
    				 </g:form>
				</div>
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