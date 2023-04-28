package com.example.UserManagementValidation.model;



import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.service.annotation.PostExchange;

import java.time.LocalTime;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @NotNull
    private int userId;

    @NotNull(message = "Username cannot be null")
    private String username;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String DateOfBirth;
    @Email(regexp = "[A-Za-z]+[0-9]+@[a-z]+\\.com")
    private String email;
    @Length(max = 12, min = 10)
    private String phoneNumber;
    private String date ;
    private  String time ;
}

