package carpooling

class IndexController {
	
	def index(){
		
	}

	def redirectMiembrosComunidadController = {

		redirect(controller:"miembrosComunidad", action:"renderMiembrosComunidadView")
	}
	
	def renderIndexView =  {
		
		render(view:"/carpooling/index")
		
	}
	
	//def redirectTipoUsuarioController={
	//	redirect(controller:"tipoUsuario", action:"renderTipoUsuarioView")
	//}
	
	//def redirectComoFuncionaController={
	//	redirect(controller:"comoFunciona", action:"renderComoFuncionaView")
	//}
	
}
