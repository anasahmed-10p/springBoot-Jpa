package com.example.simpleProject.services;

import com.example.simpleProject.entities.UserEntity;
import com.example.simpleProject.repositries.UserRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepositery userRepositery;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<UserEntity> userEntityOptional= userRepositery.findByUserName(s);

        return userEntityOptional.map(MyUserDetails::new).get();
    }
}
