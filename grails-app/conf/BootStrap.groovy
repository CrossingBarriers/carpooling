import carpooling.Usuario
import carpooling.Vehiculo
import carpooling.UsuarioUnido
import carpooling.ViajeRegistrado
import carpooling.SecUsuario

class BootStrap {

	def init = { servletContext ->

		//USUARIOS:
		def usuario1 = new Usuario(accountExpired:false,accountLocked:false,enabled:true,class:carpooling.SecUsuario,dni: 33222000, nombre: 'Maria', apellido: 'Lopez', username: 'marialopez@gmail.com',imagen:"C:/33222000.jpg",ocupacion:'Estudiante en UNLAM', telefono: 35282463 , password: '123', passwordExpired:false,conductor: true)
		usuario1.save()
		//println usuario1

		def usuario2 = new Usuario(accountExpired:false,accountLocked:false,enabled:true,class:carpooling.SecUsuario,dni: 29157077, nombre: "Lucia", apellido: "Roldan", username: "luciaroldan@gmail.com",imagen:"C:/29157077.jpg", ocupacion:'Auditora en Nestle', telefono: 44414566 , password: 'abc123', passwordExpired:false,conductor: false)
		usuario2.save()
		//println usuario2

		def usuario3 = new Usuario(accountExpired:false,accountLocked:false,enabled:true,class:carpooling.SecUsuario,dni: 27100732, nombre: "Marcos", apellido: "Suarez", username: "marcossuarez@gmail.com",imagen:"C:/27100732.jpg",ocupacion:'Electricista matriculado', telefono: 1530992164 , password: 'mar123',passwordExpired:false, conductor: true)
		usuario3.save()
		//println usuario3

		def usuario4 = new Usuario(accountExpired:false,accountLocked:false,enabled:true,class:carpooling.SecUsuario,dni: 36908127, nombre: "Patricia", apellido: "Peralta", username: "patriciaperalta@gmail.com",imagen:"C:/36908127.jpg",ocupacion:'Contadora senior en Techint', telefono: 46890244 , password: 'pat123',passwordExpired:false, conductor: false)
		usuario4.save()
		//println usuario4

		def usuario5 = new Usuario(accountExpired:false,accountLocked:false,enabled:true,class:carpooling.SecUsuario,dni: 29875321, nombre: "Martina", apellido: "Ponce", username: "martinaponce@gmail.com",imagen:"C:/29875321.jpg",ocupacion:'Estudiante en UM', telefono: 1567204311 , password: 'mpo123',passwordExpired:false, conductor: true)
		usuario5.save()
		//println usuario5

		def usuario6 = new Usuario(accountExpired:false,accountLocked:false,enabled:true,class:carpooling.SecUsuario,dni: 33678600, nombre: "Romina", apellido: "Monte", username: "rominamonte@gmail.com",imagen:"C:/33678600.jpg",ocupacion:'Trabajo en recursos humanos', telefono: 1530908844 , password: 'rom123',passwordExpired:false, conductor: false)
		usuario6.save()
		//println usuario6

		//VEHICULOS:
		def vehiculo1 = new Vehiculo(patente: "MUA123", marca: "Chevrolet", modelo: "Cruze", cantidadAsientos: 3, imagen:"C:/MUA123.jpg", usuario: usuario1) // El usuario 1 es conductor
		vehiculo1.save()
		//println vehiculo1

		def vehiculo2 = new Vehiculo(patente: "JAA123", marca: "Chevrolet", modelo: "Corsa", cantidadAsientos: 4, imagen:"C:/JAA123.jpg",usuario: usuario3) // El usuario 3 es conductor
		vehiculo2.save()
		//println vehiculo2

		def vehiculo3 = new Vehiculo(patente: "FQN800", marca: "Peugeot", modelo: "307", cantidadAsientos: 4, imagen:"C:/FQN800.jpg",usuario: usuario5) // El usuario 5 es conductor
		vehiculo3.save()
		//println vehiculo3

		//VIAJES:
		def viaje1 = new ViajeRegistrado(desde: "UNLaM - Florencio Varela, San Justo, Buenos Aires, Argentina", desdeLatitud: -34.669938, desdeLongitud: -58.562190999999984, hasta: "Castelar, Buenos Aires, Argentina", hastaLatitud: -34.6554584, hastaLongitud:-58.64524369999998, hora: 10, minutos: 30 , domingo: null, lunes: null, martes: 'M', miercoles: null, jueves: 'J', viernes: 'V', sabado: null, vehiculo: vehiculo1, colaboracion: 25, asientosLibres: 3, comentario: "Nada para comentar")
		viaje1.save()
		//println viaje1

		def viaje2 = new ViajeRegistrado(desde: "Walmart San Justo - Brig. Gral. Juan Manuel de Rosas, San Justo, Buenos Aires Province, Argentina", desdeLatitud: -34.68508, desdeLongitud: -58.558298000000036, hasta: "Plaza del Congreso, Buenos Aires, Argentina", hastaLatitud:-34.609814, hastaLongitud:-58.390409999999974, hora: 15, minutos: 30, domingo: null, lunes: 'L', martes: null, miercoles: null, jueves: null, viernes: 'V', sabado: null, vehiculo: vehiculo1, colaboracion: 50, asientosLibres: 3, comentario: "Dudas por mensaje")
		viaje2.save()
		//println viaje2

		def viaje3 = new ViajeRegistrado(desde: "UNLaM - Florencio Varela, San Justo, Buenos Aires, Argentina", desdeLatitud: -34.669938, desdeLongitud: -58.562190999999984, hasta: "Castelar, Buenos Aires, Argentina", hastaLatitud: -34.6554584, hastaLongitud:-58.64524369999998, hora: 11, minutos: 15 , domingo: null, lunes: 'L', martes: null, miercoles: 'X', jueves: null, viernes: null, sabado: null, vehiculo: vehiculo1, colaboracion: 25, asientosLibres: 3, comentario: "-")
		viaje3.save()
		//println viaje3

		def viaje4 = new ViajeRegistrado(desde: "UNLaM - Florencio Varela, San Justo, Buenos Aires, Argentina", desdeLatitud: -34.669938, desdeLongitud: -58.562190999999984, hasta: "Castelar, Buenos Aires, Argentina", hastaLatitud: -34.6554584, hastaLongitud:-58.64524369999998, hora: 11, minutos: 30 , domingo: null, lunes: 'L', martes: null, miercoles: null, jueves: 'J', viernes: 'V', sabado:null, vehiculo: vehiculo2, colaboracion: 75, asientosLibres: 4, comentario: "Viajo solo esos dias")
		viaje4.save()
		//println viaje4

		def viaje5 = new ViajeRegistrado(desde: "Berna 2101, Isidro Casanova, Buenos Aires, Argentina", desdeLatitud:-34.6938476, desdeLongitud:-58.59407799999997, hasta: "Tigre, Buenos Aires, Argentina", hastaLatitud:-34.425087, hastaLongitud:-58.579658499999994, hora: 06, minutos: 00, domingo: null, lunes: null, martes: null, miercoles: null, jueves: null, viernes: null, sabado: 'S', vehiculo: vehiculo2, colaboracion: 100, asientosLibres: 4, comentario: "Viajo solo los sabados")
		viaje5.save()
		//println viaje5

		def viaje6 = new ViajeRegistrado(desde: "Palermo, Buenos Aires, Argentina", desdeLatitud:-34.5888889, desdeLongitud:-58.43055559999999, hasta: "Moreno, Buenos Aires, Argentina", hastaLatitud:-34.6340099, hastaLongitud:-58.791382, hora: 07, minutos: 45, domingo: 'D', lunes: null, martes: 'M', miercoles: null, jueves: null, viernes: null, sabado: null, vehiculo: vehiculo2, colaboracion: 300, asientosLibres: 4, comentario: "-")
		viaje6.save()
		//println viaje6

		def viaje7 = new ViajeRegistrado(desde: "Walmart San Justo - Brig. Gral. Juan Manuel de Rosas, San Justo, Buenos Aires Province, Argentina", desdeLatitud: -34.68508, desdeLongitud: -58.558298000000036, hasta: "Plaza del Congreso, Buenos Aires, Argentina", hastaLatitud:-34.609814, hastaLongitud:-58.390409999999974, hora: 14, minutos: 15 , domingo: null, lunes: 'L', martes: null, miercoles: 'X', jueves: null, viernes: 'V', sabado:null, vehiculo: vehiculo3, colaboracion: 50, asientosLibres: 4, comentario: "Consultas por msj")
		viaje7.save()
		//println viaje7

		def viaje8 = new ViajeRegistrado(desde: "Palermo, Buenos Aires, Argentina", desdeLatitud:-34.5888889, desdeLongitud:-58.43055559999999, hasta: "Moreno, Buenos Aires, Argentina", hastaLatitud:-34.6340099, hastaLongitud:-58.791382, hora: 06, minutos: 30, domingo: 'D', lunes: null, martes: null, miercoles: null, jueves: null, viernes: null, sabado: 'S', vehiculo: vehiculo3, colaboracion: 330, asientosLibres: 4, comentario: "-")
		viaje8.save()
		//println viaje8


	}

	def destroy = {
	}
}