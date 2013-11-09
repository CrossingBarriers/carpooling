package carpooling

import grails.transaction.Transactional

@Transactional
class AgregarVehiculoService {
    def guardar(idUsuario) {
		Vehiculo.findAllByIdUsuario(idUsuario)
    }
	
	def lista(usuario){
		Vehiculo.findAllByIdUsuario(usuario)
	}
}
