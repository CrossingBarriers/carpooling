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

		def busqueda = new Busqueda(desde:params.desde, desdeLatitud:params.desdelat, desdeLongitud:params.desdelong, hasta:params.hasta, hh:params.hh, mm:params.mm).save()
		def lista = resultadoBusquedaService.busquedaViajes(busqueda)
		print lista
		
		def listresult = []
		
		for ( registro in lista) {

			def distancia = calcularDistancia(registro.desdeLatitud, registro.desdeLongitud, busqueda)
			
			if(distancia <= valor){
				listresult.add(registro)
								
			}

		}
		
		print listresult

		render(view:"/carpooling/resultadoBusqueda", model:[resultado:listresult])

	}
	
//	Double calcularDistancia(desdeLatitud, desdeLongitud, busqueda){
//		
//		Double R = 6378.137 // Radius of earth in KM
//		Double dLat = (desdeLatitud - busqueda.desdeLatitud) * Math.PI / 180;
//		Double dLon = (desdeLongitud - busqueda.desdeLongitud) * Math.PI / 180;
//		Double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
//		Math.cos(busqueda.desdeLatitud * Math.PI / 180) * Math.cos(desdeLatitud * Math.PI / 180) *
//		Math.sin(dLon/2) * Math.sin(dLon/2);
//		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
//		Double d = R * c * 1000;
//		return d ; // meters
//	}
	
	Double calcularDistancia(desdeLatitud, desdeLongitud, busqueda){
		
//		Double lat2 = -34.66821;
//		Double lon2 =  -58.56780;
//		Double lat1 =  -34.67078;
//		Double lon1 =  -58.56265;
//		
//		double earthRadius = 6371;//kilometers
//		double dLat = Math.toRadians(lat2 - lat1);
//		double dLng = Math.toRadians(lon2 - lon1);
//		double sindLat = Math.sin(dLat / 2);
//		double sindLng = Math.sin(dLng / 2);
//		double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
//		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
//		double dist = earthRadius * c*1000;
		
		Double buslat =  busqueda.desdeLatitud.toDouble();
		Double buslong =  busqueda.desdeLongitud.toDouble();
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
	
	
	/*Double calcularDistancia(desdeLatitud, desdeLongitud, busqueda){
		
		Double earthRadius = 6371; //kilometers
		Double dist = earthRadius * Math.acos(Math.sin(busqueda.desdeLatitud* Math.PI / 180)*Math.sin(desdeLatitud* Math.PI / 180)+Math.cos(busqueda.desdeLatitud* Math.PI / 180)*Math.cos(desdeLatitud* Math.PI / 180)*Math.cos(busqueda.desdeLongitud* Math.PI / 180-desdeLongitud* Math.PI / 180))
		return dist;
		
	}*/

}
