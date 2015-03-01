package br.com.caelum.agenda.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.caelum.agenda.modelo.Contato;

@Repository
@Transactional
public class ContatoDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public ContatoDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void adicionar(Contato contato) {
		sessionFactory.getCurrentSession().save(contato);
	}

	@SuppressWarnings("unchecked")
	public List<Contato> listar() {
		List<Contato> contatos = sessionFactory.getCurrentSession()
				.createQuery("from Contato").list();
		return contatos;
	}

	public void alterar(Contato contato) {
		sessionFactory.getCurrentSession().update(contato);
	}

	public void remover(Long id) {
		Contato contato = (Contato) sessionFactory.getCurrentSession().load(
				Contato.class, id);
		sessionFactory.getCurrentSession().delete(contato);
	}
	
	public Contato carregarPorId(Long id) {
		return (Contato) sessionFactory.getCurrentSession().load(Contato.class, id);
	}
	
	public Contato exibir(Long id) {
		return (Contato) sessionFactory.getCurrentSession().load(Contato.class, id);
	}
	
}