package carpooling
import  carpooling.ViajeRegistrado

class AgregarViajeController {
	def agregarViajeService
	//def springSecurityService

	def agregarViaje(){
	}

	def renderAgregarViajeView =  {render(view:"/carpooling/agregarViaje")}

	def agregarNuevo(String id){
		def miPatente=agregarViajeService.agregarPatente(id)
		render view:"/carpooling/agregarViaje", model:[miPatente:miPatente]
	}

	def guardarViaje(){
		String logueado = sec.loggedInUserInfo(field: 'username')
		
		def usuario = agregarViajeService.buscarUsuario(logueado)
		def vehiculo=agregarViajeService.buscarVehiculo(usuario)
		def viaje=new ViajeRegistrado(desde:params.desde,desdeLatitud:params.desdelat.toDouble(),desdeLongitud:params.desdelong.toDouble(),hasta:params.hasta,
		hastaLatitud:params.hastalat.toDouble(),hastaLongitud:params.hastalong.toDouble(),hora:params.hora,minutos:params.minutos,
		domingo:params.domingo,lunes:params.lunes,martes:params.martes,miercoles:params.miercoles,jueves:params.jueves,
		viernes:params.viernes,sabado:params.sabado,colaboracion:params.colaboracion,asientosLibres:params.lugares,
		comentario:params.comentario,vehiculo:vehiculo)

		//println viaje.validate()
		//println viaje.hasErrors()
		//println viaje.errors

		viaje.save()
		redirect (controller:'misViajes', action:'index')
	}

}
