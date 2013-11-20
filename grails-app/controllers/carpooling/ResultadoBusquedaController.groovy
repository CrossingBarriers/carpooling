package carpooling

class ResultadoBusquedaController {
	
	def resultadoBusquedaService

    def resultadoBusqueda() {
		
		
	}
	
	def renderResultadoBusquedaView = {
		
		/*def resultadosId = params.resultadosId.split(',')*.toLong()
		
		def lista = ViajeRegistrado.getAll(resultadosId)
		
		render(view:"/carpooling/resultadoBusqueda", model:[resultado:lista])*/
		
		def busqueda = new Busqueda(desde:params.desde, hasta:params.hasta, hh:params.hh, mm:params.mm).save()
		def lista = resultadoBusquedaService.busquedaViajes(busqueda)
		print lista
		render(view:"/carpooling/resultadoBusqueda", model:[resultado:lista])
		
	}
}
