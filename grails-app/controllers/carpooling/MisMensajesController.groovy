package carpooling

class MisMensajesController {
	
	def misMensajesService
	
    def listarMensajes() {
		Integer usuario = 29157077
		
		def receptor = misMensajesService.buscarReceptor(usuario)
		def mensajes = misMensajesService.buscarMensajes(receptor)
		
		render (view:"/carpooling/misMensajes", model:[mensajes:mensajes])
	}
}
