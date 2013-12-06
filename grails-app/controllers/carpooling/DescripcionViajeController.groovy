package carpooling

class DescripcionViajeController {
	
	def descripcionViajeService
	
	def descripcionViaje() {
	}

    def renderDescripcionViajeView =  {
		
		render(view:"/carpooling/descripcionViaje")
		
	}
	
	def guardarMensaje() {
		Integer idEmisor = 33222000 //aca deberia tomar el dni del usuario logueado
		
		Integer idReceptor = Integer.parseInt(params.receptor)
		
		def emisor = descripcionViajeService.buscarUsuario(idEmisor)
		def receptor = descripcionViajeService.buscarUsuario(idReceptor)
		
		def mensaje = new Mensaje(mensaje:params.mensaje, receptor:receptor, emisor:emisor, idRespuesta: 0)
		mensaje.save()
	
		
		try {
			Thread.sleep(2000);
			} catch (InterruptedException ex) {
			// aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
			}
			
		render '<p style="text-align:center;">Mensaje enviado</p>'
	}
}
