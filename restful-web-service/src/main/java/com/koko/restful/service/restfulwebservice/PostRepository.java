package com.koko.restful.service.restfulwebservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koko.restful.service.restfulwebservice.users.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
