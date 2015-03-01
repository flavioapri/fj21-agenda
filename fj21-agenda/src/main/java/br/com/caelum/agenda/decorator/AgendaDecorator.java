package br.com.caelum.agenda.decorator;

import org.displaytag.decorator.TableDecorator;

import br.com.caelum.agenda.modelo.Contato;
import br.com.caelum.agenda.modelo.Funcionario;

public class AgendaDecorator extends TableDecorator {

	public String getContatoIdRemover() {
		Contato contato = (Contato) getCurrentRowObject();
		String contatoIdRemover = "<a href=\"removerContato?id=" + contato.getId()
				+ "\"><img src=\"rsc/img/bin.png\"/>";
		return contatoIdRemover;
	}
	
	public String getContatoIdEditar() {
		Contato contato = (Contato) getCurrentRowObject();
		String contatoIdEditar = "<a href=\"exibirContato?id=" + contato.getId()
				+ "\"><img src=\"rsc/img/edit.png\"/>";
		return contatoIdEditar;
	}
	
	public String getFuncionarioIdRemover() {
		Funcionario funcionario = (Funcionario) getCurrentRowObject();
		String funcionarioIdRemover = "<a href=\"removerFuncionario?id=" + funcionario.getId()
				+ "\"><img src=\"rsc/img/bin.png\"/>";
		return funcionarioIdRemover;
	}
	
	public String getfuncionarioIdEditar() {
		Funcionario funcionario = (Funcionario) getCurrentRowObject();
		String funcionarioIdEditar = "<a href=\"editarFuncionario?id=" + funcionario.getId()
				+ "\"><img src=\"rsc/img/edit.png\"/>";
		return funcionarioIdEditar;
	}
}
