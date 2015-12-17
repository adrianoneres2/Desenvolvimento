import javax.faces.event.ActionEvent;


public class Login {

	private String nome;
	private String senha;
	private String logado;
	
	public String getLogado() {
		return logado;
	}
	public void setLogado(String logado) {
		this.logado = logado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void logar(ActionEvent event){
		
		this.setNome(this.getNome());
		this.setSenha(this.getSenha());
		
		if (this.getNome().equals("adriano") && this.getSenha().equals("123456")){
			this.setLogado("Usuário logado!");
		}else {
			this.setLogado("Usuário não logado!");
		}
	}
}
