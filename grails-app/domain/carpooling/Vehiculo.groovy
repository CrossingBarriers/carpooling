package carpooling

class Vehiculo {

	String patente
	String marca
	String modelo
	String imagen
	Integer cantidadAsientos
	Usuario usuario

	static mapping = {

		id generator: 'assigned', name:'patente', type: 'string'
		usuario column: 'usuario_id'
		version false
	}

	static belongsTo = [usuario:Usuario] // Veh�culo pertenece a Usuario.

	static hasMany = [viajes:ViajeRegistrado] // Un veh�culo puede acceder a su coleccion de ViajesRegistrados (Relaci�n: 1-N).

	static constraints = {

		marca (blank: false, nullable: false)
		modelo (blank: false, nullable: false)
		cantidadAsientos (blank: false, nullable: false, minSize: 1)
		usuario (blank: false, nullable: false, unique: true)

	}
}
