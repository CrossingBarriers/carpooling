package carpooling

class AgregarViajeController {

    def renderAgregarViajeView =  {
		
		render(view:"/carpooling/agregarViaje")
		
	}
	def guardarViaje(){
	//	def viaje=new ViajeRegistrado().save()
	//	redirect action: 'agregarNuevo', params:[idUsuario:usuario]
	}
}
