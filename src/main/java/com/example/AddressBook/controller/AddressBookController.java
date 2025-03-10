package com.example.AddressBook.controller;

import com.example.AddressBook.dto.AddressBookDTO;
import com.example.AddressBook.model.AddressBook;
import com.example.AddressBook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @PostMapping("/add")
    public AddressBook addContact(@RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.addContact(addressBookDTO);
    }

    @GetMapping("/all")
    public List<AddressBook> getAllContacts() {
        return addressBookService.getAllContacts();
    }

    @GetMapping("/{id}")
    public AddressBook getContactById(@PathVariable int id) {
        return addressBookService.getContactById(id);
    }

    @PutMapping("/update/{id}")
    public AddressBook updateContact(@PathVariable int id, @RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.updateContact(id, addressBookDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContact(@PathVariable int id) {
        addressBookService.deleteContact(id);
        return "Contact deleted successfully!";
    }
}