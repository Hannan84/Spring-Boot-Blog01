package com.java.BlogApi.service;

import com.java.BlogApi.entity.Post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);
    Post getPostById(Long id);
    List<Post> getAllPost();
    Post updatePost(Post post);
    void deletePost(Long id);
}
