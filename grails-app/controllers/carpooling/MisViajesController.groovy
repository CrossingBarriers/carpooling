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
		def usuario = MisViajesService.buscarUsuarioLogueado(logueado)
		 
				if(logueado)
				{
					def map = MisViajesService.buscarUsuario(usuario)
					def viajes = MisViajesService.buscarViaje(map)
					
					render (view:'/carpooling/misViajes', model:[map:map,viajes:viajes])
		
				}
	
	}

	def show(String patente){
		def map = MisViajesService.buscarVehiculo(patente)
		//println map
		if(map!=[])
		{
			render (view:"/carpooling/misViajes",model:[map:map])
		}
		else
		{
			flash.message="No se puede registrar mas de un vehiculo"
			redirect (controller: 'misViajes',action:'index')
		}
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
