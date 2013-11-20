package carpooling

class AgregarVehiculoController {

	def agregarVehiculoService
	def usuario=1
	//def springSecurityService
	//def usuario=springSecurityService.principal.id
	
	def agregarVehiculo() { // Agregue esto, este es el controlador
	
	}

	def renderAgregarVehiculoView =  { render(view:"/carpooling/agregarVehiculo") }


	def guardarVehiculo(){
		def vehiculo = new Vehiculo(patente:params.patente, marca:params.marca, modelo:params.modelo, cantidadAsientos:Integer.parseInt(params.asientos), idUsuario:usuario).save()
		redirect action: 'agregarNuevo', params:[idUsuario:usuario]
	}

	def agregarNuevo(Integer idUsuario){
		def map = agregarVehiculoService.guardar(idUsuario)
		render (view:"/carpooling/misViajes", model:[map:map])
	}


}
