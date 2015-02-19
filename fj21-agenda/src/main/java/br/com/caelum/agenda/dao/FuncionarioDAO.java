package br.com.caelum.agenda.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.caelum.agenda.modelo.Funcionario;
import br.com.caelum.agenda.modelo.Grupo;

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
				"from funcionarios").list();
		return funcionarios;
	}

	public void alterar(Funcionario funcionario) {
		sessionFactory.getCurrentSession().update(funcionario);
	}

	public void remover(Funcionario funcionario) {
		sessionFactory.getCurrentSession().delete(funcionario);
	}
	
	public void adicionar(Funcionario funcionario) {
		sessionFactory.getCurrentSession().save(funcionario);
	}

}
