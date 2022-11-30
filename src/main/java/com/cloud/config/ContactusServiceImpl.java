package com.cloud.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.dao.ContactusDao;
import com.cloud.entity.ContactUs;



@Service
public class ContactusServiceImpl implements ContactusService {


	@Autowired
	private ContactusDao contactusDao; 
	

	public ContactusServiceImpl() {	
		
	}

    // get all contact list
	@Override
	public List<ContactUs> getAllContactus() {
		return contactusDao.findAll();
	}

    //get contact by id
	@Override
	public ContactUs getContactUsByID(long contactID) {
	return contactusDao.getOne(contactID);
	}

	//Add Contact
	@Override
	public ContactUs addcontact(ContactUs cont) {		
		contactusDao.save(cont);
		return cont;
	}
	
	// Update Contact
	

}
