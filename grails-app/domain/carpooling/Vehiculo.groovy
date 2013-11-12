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

	static belongsTo = [usuario:Usuario] // Veh�culo pertenece a Usuario. Creo que no es necesario en relaci�n 1-1.
	// static belongsTo = [viaje:ViajeRegistrado] // Veh�culo pertenece a la clase ViajeRegistrado.
	static hasMany = [viajes:ViajeRegistrado] // Un veh�culo puede acceder a su coleccion de ViajesRegistrados (Relaci�n: 1-N). Es necesario???

	static constraints = {

		marca (blank: false, nullable: false)
		modelo (blank: false, nullable: false)
		cantidadAsientos (blank: false, nullable: false, minSize: 1)
		usuario (blank: false, nullable: false, unique: true)

	}
}
