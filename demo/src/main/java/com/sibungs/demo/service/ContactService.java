package com.sibungs.demo.service;

import com.sibungs.demo.dao.ContactRepository;
import com.sibungs.demo.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    ContactRepository dao;

    public Contact save(Contact contact){
        return dao.saveAndFlush(contact);
    }
}