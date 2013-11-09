package carpooling

class TipoUsuarioController {

    def tipoUsuario() { 
		
		
	}
	
	def redirectMisViajes={
		
		redirect(controller:"misViajes", action:"renderMisViajesView")
	}
	
	def redirectBusquedaDeViajes = {
		
		redirect(controller:"busquedaDeViajes", action:"renderBusquedaDeViajesView")
		
	}
	
	def renderTipoUsuarioView={
		render(view:"/carpooling/tipoUsuario")
	}
}
