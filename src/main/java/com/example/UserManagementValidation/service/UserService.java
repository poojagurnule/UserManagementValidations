package com.example.UserManagementValidation.service;

import com.example.UserManagementValidation.model.User;
import com.example.UserManagementValidation.repo.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
@Autowired
    UserDao userDao ;
    public void addUser(User user) {
         userDao.save(user);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public List<User> getUserAtService() {
        return userDao.getUserRepo();
    }

    public List<User> updateUser(int id, User updatedUser) {
        User existingUser = userDao.findById(id);
        if (existingUser == null) {
            return null;
        }
        existingUser.setUserId(updatedUser.getUserId());
        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setDateOfBirth(updatedUser.getDateOfBirth());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPhoneNumber(updatedUser.getPhoneNumber());
        existingUser.setDate(updatedUser.getDate());
        existingUser.setTime(updatedUser.getTime());
        return userDao.save(existingUser);
    }

    public User deleteUser(int id) {
        return userDao.deleteUser(id);
    }


}
