package com.example.AddressBook.Interface;


import com.example.AddressBook.dto.AuthUserDTO;
import com.example.AddressBook.dto.LoginDTO;
import com.example.AddressBook.model.AuthUser;
public interface IAuthenticationService {
    AuthUser register(AuthUserDTO userDTO) throws Exception;
    String login(LoginDTO loginDTO);
    String forgotPassword(String email, String newPassword);
    String resetPassword(String email, String currentPassword, String newPassword);

}