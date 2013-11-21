package carpooling

class Mensaje {
    Usuario emisor
	Usuario receptor
	String mensaje
	Date dateCreated
	
	static mapping = {
				version false
			}
	
    static constraints = {
		emisor (blank: false, nullable: false)
		receptor (blank: false, nullable: false)
		mensaje (blank: false, nullable: false)
    }
}
