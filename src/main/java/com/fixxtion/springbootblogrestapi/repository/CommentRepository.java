package com.fixxtion.springbootblogrestapi.repository;

import com.fixxtion.springbootblogrestapi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
