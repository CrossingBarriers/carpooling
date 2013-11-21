package carpooling

import grails.transaction.Transactional

@Transactional
class MisMensajesService {
	
    def buscarMensajes(usuario) {
		Mensaje.findAllByReceptor(usuario)
    }
}
