package br.com.caelum.agenda.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.caelum.agenda.modelo.Funcionario;

@Repository
@Transactional
public class FuncionarioDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public FuncionarioDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Funcionario> listar() {
		List<Funcionario> funcionarios = sessionFactory.getCurrentSession().createQuery(
				"from Funcionario").list();
		return funcionarios;
	}

	public void alterar(Funcionario funcionario) {
		sessionFactory.getCurrentSession().update(funcionario);
	}

	public void remover(Long id) {
		Funcionario funcionario = (Funcionario) sessionFactory.getCurrentSession().load(
				Funcionario.class, id);
		sessionFactory.getCurrentSession().delete(funcionario);
	}
	
	public void adicionar(Funcionario funcionario) {
		sessionFactory.getCurrentSession().save(funcionario);
	}

}