package com.sixcandoit.userservice.vo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RequestUser {
    private String name;
    private String email;
    private String pwd;
}
