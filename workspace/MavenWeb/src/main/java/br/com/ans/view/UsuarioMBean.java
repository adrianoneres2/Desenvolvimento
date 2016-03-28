package br.com.ans.view;
import java.util.ArrayList;
import java.util.List;

import br.com.ans.modelo.dao.UsuarioDao;
import br.com.ans.modelo.Usuario;


public class UsuarioMBean {
	
	
	private List<Usuario> usuarios;
	private Usuario usuario;
	
	
	public UsuarioMBean() {
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
	
	public void inserirNovo() throws Exception {
		
		System.out.println("Cheguei!!!"+ usuario.getNomeUsuario());
		System.out.println(usuario.getNomeUsuario());
		System.out.println(usuario.getDataNascimento());
		
		UsuarioDao uDao = new UsuarioDao();
		
		uDao.salvar(usuario);
	}
	
	public void logar(){
		
	}
	
}
