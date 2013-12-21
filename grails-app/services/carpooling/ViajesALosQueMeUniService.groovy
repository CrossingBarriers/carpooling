package carpooling

import grails.transaction.Transactional

@Transactional
class ViajesALosQueMeUniService {

	def buscarUsuariosUnidosAViaje(usuario) {

		def viajePasajero = UsuarioUnido.findAll("from UsuarioUnido as u where u.usuario = :usuario", [usuario:usuario])
	}

	def eliminarUsuarioUnido(id){
		def eliminoUnido = UsuarioUnido.get(id)
		eliminoUnido.delete()
	}
}
