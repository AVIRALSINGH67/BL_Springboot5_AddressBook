package com.example.AddressBook.service;



import com.example.AddressBook.dto.AddressBookDTO;

import java.util.List;

public interface AddressBookService {
    List<AddressBookDTO> getAllContacts();
    AddressBookDTO addContact(AddressBookDTO dto);


    AddressBookDTO getContactById(Long id);

    AddressBookDTO updateContact(long id, AddressBookDTO dto);

    void deleteContact(Long id);
}