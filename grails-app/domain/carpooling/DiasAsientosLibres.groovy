package carpooling

class DiasAsientosLibres {

	Integer domingo
	Integer lunes
	Integer martes
	Integer miercoles
	Integer jueves
	Integer viernes
	Integer sabado

	static mapping = { version false }

	static constraints = {

		domingo(nullable:true)
		lunes (nullable:true)
		martes(nullable:true)
		miercoles(nullable:true)
		jueves(nullable:true)
		viernes(nullable:true)
		sabado(nullable:true)
	}
}
