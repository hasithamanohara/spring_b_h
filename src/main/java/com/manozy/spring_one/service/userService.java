package com.manozy.spring_one.service;

import com.manozy.spring_one.DTO.userDTO;
import com.manozy.spring_one.repo.userRepo;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class userService {
    @Autowired
    private userRepo UserRepo;
    @Autowired
    private ModelMapper modelMapper;
    public userDTO saveUser(userDTO UserDTO){
     UserRepo.save(modelMapper.map(UserDTO, User.class));
     return UserDTO;
    }
}
