package carpooling

class AgregarVehiculoController {

    def agregarVehiculoService
	 def usuario=1
	//def springSecurityService
	//def usuario=springSecurityService.principal.id

    def renderAgregarVehiculoView =  {
		render(view:"/carpooling/agregarVehiculo")
	}
	
	def show() {
        def map=agregarVehiculoService.lista(usuario)//seria el id del usuario que inicio sesion
		render view:'/carpooling/misViajes',model:[map:map]
	}
	
	def guardarVehiculo(){
		def vehiculo=new Vehiculo(patente:params.patente,marca:params.marca,modelo:params.modelo,cantidadAsientos:Integer.parseInt(params.asientos),idUsuario:usuario).save()
		redirect action: 'agregarNuevo', params:[idUsuario:usuario]	
	}
	
	def agregarNuevo(Integer idUsuario){
		def map=agregarVehiculoService.guardar(idUsuario)
		render (view:"/carpooling/misViajes",model:[map:map])
	}
	
	def quitarVehiculo(Long id){
		def miVehiculo=Vehiculo.get(id)
        miVehiculo.delete()
	   redirect action:'show'
	}
}
