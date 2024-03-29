package com.sixcandoit.userservice.dto;

import lombok.*;

@Data
public class UserDTO {
    private String name;
    private String email;
    private String pwd;
    private String userId;
    private java.util.Date enrollDate;
}
