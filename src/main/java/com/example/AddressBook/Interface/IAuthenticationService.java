package com.example.AddressBook.Interface;


import com.example.AddressBook.dto.AuthUserDTO;
import com.example.AddressBook.model.AuthUser;
public interface IAuthenticationService {
    AuthUser register(AuthUserDTO userDTO) throws Exception;

}