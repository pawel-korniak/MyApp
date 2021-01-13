package com.korniak.myapp.controller;

import com.korniak.myapp.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ConnectionController {
    List<User> users = new ArrayList<>();

    public ConnectionController() {
        loadCars();
    }

    private void loadCars() {
        User user1 = new User("aaa","bbb");
        User user2 = new User("ccc","ddd");
        User user3 = new User("eee","fff");
        User user4 = new User("ggg","hhh");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    @GetMapping("index")
    String get(Model model){


        model.addAttribute("users", users);
        model.addAttribute("newUser",new User());
        return "index";
    }
    @PostMapping("add-user")
    String addUser(@ModelAttribute User user){
        users.add(user);
        return "redirect:index";
    }
}
