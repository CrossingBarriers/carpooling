package carpooling
import carpooling.Usuario
import grails.transaction.Transactional

@Transactional
class AgregarVehiculoService {

	def serviceMethod() {
	}

	def buscarUsuario(usuario) {
		Usuario.findByUsername(usuario)
	}
}
