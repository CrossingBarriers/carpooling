package carpooling

class MisViajesController {

  def misViajes() {
	
	}
	
	def renderMisViajesView =  {
		
		render(view:"/carpooling/misViajes")
		
	}
	
	def redirectAgregarVehiculoController = {
		
				redirect(controller:"agregarVehiculo", action:"show")
     }
}
