package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.model.Usuario;

@Path("cadastrar")
@Controller
public class CadastrarController {

	@Get("")
	public void cadastrar() {
		
	}
	
	@Post("salvausuario")
	public void salvaUsuario(Usuario usuario) {
		
	
		
	}
}
