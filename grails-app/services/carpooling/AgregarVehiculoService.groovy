package carpooling
import carpooling.Usuario
import grails.transaction.Transactional

@Transactional
class AgregarVehiculoService {

	def serviceMethod() {
	}

	def find(usuarioDni) {
		Usuario.findAllByDni(usuarioDni)
	}
}
