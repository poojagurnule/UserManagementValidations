package com.example.UserManagementValidation.model;



import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @NotNull
    private int userId;

    @NotNull(message = "Username cannot be null")
    private String username;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String dateOfBirth;
    @Email(regexp = "[A-Za-z]+[0-9]+@[a-z]+\\.com")
    private String email;
    @Length(max = 12, min = 10)
    private String phoneNumber;
    private String date ;
    private  String time ;
}

