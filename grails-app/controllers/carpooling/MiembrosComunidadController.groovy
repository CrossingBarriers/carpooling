package carpooling
import carpooling.Usuario

class MiembrosComunidadController {
	
	def renderMiembrosComunidadView =  {
		
		def usuario = Usuario.list()
		render(view:"/carpooling/miembrosComunidad", model: [usuario:usuario])
	}
	
	def mostrarImagen(String imagen){
		File b = new File(imagen)
		OutputStream out = response.getOutputStream();
		out.write(b.bytes);
		out.close();
	}	
}



	