package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.modal.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zsj on 2017/3/20.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value = "/getUsers" , method = RequestMethod.GET)
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(value = "/getUserByUsername" , method = RequestMethod.POST)
    public User getUserByUsername(@RequestBody JSONObject object){
        String username = object.getString("username");
        return userRepository.findByUsername(username);
    }

    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user){
        return  userRepository.save(user);
    }


    @PutMapping(value = "/updateUser")
    public User updateUser(@RequestBody User user){
        System.out.println(user.getUsername());
        return  userRepository.save(user);
    }


    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Integer id){
        userRepository.delete(id);
    }

}
