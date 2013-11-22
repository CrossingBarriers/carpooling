package carpooling
import carpooling.Vehiculo
import grails.transaction.Transactional


@Transactional
class MisViajesService {

	def serviceMethod() {
	}

	def find(patente) {
		Vehiculo.findAllByPatente(patente)
	}
}
