package carpooling

class Usuario {

	Integer dni
	String nombre
	String apellido
	String email
	Integer telefono
	String imagen
	String contrasenia
	Boolean conductor
	

	static mapping = {

		id generator: 'assigned', name:'dni', type: 'integer'
		version false

	}

	static hasMany = [pasajeros:UsuarioUnido] // Para hacer la relación N - N entre los usuarios y los viajes a los que se unen.

	static belongsTo = ViajeRegistrado // Para hacer la relación N - N con ViajeRegistrado

	static constraints = {
		nombre (blank: false, nullable: false)
		apellido (blank: false, nullable: false)
		email (blank: false, email:true, unique: true)
		telefono (blank: false, nullable: false)
		contrasenia (blank: false, nullable:false)

	}
}
