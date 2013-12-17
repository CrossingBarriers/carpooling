package carpooling

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails

class ViajesALosQueMeUniController {
	
	def ViajesALosQueMeUniService

	def viajesALosQueMeUni() {
	}

	def renderMisViajesView = {

		render(view:"/carpooling/viajesALosQueMeUni")
	}

	def usuarioQueSeUne = {

		def usuarioLogueado = sec.loggedInUserInfo(field: 'username')
		def domingo = params.domingoCheckbox
		def lunes = params.lunesCheckbox
		def martes = params.martesCheckbox
		def miercoles = params.miercolesCheckbox
		def jueves= params.juevesCheckbox
		def viernes = params.viernesCheckbox
		def sabado = params.sabadoCheckbox
		def idViaje = params.idViaje

		def usuario = Usuario.findByUsername(usuarioLogueado)

		println "Domingo: " + domingo
		println "Lunes: " + lunes
		println "Martes: " + martes
		println "Miercoles: " + miercoles
		println "Jueves: " + jueves
		println "Viernes: " + viernes
		println "Sabado: " + sabado

		println usuario.dni

		if (domingo == "D"){

			def agregar = new UsuarioUnido(viaje:idViaje, dia:"D", usuario:usuario)
			agregar.save()
		}
		if (lunes == "L"){

			def agregar = new UsuarioUnido(viaje:idViaje, dia:"L", usuario:usuario)
			agregar.save()
		}
		if (martes == "M"){

			def agregar = new UsuarioUnido(viaje:idViaje, dia:"M", usuario:usuario)
			agregar.save()
		}
		if (miercoles == "X"){

			def agregar = new UsuarioUnido(viaje:idViaje, dia:"X", usuario:usuario)
			agregar.save()
		}
		if (jueves == "J"){

			def agregar = new UsuarioUnido(viaje:idViaje, dia:"J", usuario:usuario)
			agregar.save()
		}
		if (viernes == "V"){

			def agregar = new UsuarioUnido(viaje:idViaje, dia:"V", usuario:usuario)
			agregar.save()
		}
		if (sabado == "S"){

			def agregar = new UsuarioUnido(viaje:idViaje, dia:"S", usuario:usuario)
			agregar.save()
		}

		def viaje = ViajesALosQueMeUniService.buscarViaje(idViaje)

		render(view:"/carpooling/viajesALosQueMeUni")
	}
}
