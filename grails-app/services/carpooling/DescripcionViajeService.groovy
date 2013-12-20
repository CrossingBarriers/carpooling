package carpooling

import grails.transaction.Transactional

@Transactional
class DescripcionViajeService {

    def buscarUsuario(usuario) {
		Usuario.findByUsername(usuario)
    }
	
	def buscarVehiculo(usuario) {
		Vehiculo.findByUsuario(usuario)
	}
	
	def buscarViaje(idViaje) {
		ViajeRegistrado.findById(idViaje)
	}
	
	def contarAsientosOcupados(viaje, dia){
		
		def cuenta = UsuarioUnido.countByViajeAndDia(viaje, dia)
	}
}
