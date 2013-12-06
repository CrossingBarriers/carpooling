package carpooling

class DescripcionViajeController {
	
	def descripcionViajeService

    def renderDescripcionViajeView =  {
		
		String idUsuario = params.idUsuario
		def usuario = descripcionViajeService.buscarUsuario(idUsuario)
		def vehiculo = descripcionViajeService.buscarVehiculo(usuario)
		def viaje = descripcionViajeService.buscarViaje(vehiculo)
		
		render(view:"/carpooling/descripcionViaje", model:[usuario:usuario, vehiculo:vehiculo, viaje:viaje])
		
	}
	
	def guardarMensaje() {
		String logueado = sec.loggedInUserInfo(field: 'username')
		
		String idReceptor = params.receptor
		
		def emisor = descripcionViajeService.buscarUsuario(logueado)
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
