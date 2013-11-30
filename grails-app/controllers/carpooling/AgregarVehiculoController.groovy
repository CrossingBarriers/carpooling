package carpooling
import  carpooling.Usuario
import  carpooling.Vehiculo

class AgregarVehiculoController {

	def agregarVehiculoService
	//def springSecurityService

	def agregarVehiculo() {

	}

	def renderAgregarVehiculoView =  { render(view:"/carpooling/agregarVehiculo") }


	def guardarVehiculo(){
		//def usuarioDni=springSecurityService.principal.dni
		Integer usuarioDni=33222000
		def usuario=agregarVehiculoService.buscarUsuario(usuarioDni)
		def vehiculo=new Vehiculo(patente:params.patente,marca:params.marca,modelo:params.modelo,cantidadAsientos:params.asientos,usuario:usuario)
		//El usuario sera conductor:
		Usuario.executeUpdate("update Usuario user set user.conductor='true' where user.dni=?",[usuarioDni])
		vehiculo.save()
		redirect (controller:'misViajes', action: 'show', params:[patente:params.patente])
	}
}



