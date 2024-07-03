package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Categoria;

@Repository
public class CategoriaDAOimpl implements CategoriaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Categoria> findALL() {
		
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Categoria", Categoria.class).getResultList();
	}

	@Override
	public Categoria findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Categoria cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Categoria cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(Categoria cliente) {
		// TODO Auto-generated method stub

	}
}
