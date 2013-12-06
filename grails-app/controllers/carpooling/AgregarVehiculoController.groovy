package carpooling
import  carpooling.Usuario
import  carpooling.Vehiculo
import java.awt.image.BufferedImage
import javax.imageio.ImageIO

class AgregarVehiculoController {

	def agregarVehiculoService
	//def springSecurityService

	def agregarVehiculo() {

	}

	def renderAgregarVehiculoView =  { render(view:"/carpooling/agregarVehiculo") }


	def guardarVehiculo(){

		def f =request.getFile('myFile')


		if (!f.empty) {
			BufferedImage src = ImageIO.read(new ByteArrayInputStream(f.getBytes()));
			def patenteImg = File.separator + params.patente.toString()+ '.jpg'

			//Ruta generica donde se guardan las imagenes:
			File destination = new File("C:"+File.separator+"$patenteImg")

			ImageIO.write(src, "jpg", destination);

			def  imgLugar = destination.getAbsolutePath()
			def  imaLug = imgLugar.toString()

			//def usuarioDni=springSecurityService.principal.dni
			Integer usuarioDni=33222000
			def usuario=agregarVehiculoService.buscarUsuario(usuarioDni)

			def vehiculo=new Vehiculo(patente:params.patente,marca:params.marca,modelo:params.modelo,imagen: "${imaLug}",cantidadAsientos:params.asientos,usuario:usuario)
			//El usuario sera conductor:
			Usuario.executeUpdate("update Usuario user set user.conductor='true' where user.dni=?",[usuarioDni])
			vehiculo.save()
			redirect (controller:'misViajes', action: 'show', params:[patente:params.patente])
		}
		else
		{
			flash.message = 'Debe cargar una imagen para garantizar su identidad'
			redirect action:'renderAgregarVehiculoView'
		}
	}

}

