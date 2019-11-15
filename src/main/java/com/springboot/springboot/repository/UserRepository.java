package com.springboot.springboot.repository;

import com.springboot.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
