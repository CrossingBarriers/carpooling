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

	static belongsTo = [vehiculo:Vehiculo]

	static hasMany = [pasajeros: UsuarioUnido] // Para hacer la relación N - N entre los usuarios y los viajes a los que se unen.

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
