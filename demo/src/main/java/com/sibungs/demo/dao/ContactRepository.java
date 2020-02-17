package com.sibungs.demo.dao;

import com.sibungs.demo.dto.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository   extends JpaRepository<Contact, Long> {

}
