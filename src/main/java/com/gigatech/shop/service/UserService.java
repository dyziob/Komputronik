package com.gigatech.shop.service;

import com.gigatech.shop.dto.UserDto;
import com.gigatech.shop.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}