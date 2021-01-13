package com.korniak.myapp.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private String name;
    private String lastName;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User() {
        logger.info("User added by empty constructor" );
    }

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        logger.info("User - name: " + name + ", last name: " + lastName + "added by full constructor" );
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
