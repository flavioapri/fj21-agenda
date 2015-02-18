package br.com.caelum.agenda.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.caelum.agenda.modelo.Grupo;

@Repository
public class GrupoDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public GrupoDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Grupo> listar() {
		List<Grupo> grupos = sessionFactory.getCurrentSession()
				.createQuery("from grupo").list();
		return grupos;
	}

	public void alterar(Grupo grupo) {
		sessionFactory.getCurrentSession().update(grupo);
	}

	public void remover(Grupo grupo) {
		sessionFactory.getCurrentSession().delete(grupo);
	}

}
