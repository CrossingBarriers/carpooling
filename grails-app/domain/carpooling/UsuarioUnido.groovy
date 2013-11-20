package carpooling

class UsuarioUnido implements Serializable {

	ViajeRegistrado viaje
	String dia
	Usuario usuario

	static mapping = {

		viaje column: 'viaje_id'
		usuario column: 'usuario_dni'

		// id composite: ['viaje', 'usuario']
		version false
	}


	static constraints = {
		
		viaje (blank: false, nullable: false)
		dia (blank: false, nullable: false)
		usuario (blank: false, nullable: false, unique:['viaje', 'dia']) // Este unique es para que cada usuario sea único en cierto viaje de cierto día.
	}
}
