package com.springmvc.springmvchackathon1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.springmvchackathon1.model.Register;

@Service
@Transactional
public class DBAppDao {
	@Autowired
	private SessionFactory sessionFactory;

	public DBAppDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	;

	public boolean registerUser(Register user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return true;
	}

	public boolean loginUser(String username, String password) {
		List<Register> users = getAllUsers();
		for (Register register : users) {
			if (register.getUsername().equals(username) && register.getPassword().equals(password)) {
				return true;

			}
		}
		return false;
	}

	public List<Register> getAllUsers() {
		Session session = sessionFactory.openSession();
		List<Register> users = session.createQuery("from Register", Register.class).getResultList();
		return users;

	}

}
