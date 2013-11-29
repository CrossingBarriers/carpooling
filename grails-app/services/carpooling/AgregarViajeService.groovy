package carpooling
import  carpooling.Usuario
import  carpooling.Vehiculo
import grails.transaction.Transactional

@Transactional
class AgregarViajeService {

    def serviceMethod() {

    }
	def buscarUsuario(usuarioDni) {
		Usuario.findAllByDni(usuarioDni)
	}
	def buscarVehiculo(usuario){
		Vehiculo.findAllByUsuario(usuario)
	}
	def agregarPatente(id){
		Vehiculo.get(id)
	}
}
