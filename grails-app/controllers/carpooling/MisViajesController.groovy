package carpooling

class MisViajesController {
	
	def agregarVehiculoService
	def usuario=1
	
  def misViajes() {
	
	}
	
	def renderMisViajesView =  {
		
		render(view:"/carpooling/misViajes")
		
	}
	
	def show() {
		def map=agregarVehiculoService.lista(usuario)//seria el id del usuario que inicio sesion
		render view:'/carpooling/misViajes',model:[map:map]
	}
	
	def quitarVehiculo(Long id){
		def miVehiculo=Vehiculo.get(id)
		miVehiculo.delete()
	   redirect action:'show'
	}
	   
	
}
