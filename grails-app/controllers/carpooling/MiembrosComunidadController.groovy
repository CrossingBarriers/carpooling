package carpooling
import carpooling.Usuario

class MiembrosComunidadController {
	
	def miembrosComunidad(){
		
	}

    def renderMiembrosComunidadView =  {
		
		def usuario = Usuario.list()
		render(view:"/carpooling/miembrosComunidad", model: [usuario:usuario])
		
	}
			
}



	