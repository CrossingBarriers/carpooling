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
		
		"/busqueda" (controller: "BusquedaDeViajes", action: "renderBusquedaDeViajesView")
	}
}
