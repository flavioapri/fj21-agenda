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
import br.com.caelum.agenda.modelo.Funcionario;

@Controller
public class HomeController {

	@Autowired
	private ContatoDAO contatoDAO;
	
	@RequestMapping("index")
	public String index() {
		return "index";
	}

	@RequestMapping("adiciona")
	public String adiciona(Model model) {
		model.addAttribute(new Contato());
		return "adiciona-contato";
	}
	
	@RequestMapping("funcionario")
	public String adicionaFuncionario(Model model) {
		model.addAttribute(new Funcionario());
		return "adiciona-funcionario";
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
	
	@RequestMapping(value = "adicionarFuncionario", method = RequestMethod.POST)
	public String adicionarFuncionario(@Valid Funcionario funcionario, BindingResult result) {
		if (result.hasErrors()) {
			return "adiciona-funcionario";
		}
		return "exito";
	}
}
