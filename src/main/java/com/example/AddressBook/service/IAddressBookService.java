package com.example.AddressBook.service;

import com.example.AddressBook.dto.AddressBookDTO;
import com.example.AddressBook.model.AddressBook;
import java.util.List;
public interface IAddressBookService {
    AddressBook addContact(AddressBookDTO addressBookDTO);
    AddressBook updateContact(int id, AddressBookDTO addressBookDTO);
    AddressBook getContactById(int id);
    List<AddressBook> getAllContacts();
    void deleteContact(int id);
}