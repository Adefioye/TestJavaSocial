package com.koko.restful.service.restfulwebservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koko.restful.service.restfulwebservice.users.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
