class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }
	
		//  "/"(view:"/index")

        "/"(view:"/carpooling/index") // Modificado para que comience con el proyecto carpooling.
        "500"(view:'/error')
		
		"/busqueda" (controller: "busquedaDeViajes", action: "renderBusquedaDeViajesView")
		
		"/tipoUsuario" (controller:"tipoUsuario", action:"renderTipoUsuarioView")
		"/agregarVehiculo" (controller:"agregarVehiculo", action:"renderAgregarVehiculoView")
		"/agregarViaje" (controller:"agregarViaje", action:"agregarNuevo")
		"/misViajes" (controller:"misViajes", action:"index")
		
		"/index" (controller:"index", action:"renderIndexView")
		"/comoFunciona" (controller:"comoFunciona", action:"renderComoFuncionaView")
		"/registrate" (controller:"registrate", action:"renderRegistrateView")
		"/miembrosComunidadCarpoolingBA" (controller:"miembrosComunidad", action:"renderMiembrosComunidadView")
		
		"/detalleViaje" (controller:"descripcionViaje", action:"renderDescripcionViajeView")
		"/resultadoBusqueda" (controller: "resultadoBusqueda", action: "renderResultadoBusquedaView")
		"/perfilUsuario" (controller:"perfilUsuario", action:"renderPerfilUsuarioView")
		
		"/login/$action?"(controller: "login") 
		"/logout/$action?"(controller: "logout")
	}
}
