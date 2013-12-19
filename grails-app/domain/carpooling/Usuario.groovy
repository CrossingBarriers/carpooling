package carpooling

class Usuario extends SecUsuario{

	Integer dni
	String nombre
	String apellido
	Integer telefono
	String imagen
	String ocupacion
	Boolean conductor
	

	static mapping = {
		version false

	}

	static hasMany = [pasajeros:UsuarioUnido] // Para hacer la relación N - N entre los usuarios y los viajes a los que se unen.

	static belongsTo = ViajeRegistrado // Para hacer la relación N - N con ViajeRegistrado

	static constraints = {
		nombre (blank: false, nullable: false)
		apellido (blank: false, nullable: false)
		telefono (blank: false, nullable: false)

	}
}
