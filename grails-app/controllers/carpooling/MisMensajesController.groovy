package carpooling

class MisMensajesController {
	
	def misMensajesService
	
    def listarMensajes() {
		String logueado = sec.loggedInUserInfo(field: 'username')
		
		def receptor = misMensajesService.buscarReceptor(logueado)
		def mensajes = misMensajesService.buscarMensajes(receptor)
		
		if(mensajes){
			render (view:"/carpooling/misMensajes", model:[mensajes:mensajes])
		}else{
			flash.message="No tienes mensajes"
			render (view:"/carpooling/misMensajes", model:[mensajes:mensajes])
		}
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
	
	def responderMensaje() {
		String logueado = sec.loggedInUserInfo(field: 'username')
		
		String idReceptor = params.receptor
		
		def emisor = misMensajesService.buscarReceptor(logueado)
		def receptor = misMensajesService.buscarReceptor(idReceptor)
		
		def respuesta = new Mensaje(mensaje:params.mensaje, receptor:receptor, emisor:emisor, idRespuesta: 0).save()
		
		def tiempo = g.formatDate(date:respuesta.dateCreated, format: "yyyy-MM-dd'T'HH:mm")
		
		def mensaje = Mensaje.get(params.idMensaje)
		
		mensaje.idRespuesta = respuesta.id
		
		mensaje.save()
		
		try {
			Thread.sleep(2000);
			} catch (InterruptedException ex) {
			// aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
			}
		
		render '<script type="text/javascript">jQuery("abbr.timeago").timeago();</script><span class="glyphicon glyphicon-comment"></span> '+respuesta.mensaje+' <abbr class="timeago" title="'+tiempo+'" style="font-size: 12px; color: #68B0D3; cursor: default; border-bottom: 0;"></abbr>'
	}
	
	def buscarRespuesta(){
		
		def respuesta = Mensaje.get(params.idRespuesta)
		
		if(respuesta){
			render '<script type="text/javascript">jQuery("abbr.timeago").timeago();</script><span class="glyphicon glyphicon-comment"></span> '+respuesta.mensaje+' <abbr class="timeago" title="'+respuesta.dateCreated+'" style="font-size: 12px; color: #68B0D3; cursor: default; border-bottom: 0;"></abbr>'
		}else{
			render '<div class="alert alert-danger"><p>Mensaje no disponible</p></div>'
		}
	}
	
}
