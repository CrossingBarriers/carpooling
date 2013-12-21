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

	def buscarUsuarioLogueado(logueado){
		Usuario.findByUsername(logueado)
	}

	def buscarUsuario(usuario){
		Vehiculo.findByUsuario(usuario)
	}

	def buscarViaje(map){
		ViajeRegistrado.findAllByVehiculo(map)
	}

	def eliminarViaje(id){
		def miViaje=ViajeRegistrado.get(id)
		def usuariosUnidos = UsuarioUnido.findAllByViaje(miViaje)

		for(registro in usuariosUnidos){
			registro.delete()
		}

		miViaje.delete()
	}

	def eliminarVehiculo(id){
		def miVehiculo=Vehiculo.get(id)//Recibe como parámetro el id del registro
		miVehiculo.delete()
	}
}
