package carpooling
import  carpooling.Usuario
import  carpooling.Vehiculo
import  carpooling.ViajeRegistrado
import grails.transaction.Transactional

@Transactional
class MisViajesService {
	//def springSecurityService

	def serviceMethod() {
	}

	def buscarVehiculo(patente) {
		Vehiculo.findAllByPatente(patente)
	}

	def eliminarViaje(id){
		def miViaje=ViajeRegistrado.get(id)
		miViaje.delete()
	}

	def eliminarVehiculo(id){
		//def usuarioDni=springSecurityService.principal.dni
		Integer usuarioDni=33222000
		def miVehiculo=Vehiculo.get(id)//Recibe como parámetro el id del registro
		//El usuario cambia su estado:sera pasajero
		Usuario.executeUpdate("update Usuario user set user.conductor='false' where user.dni=?",[usuarioDni])
		miVehiculo.delete()
	}
}
