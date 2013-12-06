package carpooling
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import carpooling.Usuario

class PerfilUsuarioController {
	def perfilUsuario() {
	}

	//def renderPerfilUsuarioView =  {render(view:"/carpooling/perfilUsuario")}

	def renderPerfilUsuarioView =  {

		/*def usuario = Usuario.get(2)*/
		def logueado = sec.loggedInUserInfo(field: 'username')


		if(logueado)
		{
			def usuario = Usuario.findByUsername(logueado)
			render(view:"/carpooling/perfilUsuario", model: [usuario : usuario])

		}
		
		else{
			def redirectIndexController = {

				redirect(controller:"Index", action:"renderIndexView")
			}

		}

	}

	def mostrarImagen(){
			def a  = params.imagen
			File b = new File(a)
			OutputStream out = response.getOutputStream();
			out.write(b.bytes);
			out.close();

	}

	/*def cerrarSesion(){
	 session.removeAttribute("usuarioLogueado")
	 redirect(controller:"Index", action:"renderIndexView")
	 }*/

}
