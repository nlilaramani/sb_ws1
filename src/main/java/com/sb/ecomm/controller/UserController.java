package com.sb.ecomm.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sb.ecomm.service.UserService;

import jakarta.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import com.sb.ecomm.contract.*;

@RestController
@RequestMapping("users")
public class UserController{

    @Autowired
    private UserService service;
    @RequestMapping(method=RequestMethod.GET)
    public List<UserContract> getAllUSers(){
        return service.getAllUsers();
    }
    
    @RequestMapping(method={RequestMethod.POST,RequestMethod.PUT})
    public void addUser(@RequestBody UserContract user){
        service.save(user);
    }

    @RequestMapping(value = "/{id}",   method={RequestMethod.DELETE})
    public void deleteUser(@PathVariable("id") Integer id){
        service.removeUser(id);
    }


}