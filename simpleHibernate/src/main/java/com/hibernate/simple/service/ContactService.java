package com.hibernate.simple.service;

import java.util.List;

import com.hibernate.simple.Dto.Contact;

public interface ContactService {

	void saveContact(Contact contact);

	Contact getContactById(int contactId);

	List<Contact> getAllContact();

	void updateContact(Contact contact);

	void deleteContactById(int contactId);
	
	
}
