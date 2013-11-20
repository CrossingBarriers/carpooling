package carpooling

class BusquedaDeViajesController {
	
	def busquedaDeViajesService

    def busquedaDeViajes() {
		
		
	}
	
	def renderBusquedaDeViajesView =  {
		
	  render(view:"/carpooling/busquedaDeViajes")
		
	}
	
	def buscarViajes = {
		
		/*def busqueda = new Busqueda(desde:params.desde, hasta:params.hasta, hh:params.hh, mm:params.mm).save()
		def lista = busquedaDeViajesService.busquedaViajes(busqueda)
		redirect(controller:"resultadoBusqueda", action:"renderResultadoBusquedaView", params:[resultadosId: lista.id.join(',')])*/
		
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
