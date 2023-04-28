package com.example.UserManagementValidation.repo;

import com.example.UserManagementValidation.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDao {
    List<User> list = new ArrayList<>();
    public User getUserById(int id) {
        for (User per : list) {
            if (per.getUserId() == id) {
                return per;
            }
        }
        return null;
    }
    public  List<User> getUserRepo() {
         return list ;
    }
    public  User deleteUser(int id) {
        User user = getUserById(id);
        boolean remove = list.remove(user);
        return remove ? user : null;

    }
    public List<User> save(User user) {
         list.add(user);
         return list;
    }

    public User findById(int id) {
        for (User user : list) {
            if (user.getUserId() == id) {
                return user;
            }
        }
        return null;
    }

}
