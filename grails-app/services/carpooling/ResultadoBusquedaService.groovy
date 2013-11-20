package carpooling

import grails.transaction.Transactional

@Transactional
class ResultadoBusquedaService {

   	def busquedaViajes(busqueda) {

		def viajes = ViajeRegistrado.findAll("from ViajeRegistrado as v where v.desde = :desde and v.hasta = :hasta and v.hora < :hora + 1 and v.hora > :hora - 1", [desde:busqueda.desde, hasta:busqueda.hasta, hora:busqueda.hh])
		
		
	}
}
