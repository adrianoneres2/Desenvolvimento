package br.com.ans.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.ans.modelo.Usuario;

public class UsuarioDao extends GenericoDao<Usuario>{
		
	private EntityManager manager = getEntityManager();

	public boolean ValidarUsuarioLogin(String email, String senha){
		
		String hql = "from Usuario where email = :email and senha = :senha";
		boolean retorno = false;
		
		try{
			
			Query query =  manager.createQuery(hql);
			query.setParameter("email", email);
			query.setParameter("senha", senha.toString());
			
			if(!query.getResultList().isEmpty()){
				retorno = true;
			}else{
				retorno = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		      manager.close();
		}
		return retorno;
	}

}
