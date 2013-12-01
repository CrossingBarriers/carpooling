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

			/*def base = File.separator+'tmp'+File.separator+'licencias'*/
			/*def urlRelativa =  base + dniImg*/
			/*def absoluta = getGrailsApplication().parentContext.getResource(base).file.toString() + dniImg*/
			/*f.transferTo(new File('${absoluta}'))*/
			/*f.transferTo(new File('C:/Users/addministrador/Desktop/img/myFile.jpeg'))*/
			/*File destination = new File('${absoluta}')*/

			//Ruta generica donde se guardan las imagenes:
			File destination = new File("C:"+File.separator+"$dniImg")

			ImageIO.write(src, "jpg", destination);

			def  imgLugar = destination.getAbsolutePath()
			def  imaLug = imgLugar.toString();


			def usuario=new Usuario(nombre:params.nombre,apellido:params.apellido,dni:params.dni,email:params.email,
			telefono:params.telefono,imagen: "${imaLug}",contrasenia:params.contrasenia,conductor: false)
			usuario.save()

			def unUsuario = params.email
			session["usuarioLogueado"] = unUsuario

			render (view:'/carpooling/perfilUsuario', model: [usuario : usuario])

		}
		else
		{
			flash.message = 'Debe cargar una imagen para garantizar su identidad'
			redirect action:'renderRegistrateView'
		}
	}
}
