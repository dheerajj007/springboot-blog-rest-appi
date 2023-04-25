package com.fixxtion.springbootblogrestapi.service;

import com.fixxtion.springbootblogrestapi.payload.PostDto;
import com.fixxtion.springbootblogrestapi.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
