package com.example.loginregistrationbackend.registration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class registrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
