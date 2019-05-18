package br.com.projetoetec.projetoetec.business;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.common.business.BaseSB;
import br.com.projetoetec.projetoetec.model.Cadastro;

@Service
public class CadastroSB extends BaseSB{
	
	private br.com.projetoetec.projetoetec.dao.CadastroDAO CadastroDAO;
	
	@Override
	protected void postConstructImpl() {
		CadastroDAO  = getDAO(br.com.projetoetec.projetoetec.dao.CadastroDAO.class);

	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Cadastro cadastro) {
		CadastroDAO.save(cadastro);
	}

}
