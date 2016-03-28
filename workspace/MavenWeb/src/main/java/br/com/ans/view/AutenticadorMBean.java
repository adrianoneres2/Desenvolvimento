package br.com.ans.view;


import br.com.ans.controller.UsuarioController;


public class AutenticadorMBean {
	
	private String email;
	private String senha;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return senha;
	}
	
	public boolean Logar(){
		
		System.out.println("cheguei aqui");
		
		UsuarioController usuarioController = new UsuarioController();
		
		return usuarioController.Logar(this.getEmail(), this.getSenha());
		
	}
	
}
