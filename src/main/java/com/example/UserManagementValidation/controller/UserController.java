package com.example.UserManagementValidation.controller;

import com.example.UserManagementValidation.model.User;
import com.example.UserManagementValidation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

       @PostMapping("/addUser")
        public ResponseEntity<String> addUser( @RequestBody User user) {
        if (user.getDateOfBirth() == null || user.getDateOfBirth().isEmpty()) {
            return ResponseEntity.badRequest().body("Date of birth is required");
        }
        if (user.getPhoneNumber() == null || user.getPhoneNumber().isEmpty()) {
            return ResponseEntity.badRequest().body("Phone number is required");
        }
                  userService.addUser(user);
        return ResponseEntity.ok("User added successfully");
    }


    @PutMapping("/updateUser/{id}")
    public ResponseEntity<List<User>> updateUser(@PathVariable("id") int id, @Valid @RequestBody User user,
                                                 BindingResult result) {
        List<User> updated = userService.updateUser(id,user);
        if (updated != null){
            return  ResponseEntity.ok(updated);

        }else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/getUser/{id}")
    public  User getUserById(@PathVariable int id){
           return userService.getUserById(id);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getUserAtService();
    }


        @DeleteMapping("/deleteUser")
       public  String deleteUser(@RequestParam int id){
        User user =userService.deleteUser(id);
        return "user deleted with Id "+ id +"with data"+ user.toString();
    }




}
