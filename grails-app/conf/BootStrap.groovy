import carpooling.Usuario
import carpooling.Vehiculo
import carpooling.UsuarioUnido
import carpooling.ViajeRegistrado
import carpooling.SecUsuario

class BootStrap {
	/*def springSecuritySevice*/
	def init = { servletContext ->
		
		def usuario1 = new Usuario(accountExpired:false,accountLocked:false,enabled:true,class:carpooling.SecUsuario,dni: 33222000, nombre: 'Maria', apellido: 'Lopez', username: 'marialopez@gmail.com',imagen:"A:/33222000.jpg",ocupacion:'Estudiante en UNLAM', telefono: 35282463 , password: '123', passwordExpired:false,conductor: false)
		usuario1.save()

		println usuario1
		
		def usuario2 = new Usuario(accountExpired:false,accountLocked:false,enabled:true,class:carpooling.SecUsuario,dni: 29157077, nombre: "Lucia", apellido: "Roldan", username: "luciaroldan@gmail.com",imagen:"A:/29157077.jpg", ocupacion:'Auditora en Nestle', telefono: 44414566 , password: 'abc123', passwordExpired:false,conductor: false)
		usuario2.save()

		println usuario2
//
//
//		/*def usuario3 = new Usuario(dni: 27100732, nombre: "Marcos", apellido: "Suarez", email: "marcossuarez@gmail.com",imagen:'ruta', telefono: 15309921 , contrasenia: 'ghi000', conductor: false)
//		usuario3.save()
//
//		println usuario3.errors*/
//
//		def vehiculo1 = new Vehiculo(patente: "MUA123", marca: "Chevrolet", modelo: "Cruze", cantidadAsientos: 3, imagen:"D:\\MUA123.jpg", usuario: usuario1) // El usuario 1 es conductor
//		vehiculo1.save(failOnError:true)
//
//		println vehiculo1.errors


		/*def vehiculo2 = new Vehiculo(patente: "JAA123", marca: "Chevrolet", modelo: "Cruze", cantidadAsientos: 3, usuario: usuario1) // El usuario 1 es conductor
		 vehiculo2.save()
		 println vehiculo2.errors*/


//		def viaje1 = new ViajeRegistrado(desde: "UNLaM - Florencio Varela, San Justo, Buenos Aires, Argentina", desdeLatitud: -34.669938, desdeLongitud: -58.562190999999984, hasta: "Bariloche, R�o Negro, Argentina", hastaLatitud: -41.1334722, hastaLongitud: -71.3102778, hora: 16, minutos: 30 , domingo: false, lunes: true, martes: false, miercoles: true, jueves: false, viernes: true, sabado: false, vehiculo: vehiculo1, colaboracion: 20, asientosLibres: 3, comentario: "-")
//		viaje1.save()
//
//
//		def viaje2 = new ViajeRegistrado(desde: "Walmart San Justo - Brig. Gral. Juan Manuel de Rosas, San Justo, Buenos Aires Province, Argentina", desdeLatitud: -34.68508, desdeLongitud: -58.558298000000036, hasta: "Bariloche, R�o Negro, Argentina", hastaLatitud: -41.1334722, hastaLongitud: -71.3102778, hora: 20, minutos: 00, domingo: false, lunes: false, martes: true, miercoles: false, jueves: true, viernes: false, sabado: false, vehiculo: vehiculo1, colaboracion: 20, asientosLibres: 3, comentario: "-")
//		viaje2.save()
//
//		println viaje2.errors
//		
//		def viaje3 = new ViajeRegistrado(desde: "Hospital Italiano de San Justo Agust�n Rocca, San Justo, Buenos Aires, Argentina", desdeLatitud: -34.669217, desdeLongitud: -58.56751400000002, hasta: "Bariloche, R�o Negro, Argentina", hastaLatitud: -41.1334722, hastaLongitud: -71.3102778, hora: 20, minutos: 30 , domingo: false, lunes: false, martes: true, miercoles: false, jueves: false, viernes: false, sabado: false, vehiculo: vehiculo1, colaboracion: 20, asientosLibres: 3, comentario: "-")
//		viaje3.save()
//
//		println viaje3.errors
	
//		def pasajero1 = new UsuarioUnido(viaje: viaje1, dia: 'L', usuario: usuario2)
//		pasajero1.save()
//
//		println pasajero1.errors
//
//
//		def pasajero2 = new UsuarioUnido(viaje: viaje1, dia: 'X', usuario: usuario2)
//		pasajero2.save()
//
//		println pasajero2.errors
//
//
//		def pasajero3 = new UsuarioUnido(viaje: viaje1, dia: 'L', usuario: usuario3)
//		pasajero3.save()
//
//		println pasajero3.errors
	}

	def destroy = {
	}
}