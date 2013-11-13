package carpooling

class ViajeRegistrado {

	String desde
	String hasta
	Integer hora
	Integer minutos
	Boolean domingo
	Boolean lunes
	Boolean martes
	Boolean miercoles
	Boolean jueves
	Boolean viernes
	Boolean sabado
	Vehiculo vehiculo
	Integer colaboracion
	Integer asientosLibres // calculado
	String comentario

	static mapping = { 
		
		vehiculo column: 'vehiculo_patente'
		version false
		
		}

	static belongsTo = [vehiculo:Vehiculo] // Relación bidireccional entre Vehiculo y ViajeRegistrado. Es necesario???

	static constraints = {

		desde (blank: false, nullable: false)
		hasta (blank: false, nullable: false)
		hora (blank: false, nullable: false)
		minutos (blank: false, nullable: false)
		vehiculo (blank: false, nullable: false)
		colaboracion (blank: false, nullable: false)
		asientosLibres (blank: false, nullable: false, minSize:1)

	}
}
