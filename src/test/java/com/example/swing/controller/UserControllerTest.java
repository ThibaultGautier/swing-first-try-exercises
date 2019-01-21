package com.example.swing.controller;

import com.example.swing.User.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    UserController userController;

    MockMvc mockMvc;

    @Before
    public void setUp(){
        userController = new UserController();
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void shouldPerformGetOnUserRouteWithOk() throws Exception{
        mockMvc.perform(get("/user"))
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnUsers() throws Exception{
        mockMvc.perform(get("/user"))
                .andExpect(view().name("users"));
    }

}
