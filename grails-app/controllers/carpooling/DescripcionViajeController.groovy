package carpooling

class DescripcionViajeController {
	
	def descripcionViajeService

    def renderDescripcionViajeView =  {
		
		render(view:"/carpooling/descripcionViaje")
		
	}
	
	def guardarMensaje() {
		Integer idEmisor = 33222000 //aca deberia tomar el dni del usuario logueado
		
		Integer idReceptor = Integer.parseInt(params.receptor)
		
		def emisor = descripcionViajeService.buscarUsuario(idEmisor)
		def receptor = descripcionViajeService.buscarUsuario(idReceptor)
		
		def mensaje = new Mensaje(mensaje:params.mensaje, receptor:receptor, emisor:emisor).save()
		render(view:"/carpooling/descripcionViaje")
	}
}
