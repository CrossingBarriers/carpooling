package carpooling

class ResultadoBusquedaController {

	def resultadoBusquedaService

	def resultadoBusqueda() {
	}

	def renderResultadoBusquedaView = {

		/*def resultadosId = params.resultadosId.split(',')*.toLong()
		 def lista = ViajeRegistrado.getAll(resultadosId)
		 render(view:"/carpooling/resultadoBusqueda", model:[resultado:lista])*/
		
		Double valor = 1000

		def busqueda = new Busqueda(desde:params.desde, desdeLatitud:params.desdelat.toDouble(), desdeLongitud:params.desdelong.toDouble(), hasta:params.hasta, hastaLatitud:params.hastalat.toDouble(), hastaLongitud:params.hastalong.toDouble(), hh:params.hh, mm:params.mm).save()
		def lista = resultadoBusquedaService.busquedaViajes(busqueda)
		
		def listresult = []
		
		for ( registro in lista) {

			def distanciaDesde = calcularDistanciaDesde(registro.desdeLatitud, registro.desdeLongitud, busqueda)
			def distanciaHasta = calcularDistanciaHasta(registro.hastaLatitud, registro.hastaLongitud, busqueda)
			
			if(distanciaDesde <= valor && distanciaHasta <= valor){
				listresult.add(registro)
			}

		}
		
		render(view:"/carpooling/resultadoBusqueda", model:[resultado:listresult])

	}
	

	
	Double calcularDistanciaDesde(desdeLatitud, desdeLongitud, busqueda){
		
		Double buslat =  busqueda.desdeLatitud;
		Double buslong =  busqueda.desdeLongitud;
		Double earthRadius = 6371; //kilometers
		Double dLat = Math.toRadians(desdeLatitud - buslat);
		Double dLng = Math.toRadians(desdeLongitud - buslong);
		Double sindLat = Math.sin(dLat / 2);
		Double sindLng = Math.sin(dLng / 2);
		Double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(buslat)) * Math.cos(Math.toRadians(desdeLatitud));
		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		Double dist = earthRadius * c*1000;
		return dist;
		
	}
	
	
	Double calcularDistanciaHasta(hastaLatitud, hastaLongitud, busqueda){
		
		Double buslat =  busqueda.hastaLatitud;
		Double buslong =  busqueda.hastaLongitud;
		Double earthRadius = 6371; //kilometers
		Double dLat = Math.toRadians(hastaLatitud - buslat);
		Double dLng = Math.toRadians(hastaLongitud - buslong);
		Double sindLat = Math.sin(dLat / 2);
		Double sindLng = Math.sin(dLng / 2);
		Double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(buslat)) * Math.cos(Math.toRadians(hastaLatitud));
		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		Double dist = earthRadius * c*1000;
		return dist;
		
	}

}
