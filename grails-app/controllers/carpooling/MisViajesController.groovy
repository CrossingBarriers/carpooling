package carpooling
import carpooling.Vehiculo
import carpooling.ViajeRegistrado

class MisViajesController {

	def MisViajesService

	def misViajes() {
	}

	def renderMisViajesView =  {render(view:"/carpooling/misViajes")} // Se debe sacar???

	def index(){
		def logueado = sec.loggedInUserInfo(field: 'username')
		
				if(logueado)
				{
					def usuario = MisViajesService.buscarUsuarioLogueado(logueado)
					def map = MisViajesService.buscarUsuario(usuario)
					def viajes = MisViajesService.buscarViaje(map)
					
					render (view:'/carpooling/misViajes', model:[usuario:usuario,map:map,viajes:viajes])
				}
	}

	def show(String patente){
		def map = MisViajesService.buscarVehiculo(patente)
		def logueado = sec.loggedInUserInfo(field: 'username')
		def usuario = MisViajesService.buscarUsuarioLogueado(logueado)

		render (view:"/carpooling/misViajes",model:[usuario:usuario,map:map])
	}


	def quitarVehiculo(String id){
		MisViajesService.eliminarVehiculo(id)
		//El usuario cambia su estado:sera pasajero
		String logueado = sec.loggedInUserInfo(field: 'username')
		Usuario.executeUpdate("update Usuario user set user.conductor='false' where user.username=?",[logueado])
		redirect (controller:'misViajes', action:'index')
	}

	def quitarViaje(Long id){
		MisViajesService.eliminarViaje(id)
		redirect (controller:'misViajes', action:'index')
	}

}
