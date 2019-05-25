package br.com.projetoetec.projetoetec.business;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.common.business.BaseSB;
import br.com.projetoetec.projetoetec.dao.CadastroDAO;
import br.com.projetoetec.projetoetec.model.Cadastro;

@Service
public class CadastroSB extends BaseSB {

	private CadastroDAO cadastroDAO;

	@Override
	protected void postConstructImpl() {
		cadastroDAO = getDAO(CadastroDAO.class);

	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Cadastro cadastro) throws Exception{
		Cadastro existente = cadastroDAO.findByCodigoOrNome(cadastro.getCodigo(), cadastro.getNome());

		if (existente != null) {
			throw new Exception("Já existe Codigo/Nome da etec cadastrada!");
		}
		else
		{
		cadastroDAO.save(cadastro);
		}
	}

}
