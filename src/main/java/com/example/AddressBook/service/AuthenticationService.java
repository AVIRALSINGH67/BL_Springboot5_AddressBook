package com.example.AddressBook.service;

import com.example.AddressBook.dto.AuthUserDTO;
import com.example.AddressBook.Interface.IAuthenticationService;
import com.example.AddressBook.repository.AuthenticationRepository;
import com.example.AddressBook.model.AuthUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthenticationService {

    @Autowired
    AuthenticationRepository authUserRepository;

    @Override
    public AuthUser register(AuthUserDTO userDTO) throws Exception {
        AuthUser user = new AuthUser(userDTO);

        authUserRepository.save(user);

        return user;
    }


}