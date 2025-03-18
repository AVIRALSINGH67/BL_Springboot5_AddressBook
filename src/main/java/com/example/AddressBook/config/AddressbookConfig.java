//package com.example.AddressBook.config;
//
//import com.example.AddressBook.dto.AddressBookDTO;
//import com.example.AddressBook.exception.UserException;
//import com.example.AddressBook.model.AddressBook;
//import com.example.AddressBook.repository.AddressBookRepository;
//import com.example.AddressBook.service.AddressBookService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Optional;
//
//@Configuration
//public class AddressBookConfig {
//
//    private static final Logger log = LoggerFactory.getLogger(AddressBookConfig.class);
//
//    @Bean
//    public AddressBookService addressBookService(AddressBookRepository repository) {
//        return new AddressBookService() {
//
//            @Override
//            public AddressBookDTO addContact(AddressBookDTO dto) {
//                log.info("Adding new contact: {}", dto);
//                AddressBook contact = new AddressBook();
//                contact.setName(dto.getName());
//                contact.setPhone(dto.getPhone());
//
//                AddressBook savedContact = repository.save(contact);
//                log.info("Contact added successfully with ID: {}", savedContact.getId());
//
//                return new AddressBookDTO(savedContact.getId(), savedContact.getName(), savedContact.getPhone());
//            }
//
//
//            @Override
//            public AddressBookDTO updateContact(Long id, AddressBookDTO dto) {
//                try {
//                    log.info("Updating contact with ID: {}", id);
//                    Optional<AddressBook> existingContact = repository.findById(Math.toIntExact(id));
//
//                    if (existingContact.isEmpty()) {
//                        log.warn("Attempted to update non-existing contact with ID: {}", id);
//                        throw new UserException("Contact not found with ID: " + id);
//                    }
//
//                    AddressBook contact = existingContact.get();
//                    contact.setName(dto.getName());
//                    contact.setPhone(dto.getPhone());
//                    AddressBook updatedContact = repository.save(contact);
//
//                    log.info("Contact updated successfully: {}", updatedContact);
//                    return new AddressBookDTO(updatedContact.getId(), updatedContact.getName(), updatedContact.getPhone());
//
//                } catch (Exception e) {
//                    log.error("Error updating contact: {}", e.getMessage());
//                    throw new UserException("Failed to update contact. Please try again.");
//                }
//            }
//        };
//    }
//}