package carpooling
import carpooling.Usuario
import java.awt.image.BufferedImage
import javax.imageio.ImageIO

class RegistrateController {

	def registrate() {
	}

	def renderRegistrateView =  {render(view:"/carpooling/registrate")}

	def registrarUsuario(){

		def f =request.getFile('myFile')


		if (!f.empty) {
			BufferedImage src = ImageIO.read(new ByteArrayInputStream(f.getBytes()));
			def dniImg = File.separator + params.dni.toString()+ '.jpg'

			//Ruta generica donde se guardan las imagenes:
			File destination = new File("C:"+File.separator+"$dniImg")

			ImageIO.write(src, "jpg", destination);

			def  imgLugar = destination.getAbsolutePath()
			def  imaLug = imgLugar.toString();

			def usuario=new Usuario(nombre:params.nombre,apellido:params.apellido,dni:params.dni,email:params.email,
			telefono:params.telefono,imagen: "${imaLug}",ocupacion:params.ocupacion,contrasenia:params.contrasenia,conductor: false)
			usuario.save()

			def unUsuario = params.email
			session["usuarioLogueado"] = unUsuario

			render (view:'/carpooling/perfilUsuario', model: [usuario : usuario])

		}
		else {
			flash.message = 'Debe cargar una imagen para garantizar su identidad'
			redirect action:'renderRegistrateView'
		}
	}
}
