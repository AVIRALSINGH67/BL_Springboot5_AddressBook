package com.example.AddressBook.model;

import com.example.AddressBook.dto.AddressBookDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address book_db")
@Data
@NoArgsConstructor
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    // Constructor to convert DTO to Model
    public AddressBook(AddressBookDTO dto) {
        this.name = dto.getName();
        this.address = dto.getAddress();
        this.phoneNumber = dto.getPhoneNumber();
        this.email = dto.getEmail();
    }
}