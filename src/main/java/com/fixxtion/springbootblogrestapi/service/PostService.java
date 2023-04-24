package com.fixxtion.springbootblogrestapi.service;

import com.fixxtion.springbootblogrestapi.payload.PostDto;
import org.springframework.http.ResponseEntity;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getAllPosts();
}
