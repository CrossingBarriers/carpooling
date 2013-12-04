package carpooling

class Mensaje {
    Usuario emisor
	Usuario receptor
	String mensaje
	Integer idRespuesta
	Date dateCreated
	
	static mapping = {
				version false
				order "desc"
			}
	
    static constraints = {
		emisor (blank: false, nullable: false)
		receptor (blank: false, nullable: false)
		mensaje (blank: false, nullable: false)
    }
}
