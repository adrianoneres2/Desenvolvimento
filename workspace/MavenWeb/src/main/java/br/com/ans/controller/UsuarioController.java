package br.com.ans.controller;

import br.com.ans.modelo.dao.UsuarioDao;

public class UsuarioController {

	public boolean Logar(String email, String senha){
		
		UsuarioDao usuarioDao = new UsuarioDao();
		return usuarioDao.ValidarUsuarioLogin(email, senha);

	}
	
}
