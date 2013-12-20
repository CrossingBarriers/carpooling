package carpooling

class DescripcionViajeController {

	def descripcionViajeService

	def descripcionViaje() {
	}

	def renderDescripcionViajeView =  {

		String idUsuario = params.idUsuario
		String idViaje = params.idViaje
		def usuario = descripcionViajeService.buscarUsuario(idUsuario)
		def vehiculo = descripcionViajeService.buscarVehiculo(usuario)
		def viaje = descripcionViajeService.buscarViaje(idViaje)

		//		println "usuario: " + usuario
		//		println "vehiculo: " + vehiculo
		//		println "viaje: " + viaje

		def libresDomingo
		def libresLunes
		def libresMartes
		def libresMiercoles
		def libresJueves
		def libresViernes
		def libresSabado


		if (viaje.domingo == 'D'){

			def ocupadosDomingo = descripcionViajeService.contarAsientosOcupados(viaje, viaje.domingo)

			libresDomingo = vehiculo.cantidadAsientos - ocupadosDomingo
		}

		if (viaje.lunes == 'L'){

			def ocupadosLunes = descripcionViajeService.contarAsientosOcupados(viaje, viaje.lunes)

			libresLunes = vehiculo.cantidadAsientos - ocupadosLunes
		}

		if (viaje.martes == 'M'){

			def ocupadosMartes = descripcionViajeService.contarAsientosOcupados(viaje, viaje.martes)

			libresMartes = vehiculo.cantidadAsientos - ocupadosMartes

		}

		if (viaje.miercoles == 'X'){

			def ocupadosMiercoles = descripcionViajeService.contarAsientosOcupados(viaje, viaje.miercoles)

			libresMiercoles = vehiculo.cantidadAsientos - ocupadosMiercoles
		}

		if (viaje.jueves == 'J'){

			def ocupadosJueves = descripcionViajeService.contarAsientosOcupados(viaje, viaje.jueves)

			libresJueves = vehiculo.cantidadAsientos - ocupadosJueves
		}

		if (viaje.viernes == 'V'){

			def ocupadosViernes = descripcionViajeService.contarAsientosOcupados(viaje, viaje.viernes)

			libresViernes = vehiculo.cantidadAsientos - ocupadosViernes
		}

		if (viaje.sabado == 'S'){

			def ocupadosSabado = descripcionViajeService.contarAsientosOcupados(viaje, viaje.sabado)

			libresSabado = vehiculo.cantidadAsientos - ocupadosSabado
		}

		def asientosLibres = new DiasAsientosLibres(domingo:libresDomingo, lunes:libresLunes, martes:libresMartes, miercoles:libresMiercoles,
		jueves:libresJueves, viernes:libresViernes, sabado:libresSabado)

		asientosLibres.save()

		render(view:"/carpooling/descripcionViaje", model:[usuario:usuario, vehiculo:vehiculo, viaje:viaje, asientosLibres:asientosLibres])
	}

	def guardarMensaje() {
		String logueado = sec.loggedInUserInfo(field: 'username')

		String idReceptor = params.receptor

		def emisor = descripcionViajeService.buscarUsuario(logueado)
		def receptor = descripcionViajeService.buscarUsuario(idReceptor)

		def mensaje = new Mensaje(mensaje:params.mensaje, receptor:receptor, emisor:emisor, idRespuesta: 0)
		mensaje.save()


		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			// aquí tratamos la excepción como queramos, haciendo nada, sacando por pantalla el error, ...
		}

		render '<p style="text-align:center;">Mensaje enviado</p>'
	}
}
