package carpooling
import carpooling.Vehiculo
import carpooling.ViajeRegistrado

class MisViajesController {

	def misViajesService

	def misViajes() {
	}

	def renderMisViajesView =  {render(view:"/carpooling/misViajes")}

	def index(){
		def map=Vehiculo.list()
		def viajes=ViajeRegistrado.list()
		render (view:'/carpooling/misViajes', model:[map:map,viajes:viajes])
	}

	def show(String patente){
		def map=misViajesService.find(patente)
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
		def miVehiculo=Vehiculo.get(id)//El método get recibe como parámetro el id del registro
		miVehiculo.delete()
		redirect (controller:'misViajes', action:'index')
	}

	def quitarViaje(Long id){
		def miViaje=ViajeRegistrado.get(id)
		miViaje.delete()
		redirect (controller:'misViajes', action:'index')
	}


}
