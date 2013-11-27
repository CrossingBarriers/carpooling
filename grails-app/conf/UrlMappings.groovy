class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }
	
		//  "/"(view:"/index")

        "/"(view:"/carpooling/tipoUsuario") // Modificado para que comience con el proyecto carpooling.
        "500"(view:'/error')
		
		"/busqueda" (controller: "BusquedaDeViajes", action: "renderBusquedaDeViajesView")
		
		"/tipoUsuario" (controller:"tipoUsuario", action:"renderTipoUsuarioView")
		"/agregarVehiculo" (controller:"agregarVehiculo", action:"renderAgregarVehiculoView")
		"/agregarViaje" (controller:"agregarViaje", action:"agregarNuevo")
		"/misViajes" (controller:"misViajes", action:"index")
		
		"/index" (controller:"index", action:"renderIndexView")
		"/comoFunciona" (controller:"comoFunciona", action:"renderComoFuncionaView")
		"/registrate" (controller:"registrate", action:"renderRegistrateView")
		"/miembrosComunidadCarpoolingBA" (controller:"miembrosComunidad", action:"renderMiembrosComunidadView")
		

	}
}
