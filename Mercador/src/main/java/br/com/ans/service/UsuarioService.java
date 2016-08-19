package br.com.ans.service;

import java.io.Serializable;

import br.com.ans.modelo.Usuario;

public interface UsuarioService extends Serializable {
	
	public Usuario logar(String email, String senha);
	public Usuario obterUsuarioPorEmail(String email);
	public boolean consultarRgUsuario(Integer rg);
	
}
