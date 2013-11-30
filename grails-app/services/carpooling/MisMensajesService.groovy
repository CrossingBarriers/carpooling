package carpooling

import grails.transaction.Transactional

@Transactional
class MisMensajesService {
	
    def buscarReceptor(usuario) {
		Usuario.findByDni(usuario)
	}
	
    def buscarMensajes(usuario) {
		Mensaje.findAllByReceptor(usuario)
    }
	
}
