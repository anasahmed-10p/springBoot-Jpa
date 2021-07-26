package com.example.simpleProject.repositries;

import com.example.simpleProject.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositery extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUserName(String userName);
}
