package carpooling

class Vehiculo {

	String patente
	String marca
	String modelo
	Integer cantidadAsientos
	Usuario usuario

	static mapping = {

		id generator: 'assigned', name:'patente', type: 'string'
		usuario column: 'usuario_dni'

	}

	static belongsTo = [usuario:Usuario] // Vehículo pertenece a Usuario. Creo que no es necesario en relación 1-1.
	// static belongsTo = [viaje:ViajeRegistrado] // Vehículo pertenece a la clase ViajeRegistrado.
	static hasMany = [viajes:ViajeRegistrado] // Un vehículo puede acceder a su coleccion de ViajesRegistrados (Relación: 1-N). Es necesario???

	static constraints = {

		marca (blank: false, nullable: false)
		modelo (blank: false, nullable: false)
		cantidadAsientos (blank: false, nullable: false, minSize: 1)
		usuario (blank: false, nullable: false, unique: true)

	}
}
