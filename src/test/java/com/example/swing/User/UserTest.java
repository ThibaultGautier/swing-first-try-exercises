package com.example.swing.User;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    User user;

    @Before
    public void setUp(){
        user = new User();
    }

    @Test
    public void userShouldHaveNameAndLastName(){
        user.setLastName("Gautier");
        user.setFirstName("Thibault");

        assertEquals("Gautier", user.getLastName());
        assertEquals("Thibault", user.getFirstName());
    }


}
