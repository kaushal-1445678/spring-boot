package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<String> users = new ArrayList<>(Arrays.asList("Kaushal", "Rahul", "Amit"));

    public List<String> getUsers() {
        return users;
    }

    public String addUser(String name) {
        users.add(name);
        return "User Added";
    }
}