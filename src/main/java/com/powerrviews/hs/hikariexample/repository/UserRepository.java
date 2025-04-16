package com.powerrviews.hs.hikariexample.repository;


import com.powerrviews.hs.hikariexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
