package carpooling

class ViajeRegistrado {

	String desde
	Double desdeLatitud
	Double desdeLongitud
	String hasta
	Double hastaLatitud
	Double hastaLongitud
	Integer hora
	Integer minutos
	String domingo
	String lunes
	String martes
	String miercoles
	String jueves
	String viernes
	String sabado
	Vehiculo vehiculo
	Integer colaboracion
	String comentario

	static mapping = {

		vehiculo column: 'vehiculo_patente'
		version false
	}

	static belongsTo = [vehiculo:Vehiculo]

	static hasMany = [pasajeros: UsuarioUnido] // Para hacer la relaci�n N - N entre los usuarios y los viajes a los que se unen.

	static constraints = {

		desde (blank: false, nullable: false)
		desdeLatitud(blank:false, nullable:false)
		desdeLongitud(blank:false, nullable:false)
		hasta (blank: false, nullable: false)
		hastaLatitud(blank:false, nullable:false)
		hastaLongitud(blank:false, nullable:false)
		hora (blank: false, nullable: false)
		minutos (blank: false, nullable: false)
		domingo(nullable:true)
		lunes (nullable:true)
		martes(nullable:true)
		miercoles(nullable:true)
		jueves(nullable:true)
		viernes(nullable:true)
		sabado(nullable:true)
		vehiculo (blank: false, nullable: false)
		colaboracion (blank: false, nullable: false)

	}
}
