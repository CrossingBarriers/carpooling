import carpooling.Usuario
import carpooling.Vehiculo
import carpooling.ViajeRegistrado

class BootStrap {

	def init = { servletContext ->

		def usuario1 = new Usuario(nombre: "Maria", apellido: "Lopez", dni: 33157053 , email: "marialopez@gmail.com", telefono: 35282463 , contrasenia: 'abc123', conductor: true)
		usuario1.save()

		println usuario1


		def usuario2 = new Usuario(nombre: "Lucia", apellido: "Roldan", dni: 29157077 , email: "luciaroldan@gmail.com", telefono: 44414566 , contrasenia: 'def456', conductor: false)
		usuario2.save()

		println usuario2


		def usuario3 = new Usuario(nombre: "Marcos", apellido: "Suarez", dni: 27100732 , email: "marcossuarez@gmail.com", telefono: 15309921 , contrasenia: 'ghi000', conductor: false)
		usuario3.save()

		println usuario3

		def vehiculo1 = new Vehiculo(patente: "MUA123", marca: "Chevrolet", modelo: "Cruze", cantidadAsientos: 3, usuario: 1) // El usuario 1 es conductor
		vehiculo1.save()

		println vehiculo1

		def viaje1 = new ViajeRegistrado(desde: "UNLaM - Florencio Varela, San Justo, Buenos Aires, Argentina", hasta: "Palermo, Buenos Aires, Argentina", horaSalida: "2013-12-12 16:30:00.0" , domingo: false, lunes: true, martes: false, miercoles: true, jueves: false, viernes: true, sabado: false, vehiculo: 1, colaboracion: 20, asientosLibres: 3, comentario: "-")
		viaje1.save()
		
		println viaje1


	/*	def viaje2 = new ViajeRegistrado(desde: "Walmart San Justo - Brig. Gral. Juan Manuel de Rosas, San Justo, Buenos Aires Province, Argentina", hasta: "Plaza de Mayo - Hipólito Yrigoyen, Buenos Aires, Argentina", horaSalida: "2013-12-12 16:30:00" ,  domingo: false, lunes: false, martes: true, miercoles: false, jueves: true, viernes: false, sabado: false, vehiculo: 1, colaboracion: 20, asientosLibres: 3, comentario: "-")
		viaje2.save()
		
		println viaje2 */

	}

	def destroy = {
	}
}