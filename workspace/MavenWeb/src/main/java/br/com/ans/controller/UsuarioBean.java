package br.com.ans.controller;
import java.util.ArrayList;
import java.util.List;


import br.com.ans.modelo.Usuario;


public class UsuarioBean {
	
	
	private List<Usuario> usuarios;
	private Usuario usuario;
	
	private String teste;
	
	
	
	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	public UsuarioBean() {
		this.setUsuarios(new ArrayList<Usuario>());
		this.setUsuario(new Usuario());
		
		}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void inserirNovo() {
		
		System.out.println("Cheguei!!!"+ usuario.getNomeUsuario()+" - "+this.getTeste());
		System.out.println(usuario.getNomeUsuario());
		
	}
	
}