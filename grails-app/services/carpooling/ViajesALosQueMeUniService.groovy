package carpooling

import grails.transaction.Transactional

@Transactional
class ViajesALosQueMeUniService {
	
	def buscarUsuariosUnidosAViaje(usuario) {
		
		//def viajeQueMeUni = ViajeRegistrado.get(idViaje)
		
		def viajePasajero = UsuarioUnido.findAll("from UsuarioUnido as u where u.usuario = :usuario", [usuario:usuario])
		
	}
}
