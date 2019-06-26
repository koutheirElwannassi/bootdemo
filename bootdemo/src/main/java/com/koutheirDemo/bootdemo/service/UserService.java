package com.koutheirDemo.bootdemo.service;

import java.util.List;

import com.koutheirDemo.bootdemo.dto.UserDto;



public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
