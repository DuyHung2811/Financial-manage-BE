package com.example.airbnb.service;

import com.example.airbnb.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    User save(User user);

    User lockUser(Long id, User user);

    User unLockUser(Long id, User user);

    Iterable<User> adminFindUser(String username);

    Iterable<User> findAll();

    User findByUsername(String username);

    User getCurrentUser();

    Optional<User> findById(Long id);

    UserDetails loadUserById(Long id);

    boolean checkLogin(User user);

    boolean isRegister(User user);

    boolean isCorrectConfirmPassword(User user);

    boolean existsByUsername(String username);


}
