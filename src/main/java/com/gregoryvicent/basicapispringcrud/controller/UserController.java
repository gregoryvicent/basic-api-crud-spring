package com.gregoryvicent.basicapispringcrud.controller;

import com.gregoryvicent.basicapispringcrud.dao.UserConn;
import com.gregoryvicent.basicapispringcrud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @Autowired
    private UserConn userConn;

    @GetMapping(path = "/everyone")
    public Iterable<User> getAllUsers() {
        return userConn.findAll();
    }

    @PostMapping(path = "/add")
    public String createUser(@RequestBody User userData) {
        User user = new User();

        user.setFirstName(userData.getFirstName());
        user.setLastName(userData.getLastName());
        user.setEmail(userData.getEmail());
        user.setPassword(userData.getPassword());

        userConn.save(user);

        return "User Created";
    }
}
