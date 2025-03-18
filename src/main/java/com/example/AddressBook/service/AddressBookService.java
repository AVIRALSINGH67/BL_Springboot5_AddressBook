package com.example.AddressBook.service;

import com.example.AddressBook.dto.AddressBookDTO;
import com.example.AddressBook.exception.ContactNotFoundException;
import com.example.AddressBook.model.AddressBook;
import com.example.AddressBook.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository repository;

    @Override
    public AddressBook addContact(AddressBookDTO addressBookDTO) {
        AddressBook contact = new AddressBook(addressBookDTO);
        return repository.save(contact);
    }

    @Override
    public AddressBook updateContact(int id, AddressBookDTO addressBookDTO) {
        AddressBook contact = repository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException("Contact not found for ID: " + id));

        contact.setName(addressBookDTO.getName());
        contact.setAddress(addressBookDTO.getAddress());
        contact.setPhoneNumber(addressBookDTO.getPhoneNumber());
        contact.setEmail(addressBookDTO.getEmail());

        return repository.save(contact);
    }

    @Override
    public AddressBook getContactById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException("Contact not found for ID: " + id));
    }

    @Override
    public List<AddressBook> getAllContacts() {
        return repository.findAll();
    }

    @Override
    public void deleteContact(int id) {
        AddressBook contact = repository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException("Contact not found for ID: " + id));
        repository.delete(contact);
    }
}