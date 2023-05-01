package com.hibernate.simple.serviceImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.simple.Dto.Contact;
import com.hibernate.simple.service.ContactService;
import com.hibernate.simple.util.HibernateConf;

public class ContactServiceImpl implements ContactService {

	private SessionFactory factory = HibernateConf.getFactory();

	public void saveContact(Contact contact) {
		Transaction transaction = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(contact);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}

	}

	public Contact getContactById(int contactId) {

		Transaction transaction = null;
		Contact contact = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			contact = session.get(Contact.class, contactId);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}

		return contact;
	}

	public List<Contact> getAllContact() {
		Transaction transaction = null;
		List<Contact> contact = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			contact = session.createQuery("from Contact").list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}
		return contact;
	}

	public void updateContact(Contact contact) {
		Transaction transaction = null;
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(contact);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}
	}

	public void deleteContactById(int contactId) {
		Transaction transaction = null;
		
		try {
			Session session = factory.openSession();
			transaction = session.beginTransaction();
			Contact contact = session.get(Contact.class, contactId);
			session.delete(contact);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null)
				transaction.rollback();
		}

	}

}
