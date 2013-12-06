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
	
	def responderMensaje() {
		Integer idEmisor = 33222000 //aca deberia tomar el dni del usuario logueado
		
		Integer idReceptor = Integer.parseInt(params.receptor)
		
		def emisor = misMensajesService.buscarReceptor(idEmisor)
		def receptor = misMensajesService.buscarReceptor(idReceptor)
		
		def respuesta = new Mensaje(mensaje:params.mensaje, receptor:receptor, emisor:emisor, idRespuesta: 0).save()
		
		def mensaje = Mensaje.get(params.idMensaje)
		
		mensaje.idRespuesta = respuesta.id
		
		mensaje.save()
		
		try {
			Thread.sleep(2000);
			} catch (InterruptedException ex) {
			// aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
			}
		
		render '<script type="text/javascript">jQuery("abbr.timeago").timeago();</script><span class="glyphicon glyphicon-comment"></span> '+respuesta.mensaje+' <abbr class="timeago" title="'+mensaje.dateCreated+'" style="font-size: 12px; color: #68B0D3; cursor: default; border-bottom: 0;"></abbr>'
	}
	
	def buscarRespuesta(){
		
		println params.idRespuesta
		
		def respuesta = Mensaje.get(params.idRespuesta)
		
		render '<script type="text/javascript">jQuery("abbr.timeago").timeago();</script><span class="glyphicon glyphicon-comment"></span> '+respuesta.mensaje+' <abbr class="timeago" title="'+respuesta.dateCreated+'" style="font-size: 12px; color: #68B0D3; cursor: default; border-bottom: 0;"></abbr>'
	}
	
}
