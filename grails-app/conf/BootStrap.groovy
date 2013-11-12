import carpooling.Usuario
import carpooling.Vehiculo
import carpooling.ViajeRegistrado

class BootStrap {

	def init = { servletContext ->

		def usuario1 = new Usuario(dni: 33222000, nombre: 'Maria', apellido: 'Lopez', email: 'marialopez@gmail.com', telefono: 35282463 , contrasenia: 'abc123', conductor: true)
		usuario1.save()

		println usuario1.errors


		def usuario2 = new Usuario(dni: 29157077, nombre: "Lucia", apellido: "Roldan", email: "luciaroldan@gmail.com", telefono: 44414566 , contrasenia: 'def456', conductor: false)
		usuario2.save()

		println usuario2


		def usuario3 = new Usuario(dni: 27100732, nombre: "Marcos", apellido: "Suarez", email: "marcossuarez@gmail.com", telefono: 15309921 , contrasenia: 'ghi000', conductor: false)
		usuario3.save()

		println usuario3

		def vehiculo1 = new Vehiculo(patente: "MUA123", marca: "Chevrolet", modelo: "Cruze", cantidadAsientos: 3, usuario: usuario1) // El usuario 1 es conductor
		vehiculo1.save(failOnError:true)

		println vehiculo1.errors


		def viaje1 = new ViajeRegistrado(desde: "UNLaM - Florencio Varela, San Justo, Buenos Aires, Argentina", hasta: "Palermo, Buenos Aires, Argentina", hora: 16, minutos: 30 , domingo: false, lunes: true, martes: false, miercoles: true, jueves: false, viernes: true, sabado: false, vehiculo: vehiculo1, colaboracion: 20, asientosLibres: 3, comentario: "-")
		viaje1.save()

		println viaje1.errors


		def viaje2 = new ViajeRegistrado(desde: "Walmart San Justo - Brig. Gral. Juan Manuel de Rosas, San Justo, Buenos Aires Province, Argentina", hasta: "Plaza de Mayo - Hip�lito Yrigoyen, Buenos Aires, Argentina", hora: 20, minutos: 00, domingo: false, lunes: false, martes: true, miercoles: false, jueves: true, viernes: false, sabado: false, vehiculo: vehiculo1, colaboracion: 20, asientosLibres: 3, comentario: "-")
		viaje2.save()

		println viaje2.errors

	}

	def destroy = {
	}
}