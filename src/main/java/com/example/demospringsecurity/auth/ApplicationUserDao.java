package com.example.demospringsecurity.auth;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationUserDao {
    Optional<ApplicationUser> selectApplicationUserByUsername(String username);

}
