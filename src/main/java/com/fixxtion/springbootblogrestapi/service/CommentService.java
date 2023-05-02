package com.fixxtion.springbootblogrestapi.service;

import com.fixxtion.springbootblogrestapi.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
}
