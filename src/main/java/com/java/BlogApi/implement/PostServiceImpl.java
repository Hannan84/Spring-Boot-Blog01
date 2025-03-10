package com.java.BlogApi.implement;

import com.java.BlogApi.entity.Post;
import com.java.BlogApi.repo.PostRepo;
import com.java.BlogApi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Override
    public Post createPost(Post post) {
        return postRepo.save(post);
    }

    @Override
    public Post getPostById(Long id) {
        return postRepo.findById(id).orElse(null);
    }

    @Override
    public List<Post> getAllPost() {
        return postRepo.findAll();
    }

    @Override
    public Post updatePost(Post post) {
        return null;
    }

    @Override
    public void deletePost(Long id) {
        postRepo.deleteById(id);
    }
}
