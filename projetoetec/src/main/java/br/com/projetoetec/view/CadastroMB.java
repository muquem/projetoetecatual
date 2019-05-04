package br.com.projetoetec.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;

import br.com.etechoracio.common.view.BaseMB;
import br.com.projetoetec.business.CadastroSB;
import br.com.projetoetec.model.Cadastro;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Controller
@Scope("view")
public class CadastroMB extends BaseMB {
	
	@Autowired
	private CadastroSB cadastrosb;
	
	private Cadastro edit = new Cadastro();
	
	public void onSave() {
	
	}
			

}
