package com.fixxtion.springbootblogrestapi.service.impl;

import com.fixxtion.springbootblogrestapi.entity.Post;
import com.fixxtion.springbootblogrestapi.payload.PostDto;
import com.fixxtion.springbootblogrestapi.repository.PostRepository;
import com.fixxtion.springbootblogrestapi.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        //Convert DTO to entity
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post newpost = postRepository.save(post);

        //Convert entity to DTO
        PostDto postResponse = new PostDto();
        postResponse.setId(newpost.getId());
        postResponse.setDescription(newpost.getDescription());
        postResponse.setContent(newpost.getContent());
        postResponse.setTitle((newpost.getTitle()));
        return postResponse;
    }
}
