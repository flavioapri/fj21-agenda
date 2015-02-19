package br.com.caelum.agenda.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	@Size(min = 2, max = 30)
	private String nome;
	@NotEmpty
	@Size(min = 3, max = 15)
	private String usuario;
	@NotEmpty
	@Size(min = 2)
	private String senha;
	@OneToMany(fetch = FetchType.EAGER)
	private List<Grupo> grupos;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

}
