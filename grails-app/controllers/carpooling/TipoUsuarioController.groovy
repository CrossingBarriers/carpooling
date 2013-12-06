package carpooling

class TipoUsuarioController {
	
	def tipoUsuario() {
	}

	//def redirectMisViajes={

	//	redirect(controller:"misViajes", action:"renderMisViajesView")
	//}

	//def redirectViajesALosQueMeUni = {

	//	redirect(controller:"viajesALosQueUni", action:"renderMisViajesView")

	//}

	def renderTipoUsuarioView={
		
		String logueado = sec.loggedInUserInfo(field: 'username')
		def usuario = Usuario.findByUsername(logueado)
		session["usuarioLogueado"] = usuario
		
		render(view:"/carpooling/tipoUsuario") }
}
