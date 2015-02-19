package br.com.caelum.agenda.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.modelo.Contato;

@Controller
public class HomeController {


	@Autowired
	private ContatoDAO contatoDAO;
	
	@RequestMapping("teste")
	public String teste() {
		return "jquery";
	}

	@RequestMapping("index")
	public String index() {
		return "index";
	}

	@RequestMapping("adiciona")
	public String adiciona(Model model) {
		model.addAttribute(new Contato());
		return "adiciona-contato";
	}

	@RequestMapping("lista")
	public String lista() {
		return "lista-contato";
	}

	@RequestMapping(value = "adicionarContato", method = RequestMethod.POST)
	public String adicionarContato(@Valid Contato contato, BindingResult result) {
		if (result.hasErrors()) {
			return "adiciona-contato";			
		}
		contatoDAO.adicionar(contato);
		return "exito";
	}
}
