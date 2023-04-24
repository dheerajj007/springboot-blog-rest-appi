package com.fixxtion.springbootblogrestapi.repository;

import com.fixxtion.springbootblogrestapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
