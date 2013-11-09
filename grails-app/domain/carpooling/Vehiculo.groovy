package carpooling

class Vehiculo { 
	String patente
	String marca
	String modelo
	Integer cantidadAsientos
	//Usuario usuario
	Integer idUsuario
	
	static belongsTo = Usuario // Vehículo pertenece a Usuario
	static hasMany = [viajes: ViajeRegistrado] // Un vehículo puede estar en muchos viajes registrados.

	static constraints = {
		patente (blank: false, nullable: false, unique: true)
		marca   (blank: false, nullable: false)
		modelo  (blank: false, nullable: false)
		cantidadAsientos  (blank: false, nullable: false)
		//usuario  (blank: false, nullable: false)
	}
}
