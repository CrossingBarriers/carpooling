package carpooling

import org.apache.commons.lang.builder.HashCodeBuilder

class SecUsuarioSecRol implements Serializable {

	SecUsuario secUsuario
	SecRol secRol

	boolean equals(other) {
		if (!(other instanceof SecUsuarioSecRol)) {
			return false
		}

		other.secUsuario?.id == secUsuario?.id &&
			other.secRol?.id == secRol?.id
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		if (secUsuario) builder.append(secUsuario.id)
		if (secRol) builder.append(secRol.id)
		builder.toHashCode()
	}

	static SecUsuarioSecRol get(long secUsuarioId, long secRolId) {
		find 'from SecUsuarioSecRol where secUsuario.id=:secUsuarioId and secRol.id=:secRolId',
			[secUsuarioId: secUsuarioId, secRolId: secRolId]
	}

	static SecUsuarioSecRol create(SecUsuario secUsuario, SecRol secRol, boolean flush = false) {
		new SecUsuarioSecRol(secUsuario: secUsuario, secRol: secRol).save(flush: flush, insert: true)
	}

	static boolean remove(SecUsuario secUsuario, SecRol secRol, boolean flush = false) {
		SecUsuarioSecRol instance = SecUsuarioSecRol.findBySecUsuarioAndSecRol(secUsuario, secRol)
		if (!instance) {
			return false
		}

		instance.delete(flush: flush)
		true
	}

	static void removeAll(SecUsuario secUsuario) {
		executeUpdate 'DELETE FROM SecUsuarioSecRol WHERE secUsuario=:secUsuario', [secUsuario: secUsuario]
	}

	static void removeAll(SecRol secRol) {
		executeUpdate 'DELETE FROM SecUsuarioSecRol WHERE secRol=:secRol', [secRol: secRol]
	}

	static mapping = {
		id composite: ['secRol', 'secUsuario']
		version false
	}
}
