package com.sixcandoit.userservice.service;

import com.sixcandoit.userservice.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public interface UserService extends UserDetailsService {
    void registUser(UserDTO userDTO);

    UserDTO getUserDetailsByEmail(String email);
}
