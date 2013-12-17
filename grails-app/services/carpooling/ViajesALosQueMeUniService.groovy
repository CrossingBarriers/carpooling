package carpooling

import grails.transaction.Transactional

@Transactional
class ViajesALosQueMeUniService {

    def serviceMethod() {

    }
	
	def buscarViaje(patente) {
		ViajeRegistrado.findAllById(patente) //ver
	}
}
