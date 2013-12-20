package carpooling

class Busqueda {

	String desde
	Double desdeLatitud
	Double desdeLongitud
	String hasta
	Double hastaLatitud
	Double hastaLongitud
	Integer hh
	Integer mm
	String domingo
	String lunes
	String martes
	String miercoles
	String jueves
	String viernes
	String sabado

	static mapping = { version false }

	static constraints = {

		desde (blank: false, nullable: false)
		desdeLatitud(blank:false, nullable:false)
		desdeLongitud(blank:false, nullable:false)
		hasta (blank: false, nullable: false)
		hastaLatitud(blank:false, nullable:false)
		hastaLongitud(blank:false, nullable:false)
		hh (blank: false, nullable: false)
		mm (blank: false, nullable: false)
		domingo(nullable:true)
		lunes (nullable:true)
		martes(nullable:true)
		miercoles(nullable:true)
		jueves(nullable:true)
		viernes(nullable:true)
		sabado(nullable:true)
	}
}
