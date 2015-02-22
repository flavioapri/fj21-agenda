package br.com.caelum.agenda.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Grupo {

	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	@Size(min = 2, max = 10)
	private String grupo;

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Long getId() {
		return id;
	}

}
