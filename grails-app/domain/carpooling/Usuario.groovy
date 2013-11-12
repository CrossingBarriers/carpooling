package carpooling

class Usuario {

	Integer dni
	String nombre
	String apellido
	String email
	Integer telefono
	//Imagen imagen
	String contrasenia
	Boolean conductor

	static mapping = {

		id generator: 'assigned', name:'dni', type: 'integer'
		version false

	}

	// static hasOne = [vehiculo:Vehiculo]

	static constraints = {
		nombre (blank: false, nullable: false)
		apellido (blank: false, nullable: false)
		email (blank: false, email:true, unique: true)
		telefono (blank: false, nullable: false)
		contrasenia (blank: false, nullable:false)

	}
}
