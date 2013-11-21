package carpooling

class MisMensajesController {
	
	def misMensajesService
	
    def listarMensajes() {
		Integer usuario = 29157077
		
		def mensajes = misMensajesService.buscarMensajes(usuario)
		
		render (view:"/carpooling/misMensajes", model:[mensajes:mensajes])
	}
}
