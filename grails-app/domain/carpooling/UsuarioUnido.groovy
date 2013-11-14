package carpooling

class UsuarioUnido implements Serializable {

	ViajeRegistrado viaje
	Usuario usuario

	static mapping = {

		viaje column: 'viaje_id'
		usuario column: 'usuario_dni'

		id composite: ['viaje', 'usuario']
		version false
	}


	static constraints = {
	}
}
