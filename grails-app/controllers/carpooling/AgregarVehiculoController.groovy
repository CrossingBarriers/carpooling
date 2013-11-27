package carpooling
import  carpooling.Usuario

class AgregarVehiculoController {

	def agregarVehiculoService
	//def springSecurityService

	def agregarVehiculo() { // Agregue esto, este es el controlador

	}

	def renderAgregarVehiculoView =  { render(view:"/carpooling/agregarVehiculo") }


	def guardarVehiculo(){
		//def usuarioDni=springSecurityService.principal.dni
		Integer usuarioDni=33222000
		def usuario=agregarVehiculoService.find(usuarioDni)
		def vehiculo=new Vehiculo(patente:params.patente,marca:params.marca,modelo:params.modelo,cantidadAsientos:params.asientos,usuario:usuario)		
		//Esta registrando un vehiculo, por ende el usuario sera conductor(estado:true):
	    Usuario.executeUpdate("update Usuario user set user.conductor='true' where user.dni=?",[usuarioDni])
		vehiculo.save()
		
		redirect (controller:'misViajes', action: 'show', params:[patente:params.patente])
	}
}



