package carpooling

class MisMensajesController {
	
	def misMensajesService
	
    def listarMensajes() {
		Integer usuario = 29157077
		
		def receptor = misMensajesService.buscarReceptor(usuario)
		def mensajes = misMensajesService.buscarMensajes(receptor)
		
		render (view:"/carpooling/misMensajes", model:[mensajes:mensajes])
	}
	
	def borrarMensaje(String id){
		def miMensaje=Mensaje.get(id)//El método get recibe como parámetro el id del registro
		miMensaje.delete()
		
		try {
			Thread.sleep(2000);
			} catch (InterruptedException ex) {
			// aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
			}
			
		render '<p style="text-align:center;">Mensaje eliminado</p>'
	}
	
	def guardarMensaje() {
		Integer idEmisor = 33222000 //aca deberia tomar el dni del usuario logueado
		
		Integer idReceptor = Integer.parseInt(params.receptor)
		
		def emisor = misMensajesService.buscarReceptor(idEmisor)
		def receptor = misMensajesService.buscarReceptor(idReceptor)
		
		def mensaje = new Mensaje(mensaje:params.mensaje, receptor:receptor, emisor:emisor).save()
		render(view:"/carpooling/descripcionViaje")
	}
	
}
