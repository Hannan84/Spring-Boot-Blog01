package com.java.BlogApi.repo;

import com.java.BlogApi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
