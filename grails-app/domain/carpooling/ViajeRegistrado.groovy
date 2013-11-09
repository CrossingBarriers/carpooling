package carpooling

class ViajeRegistrado {

	String desde
	String hasta
	Date horaSalida // Debería ser solo hora:minutos
	Boolean domingo
	Boolean lunes
	Boolean martes
	Boolean miercoles
	Boolean jueves
	Boolean viernes
	Boolean sabado
	//Vehiculo vehiculo
	Integer colaboracion
	Integer asientosLibres // Tendria que ser calculado en base a la gente que se agrega al viaje, cuando recien se carga deberia tomar la cantidad que fue cargada en el vehiculo.
	String comentario

	static belongsTo = Vehiculo // ViajeRegistrado pertenece a Vehículo

	static constraints = {

		desde (blank: false, nullable: false)
		hasta (blank: false, nullable: false)
		horaSalida  (blank: false, nullable: false)
		//vehiculo (blank: false, nullable: false)
		colaboracion (blank: false, nullable: false)
		asientosLibres  (blank: false, nullable: false, minSize:1)

	}
}
