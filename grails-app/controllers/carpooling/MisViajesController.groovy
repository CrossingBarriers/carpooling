package carpooling
import carpooling.Vehiculo
import carpooling.ViajeRegistrado

class MisViajesController {

	def misViajesService

	def misViajes() {
	}

	def renderMisViajesView =  {render(view:"/carpooling/misViajes")}

	def index(){
		def logueado = sec.loggedInUserInfo(field: 'username')
		def usuario=misViajesService.buscarUsuarioLogueado(logueado)
		 
				if(logueado)
				{
					def map=misViajesService.buscarUsuario(usuario)
					def viajes=misViajesService.buscarViaje(map)
					
					render (view:'/carpooling/misViajes', model:[map:map,viajes:viajes])
		
				}
	
	}

	def show(String patente){
		def map=misViajesService.buscarVehiculo(patente)
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
		misViajesService.eliminarVehiculo(id)
		//El usuario cambia su estado:sera pasajero
		String logueado = sec.loggedInUserInfo(field: 'username')
		Usuario.executeUpdate("update Usuario user set user.conductor='false' where user.username=?",[logueado])
		redirect (controller:'misViajes', action:'index')
	}

	def quitarViaje(Long id){
		misViajesService.eliminarViaje(id)
		redirect (controller:'misViajes', action:'index')
	}

}
