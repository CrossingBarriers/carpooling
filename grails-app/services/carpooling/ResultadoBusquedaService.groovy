package carpooling

import grails.transaction.Transactional

@Transactional
class ResultadoBusquedaService {

	def busquedaViajes(busqueda) {

		def c = ViajeRegistrado.createCriteria()
		def viajes = c.list(){
			le("hora", busqueda.hh + 1)
			and{
				ge("hora", busqueda.hh - 1)
			}
			or{
				if(busqueda.domingo == "D"){
					eq("domingo", "D")
				}
				if(busqueda.lunes == "L"){
					eq("lunes", "L")
				}
				if(busqueda.martes == "M"){
					eq("martes", "M")
				}
				if(busqueda.miercoles == "X"){
					eq("miercoles", "X")
				}
				if(busqueda.jueves == "J"){
					eq("jueves", "J")
				}
				if(busqueda.viernes == "V"){
					eq("viernes", "V")
				}
				if(busqueda.sabado == "S"){
					eq("sabado", "S")
				}
			}
		}
		
	}
	
}
