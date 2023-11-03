package com.manozy.spring_one.controller;

import com.manozy.spring_one.DTO.userDTO;
import com.manozy.spring_one.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/V1/user")
@CrossOrigin
public class userController {
    @Autowired
    private userService UserService;
    @GetMapping("/getUser")
        public String getUser(){
        return ("hasitha");
        }

    @PostMapping("/saveUser")
        public userDTO saveUser(@RequestBody userDTO UserDTO){
        return UserService.saveUser(UserDTO);
        }

    @PutMapping("/updateUser")
        public String updateUser (){
        return ("user Updated");
    }

    @DeleteMapping("/deletUSer")
    public String deletUser(){
        return ("user Deleted");
    }
}
