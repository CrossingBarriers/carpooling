package carpooling

import grails.transaction.Transactional

@Transactional
class DescripcionViajeService {

    def buscarUsuario(usuario) {
		Usuario.findAllByDni(usuario)
    }
}
