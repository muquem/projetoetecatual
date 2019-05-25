package br.com.projetoetec.projetoetec.dao;

import br.com.etechoracio.common.dao.BaseDAO;
import br.com.projetoetec.projetoetec.model.Cadastro;

public interface CadastroDAO extends BaseDAO<Cadastro> {
	
	public Cadastro findByCodigoOrNome(
		int codigo,
		String nome); 
		
	

}
