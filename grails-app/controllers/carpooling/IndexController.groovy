package carpooling

class IndexController {
	
	def index(){
		
	}

	def redirectMiembrosComunidadController = {

		redirect(controller:"miembrosComunidad", action:"renderMiembrosComunidadView")
	}
	
	def renderIndexView =  {
		def logueado = sec.loggedInUserInfo(field: 'username')
		
		
				if(logueado)
				{
					def usuario = Usuario.findByUsername(logueado)
					render(view:"/carpooling/index", model: [usuario : usuario])
		
				}
				else{
			

				render (view:"/carpooling/index")
			}
		
	}
	def mostrarImagen(String imagen){
		File b = new File(imagen)
		OutputStream out = response.getOutputStream();
		out.write(b.bytes);
		out.close();
	}
	
	
}
