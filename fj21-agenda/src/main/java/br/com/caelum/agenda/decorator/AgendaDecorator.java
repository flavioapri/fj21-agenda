package br.com.caelum.agenda.decorator;

import org.displaytag.decorator.TableDecorator;

import br.com.caelum.agenda.modelo.Contato;

public class AgendaDecorator extends TableDecorator {

	public String getContatoIdRemover() {
		Contato contato = (Contato) getCurrentRowObject();
		String contatoIdRemover = "<a href=\"removerContato?id=" + contato.getId()
				+ "\"><img src=\"rsc/img/bin.png\"/>";
		return contatoIdRemover;
	}
	
	public String getContatoIdEditar() {
		Contato contato = (Contato) getCurrentRowObject();
		String contatoIdEditar = "<a href=\"editarContato?id=" + contato.getId()
				+ "\"><img src=\"rsc/img/edit.png\"/>";
		return contatoIdEditar;
	}
}
