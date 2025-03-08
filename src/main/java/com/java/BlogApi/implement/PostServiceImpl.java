package com.java.BlogApi.implement;

import com.java.BlogApi.entity.Post;
import com.java.BlogApi.service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {
    @Override
    public Post createPost(Post post) {
        return null;
    }

    @Override
    public Post getPostById(Long postId) {
        return null;
    }

    @Override
    public List<Post> getAllPost() {
        return List.of();
    }

    @Override
    public Post updatePost(Post post) {
        return null;
    }

    @Override
    public void deletePost(Long postId) {

    }
}
