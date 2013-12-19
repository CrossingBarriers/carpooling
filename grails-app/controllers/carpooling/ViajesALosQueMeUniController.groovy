package carpooling

//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails

class ViajesALosQueMeUniController {
	
	def viajesALosQueMeUniService

	def viajesALosQueMeUni() {
	}

	def renderViajesALosQueMeUniView = {
		
		def usuarioLogueado = sec.loggedInUserInfo(field: 'username')
		
		def usuario = Usuario.findByUsername(usuarioLogueado)
		
		def viajeConPasajero = viajesALosQueMeUniService.buscarUsuariosUnidosAViaje(usuario)

		render(view:"/carpooling/viajesALosQueMeUni", model:[viajeConPasajero:viajeConPasajero])
		
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
		def viaje = params.idViaje

		def usuario = Usuario.findByUsername(usuarioLogueado)

		println "Domingo: " + domingo
		println "Lunes: " + lunes
		println "Martes: " + martes
		println "Miercoles: " + miercoles
		println "Jueves: " + jueves
		println "Viernes: " + viernes
		println "Sabado: " + sabado


		if (domingo == "D"){

			def agregar = new UsuarioUnido(viaje:viaje, dia:"D", usuario:usuario)
			agregar.save()
		}
		if (lunes == "L"){

			def agregar = new UsuarioUnido(viaje:viaje, dia:"L", usuario:usuario)
			agregar.save()
		}
		if (martes == "M"){

			def agregar = new UsuarioUnido(viaje:viaje, dia:"M", usuario:usuario)
			agregar.save()
		}
		if (miercoles == "X"){

			def agregar = new UsuarioUnido(viaje:viaje, dia:"X", usuario:usuario)
			agregar.save()
		}
		if (jueves == "J"){

			def agregar = new UsuarioUnido(viaje:viaje, dia:"J", usuario:usuario)
			agregar.save()
		}
		if (viernes == "V"){

			def agregar = new UsuarioUnido(viaje:viaje, dia:"V", usuario:usuario)
			agregar.save()
		}
		if (sabado == "S"){

			def agregar = new UsuarioUnido(viaje:viaje, dia:"S", usuario:usuario)
			agregar.save()
		}
		
		def viajeConPasajero = viajesALosQueMeUniService.buscarUsuariosUnidosAViaje(usuario)
		
		println "viajeConPasajero en controller: " + viajeConPasajero
		
		render(view:"/carpooling/viajesALosQueMeUni", model:[viajeConPasajero:viajeConPasajero])
		
	}
}
