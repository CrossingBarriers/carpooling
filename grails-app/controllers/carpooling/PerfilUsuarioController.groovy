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
		def logueado = session.getAttribute("usuarioLogueado")


		if(logueado != null)
		{
			def usuario = Usuario.findByEmail(logueado)
			render(view:"/carpooling/perfilUsuario", model: [usuario : usuario])

		}
		else{
			def redirectIndexController = {

				redirect(controller:"Index", action:"renderIndexView")
			}

		}

	}

	def mostrarImagen(){

		def logueado = session.getAttribute("usuarioLogueado")
		def usuario = Usuario.findByEmail(logueado)
		/*def rutaArchivo = getGrailsApplication.mainContext.servletContext.getRealPath(usuario.imagen)*/
		/*def rutaArchivo = grailsAttributes.getApplicationContext().getResource(usuario.imagen).getFile()*/
		/*def rutaArchivo = getGrailsApplication().parentContext.getResource(usuario.imagen).getFile()*/

		def a  = usuario.imagen
		println a
		File b = new File(a)
		OutputStream out = response.getOutputStream();
		out.write(b.bytes);
		out.close();


		/*response.outputStream<< new ByteArrayInputStream(usuario.imagen)*/

	}

	/*def cerrarSesion(){
	 session.removeAttribute("usuarioLogueado")
	 redirect(controller:"Index", action:"renderIndexView")
	 }*/

}
