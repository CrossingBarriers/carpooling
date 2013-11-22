package carpooling
import  carpooling.Vehiculo

class AgregarViajeController {

	//def springSecurityService

	def agregarViaje(){
	}

	def renderAgregarViajeView =  {render(view:"/carpooling/agregarViaje")}

	def agregarNuevo(String id){
		def miPatente=Vehiculo.get(id)
		render view:"/carpooling/agregarViaje", model:[miPatente:miPatente]
	}

	def guardarViaje(){

		//def usuarioDni = springSecurityService.principal.dni
		//println usuarioDni

		Integer usuarioDni=33222000
		def usuario=Usuario.findAllByDni(usuarioDni)
		def vehiculo=Vehiculo.findAllByUsuario(usuario)

		def viaje=new ViajeRegistrado(desde:params.desde,hasta:params.hasta,hora:params.hora,minutos:params.minutos,
		domingo:params.domingo,lunes:params.lunes,martes:params.martes,miercoles:params.miercoles,jueves:params.jueves,
		viernes:params.viernes,sabado:params.sabado,colaboracion:params.colaboracion,asientosLibres:params.lugares,
		comentario:params.comentario,vehiculo:vehiculo).save(flush:true)

		redirect (controller:'misViajes', action:'index')
	}

}
