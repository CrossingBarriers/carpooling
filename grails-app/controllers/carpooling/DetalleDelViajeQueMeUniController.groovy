package carpooling

class DetalleDelViajeQueMeUniController {

	def detalleDelViajeQueMeUni() {
	}
	
	def renderDetalleDelViajeQueMeUniView = {
		
		def detalleViaje = params.unido
		
				render(view:"/carpooling/detalleDelViajeQueMeUni", model:[detalleViaje:detalleViaje])
		
			}
}
