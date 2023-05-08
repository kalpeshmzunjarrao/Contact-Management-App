package com.phbook.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.phbook.entity.Contact;

@Repository
public class ContactMgmtRepo {
	@Autowired
HibernateTemplate temp;
	
	@Transactional(readOnly = false)
	public boolean saveContact(Contact contact) {
		int id =(Integer) temp.save(contact);
		return id>0;
	}
}
