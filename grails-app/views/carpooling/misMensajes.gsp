<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Carpooling BA - Mis Mensajes</title>

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

function success(current) {
    	$("#"+current+" h6").attr("class","show");
	}

function toggle(current) {
	$("#"+current+" p.respuesta").toggle(400);
}

function borrarMensaje(current) {
	setTimeout(function () {
		$("#"+current+"").fadeOut(1500);
	},2000);
}


function precargaBorrar(current) {
	$("#"+current+"").html('<p style="text-align:center;"><img src="${resource(dir: 'images/carpooling', file: 'ajax-loader.gif')}"/></p>');
}

function precargaRespuesta(current) {
	$("#"+current+" form").remove();
	$("#"+current+" p.respuesta").html('<p style="text-align:center;"><img src="${resource(dir: 'images/carpooling', file: 'ajax-loader.gif')}"/></p>');
}

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
				<li><g:link controller="miembrosComunidad"
						action="renderMiembrosComunidadView">COMUNIDAD</g:link></li>
				<li class="pull-right"><g:link controller="MisMensajes"
						action="listarMensajes" title="Mis Mensajes">
						<span class="glyphicon glyphicon-envelope"></span>
						<em class="ml-count" style="display: inline;"></em>
					</g:link></li>

				<li class="pull-right" style="padding-right: 15px;">
					<div class="dropdown">
						<a data-toggle="dropdown" href="#"><span>
								<g:if test="${session.usuarioLogueado.nombre == null}">
		<li><g:link controller="index" action="renderIndexView"></g:link></li>
		</g:if><g:else>${session.usuarioLogueado.nombre}</g:else>
						</span> <span class="glyphicon glyphicon-user"></span> </a>

						<ul class="dropdown-menu" role="menu">
							<li><g:link controller="perfilUsuario"
									action="renderPerfilUsuarioView">Mi Perfil</g:link></li>
							<!--<li><g:link controller="viajesALosQueMeUni"
									action="renderMisViajesView">Mis Viajes</g:link></li>-->
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
			<h2>Mis Mensajes</h2>

			<div class="seccion_imgs caja-sombra _imgs">
			
				<g:if test='${flash.message}'>
					<div class='alert alert-danger'>
						<p class="text-center">${flash.message}</p>
					</div>
				</g:if>

				<g:each in="${mensajes.reverse()}">

					<div id="${it.id}" class="alert alert-info fade in">
						<h4>
							Mensaje de:
							${it.emisor.nombre}
							${it.emisor.apellido}
						</h4>
						<g:remoteLink id="${it.id}" class="close" data-dismiss="alert"
							controller="misMensajes" action="borrarMensaje" update="${it.id}"
							onSuccess="borrarMensaje(${it.id})"
							onLoading="precargaBorrar(${it.id})" title="Eliminar mensaje">×</g:remoteLink>
						<p>
							<span class="glyphicon glyphicon-comment"></span>
							${it.mensaje}
							<abbr class="timeago" title="${it.dateCreated}"
								style="font-size: 12px; color: #68B0D3; cursor: default; border-bottom: 0;"></abbr>
						</p>

						<g:if test="${it.idRespuesta > 0}">
							<h6>
								<strong><g:remoteLink class="respuestas"
										controller='misMensajes' action='buscarRespuesta'
										params="${[idRespuesta: it.idRespuesta]}"
										update="${it.id} p.respuesta" onSuccess="toggle(${it.id})">Ver Respuesta:</g:remoteLink></strong>
							</h6>
							<p class="respuesta" style="display: none;"></p>
						</g:if>

						<g:if test="${it.idRespuesta == 0}">
							<h6 class="hidden">
								<strong>Respuesta:</strong>
							</h6>
							<p class="respuesta"></p>
							<g:formRemote name="enviar_mensaje"
								url="[controller: 'misMensajes', action:'responderMensaje']"
								update="${it.id} p.respuesta" method="post"
								onLoading="precargaRespuesta(${it.id})"
								onSuccess="success(${it.id})">
								<div class="form-group">
									<g:textArea class="form-control mis_mensajes" name="mensaje"
										placeholder="Reponder mensaje..." />
									<g:field type="hidden" name="receptor"
										value="${it.emisor.username}" />
									<g:field type="hidden" name="idMensaje" value="${it.id}" />
								</div>

								<center class="btn_vehiculo hidden">
									<button type="submit" class="btn btn-warning btn-xs">Responder</button>
									<button type="reset" class="btn btn-default btn-xs">Cancelar</button>
								</center>
							</g:formRemote>

						</g:if>

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