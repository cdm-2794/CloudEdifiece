package com.cloud.config;

import java.util.List;

import com.cloud.entity.ContactUs;


public interface ContactusService {

	public List<ContactUs> getAllContactus();
	
	public ContactUs getContactUsByID(long contactID); 
	
	public ContactUs addcontact(ContactUs cont);
}
