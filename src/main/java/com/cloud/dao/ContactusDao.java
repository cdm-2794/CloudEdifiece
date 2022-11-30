package com.cloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.entity.ContactUs;


public interface ContactusDao extends JpaRepository<ContactUs, Long> {

}
