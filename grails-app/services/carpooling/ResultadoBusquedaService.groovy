package carpooling

import grails.transaction.Transactional

@Transactional
class ResultadoBusquedaService {

	def busquedaViajes(busqueda) {

		def query = "from ViajeRegistrado as v where v.hora <= :hora + 1 and v.hora >= :hora - 1 and ("
		
		//def query = "select v.desde from ViajeRegistrado as v where v.hora <= :hora + 1 and v.hora >= :hora - 1 and ("

		def flag = 0
		def dias = "hora:busqueda.hh,"

		if (busqueda.domingo == 'D'){
			query += "v.domingo = :domingo"
			dias += "domingo:busqueda.domingo"
			flag = 1
		}

		if (busqueda.lunes == 'L' && flag == 1){
			query += " or v.lunes = :lunes"
			dias += ", lunes:busqueda.lunes"
			flag = 1
		}else if (busqueda.lunes == 'L'){
			query += "v.lunes = :lunes"
			dias += "lunes:busqueda.lunes"
			flag = 1
		}
		
		if (busqueda.martes == 'M' && flag == 1){
			query += " or v.martes = :martes"
			dias += ", martes:busqueda.martes"
			flag = 1
		}else if (busqueda.martes == 'M'){
			query += "v.martes = :martes"
			dias += "martes:busqueda.martes"
			flag = 1
		}
		
		if (busqueda.miercoles == 'X' && flag == 1){
			query += " or v.miercoles = :miercoles"
			dias += ", miercoles:busqueda.miercoles"
			flag = 1
		}else if (busqueda.miercoles == 'X'){
			query += "v.miercoles = :miercoles"
			dias += "miercoles:busqueda.miercoles"
			flag = 1
		}
		
		if (busqueda.jueves == 'J' && flag == 1){
			query += " or v.jueves = :jueves"
			dias += ", jueves:busqueda.jueves"
			flag = 1
		}else if (busqueda.jueves == 'J'){
			query += "v.jueves = :jueves"
			dias += "jueves:busqueda.jueves"
			flag = 1
		}
		
		if (busqueda.viernes == 'V' && flag == 1){
			query += " or v.viernes = :viernes"
			dias += ", viernes:busqueda.viernes"
			flag = 1
		}else if (busqueda.viernes == 'V'){
			query += "v.viernes = :viernes"
			dias += "viernes:busqueda.viernes"
			flag = 1
		}
		
		if (busqueda.sabado == 'S' && flag == 1){
			query += " or v.sabado = :sabado"
			dias += ", sabado:busqueda.sabado"
			flag = 1
		}else if (busqueda.sabado == 's'){
			query += "v.sabado = :sabado"
			dias += "sabado:busqueda.sabado"
			flag = 1
		}
		
		query += ')'

		
		def viajes = ViajeRegistrado.findAll("from ViajeRegistrado as v where v.hora <= :hora + 1 and v.hora >= :hora - 1", [hora:busqueda.hh])
		
//		println "Query: " + query
//		println "Parametros: " + dias

		//def viajes = ViajeRegistrado.findAll(query, [dias])

//		println "Viajes: " + viajes
	}
}
