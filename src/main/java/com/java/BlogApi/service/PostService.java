package com.java.BlogApi.service;

import com.java.BlogApi.entity.Post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);
    Post getPostById(Long postId);
    List<Post> getAllPost();
    Post updatePost(Post post);
    void deletePost(Long postId);
}
