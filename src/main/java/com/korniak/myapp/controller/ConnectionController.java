package com.korniak.myapp.controller;

import com.korniak.myapp.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(this.getClass());

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
        logger.info("Users load by loadCars" );
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
        logger.info("User - name: " + user.getName() + ", last name: " + user.getLastName() + "added by addUser" );
        return "redirect:index";
    }
}
