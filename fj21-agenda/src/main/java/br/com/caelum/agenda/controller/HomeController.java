package br.com.caelum.agenda.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.caelum.agenda.dao.ContatoDAO;
import br.com.caelum.agenda.dao.FuncionarioDAO;
import br.com.caelum.agenda.dao.GrupoDAO;
import br.com.caelum.agenda.modelo.Contato;
import br.com.caelum.agenda.modelo.Funcionario;
import br.com.caelum.agenda.modelo.Grupo;

@Controller
public class HomeController {

	@Autowired
	private ContatoDAO contatoDAO;
	
	@Autowired
	private FuncionarioDAO funcionarioDAO;

	@Autowired
	private GrupoDAO grupoDAO;
	
	@RequestMapping("index")
	public String index() {
		return "index";
	}

	@RequestMapping("adiciona-contato")
	public String adicionaContato(Model model) {
		model.addAttribute(new Contato());
		return "adiciona-contato";
	}
	
	@RequestMapping("adiciona-funcionario")
	public String adicionaFuncionario(Model model) {
		model.addAttribute(new Funcionario());
		return "adiciona-funcionario";
	}
	
	@RequestMapping("adiciona-grupo")
	public String adicionaGrupo(Model model) {
		model.addAttribute(new Grupo());
		return "adiciona-grupo";
	}

	@RequestMapping("lista-contato")
	public String listaContato(Model model) {
		model.addAttribute("contatos", contatoDAO.listar());
		return "lista-contato";
	}
	
	@RequestMapping("lista-funcionario")
	public String listaFuncionario(Model model) {
		model.addAttribute("funcionarios", funcionarioDAO.listar());
		return "lista-funcionario";
	}
	
	@RequestMapping("lista-grupo")
	public String listaGrupo() {
		return "lista-grupo";
	}
	
	@RequestMapping(value = "adicionarContato", method = RequestMethod.POST)
	public String adicionarContato(@Valid Contato contato, BindingResult result) {
		if (result.hasErrors()) {
			return "adiciona-contato";			
		}
		contatoDAO.adicionar(contato);
		return "redirect:lista-contato";
	}
	
	@RequestMapping(value = "adicionarFuncionario", method = RequestMethod.POST)
	public String adicionarFuncionario(@Valid Funcionario funcionario, BindingResult result) {
		if (result.hasErrors()) {
			return "adiciona-funcionario";
		}
		funcionarioDAO.adicionar(funcionario);
		return "redirect:lista-funcionario";
	}
	
	@RequestMapping(value = "adicionarGrupo", method = RequestMethod.POST)
	public String adicionarFuncionario(@Valid Grupo grupo, BindingResult result) {
		if (result.hasErrors()) {
			return "adiciona-grupo";
		}
		grupoDAO.adicionar(grupo);
		return "redirect:lista-grupo";
	}
	
	@RequestMapping(value = "removerContato", method = RequestMethod.GET)
	public String removerContato(Long id) {
		contatoDAO.remover(id);
		return "redirect:lista-contato";
	}
	
	@RequestMapping(value = "removerFuncionario", method = RequestMethod.GET)
	public String removerFuncionario(Long id) {
		funcionarioDAO.remover(id);
		return "redirect:lista-funcionario";
	}
	
	@RequestMapping(value = "removerGrupo", method = RequestMethod.GET)
	public String removerGrupo(Long id) {
		grupoDAO.remover(id);
		return "redirect:lista-grupo";
	}
	
	@RequestMapping(value = "editarContato", method = RequestMethod.POST)
	public String editarContato(@Valid Contato contato, BindingResult result) {
		if (result.hasErrors()) {
			return "editar-contato";
		}
		contatoDAO.alterar(contato);
		return "redirect:lista-contato";
	}
	
	@RequestMapping(value = "editarFuncionario", method = RequestMethod.GET)
	public String editarFuncionario(@Valid Funcionario funcionario, BindingResult result) {
		funcionarioDAO.alterar(funcionario);
		if (result.hasErrors()) {
			return "editar-funcionario";
		}
		funcionarioDAO.alterar(funcionario);
		return "redirect:lista-funcionario";
	}
	
	@RequestMapping(value = "editarGrupo", method = RequestMethod.GET)
	public String editarGrupo(@Valid Grupo grupo, BindingResult result) {
		grupoDAO.alterar(grupo);
		if (result.hasErrors()) {
			return "editar-grupo";
		}
		grupoDAO.alterar(grupo);
		return "redirect:lista-grupo";
	}
	
	@RequestMapping(value = "exibirContato", method = RequestMethod.GET)
	public String exibirContato(Long id, Model model) {
		Contato contato = contatoDAO.carregarPorId(id);
		model.addAttribute("contato", contato);
		return "exibir-contato";
	}
}
