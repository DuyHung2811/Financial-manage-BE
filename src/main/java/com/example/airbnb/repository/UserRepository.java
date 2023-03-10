package com.example.airbnb.repository;


import com.example.airbnb.model.Transaction;
import com.example.airbnb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    @Query(value = "select * from user_table where username like %?1%", nativeQuery = true)
    Iterable<User> adminFindUser(String username);

    boolean existsByUsername(String username);


}