package carpooling

import grails.transaction.Transactional

@Transactional
class ResultadoBusquedaService {
	
	def busquedaViajes(busqueda) {
		
				def viajes = ViajeRegistrado.findAll("from ViajeRegistrado as v where v.hora <= :hora + 1 and v.hora >= :hora - 1", [hora:busqueda.hh])
				
			}
}
