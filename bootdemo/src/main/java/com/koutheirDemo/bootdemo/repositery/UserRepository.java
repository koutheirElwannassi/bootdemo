package com.koutheirDemo.bootdemo.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koutheirDemo.bootdemo.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
