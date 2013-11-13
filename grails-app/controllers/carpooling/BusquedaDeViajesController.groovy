package carpooling

class BusquedaDeViajesController {

    def busquedaDeViajes() {
		
		
	}
	
	def renderBusquedaDeViajesView =  {
		
	  render(view:"/carpooling/busquedaDeViajes")
		
	}
	
	def redirectResultadoBusquedaController = {
		
		redirect(controller:"resultadoBusqueda", action:"renderResultadoBusquedaView")
		
	}
	
	def redirectIndexController = {
		
		redirect(controller:"index", action:"renderIndexView")
		
	}
	
	def redirectMiembrosComunidadController = {

		redirect(controller:"miembrosComunidad", action:"renderMiembrosComunidadView")
	}
	
	def redirectTipoUsuarioController={
		redirect(controller:"tipoUsuario", action:"renderTipoUsuarioView")
	}
}
