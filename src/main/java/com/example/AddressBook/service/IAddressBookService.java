package com.example.AddressBook.service;

import com.example.AddressBook.dto.AddressBookDTO;
import com.example.AddressBook.model.AddressBook;
import java.util.List;

public interface IAddressBookService {
    AddressBook addContact(AddressBookDTO addressBookDTO);
    List<AddressBook> getAllContacts();
    AddressBook getContactById(int id);
    AddressBook updateContact(int id, AddressBookDTO addressBookDTO);
    void deleteContact(int id);
}