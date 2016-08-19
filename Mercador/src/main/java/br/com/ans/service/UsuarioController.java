package br.com.ans.service;

import br.com.ans.dao.UsuarioDao;
import br.com.ans.modelo.Usuario;

public class UsuarioController {

	public Usuario Logar(String email, String senha){
		UsuarioDao usuarioDao = new UsuarioDao();
		return usuarioDao.validarUsuarioLogin(email, senha);
	}
	
}
