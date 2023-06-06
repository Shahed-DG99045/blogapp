package com.codewithshahed.blog.repositories;

import com.codewithshahed.blog.entities.Category;
import com.codewithshahed.blog.entities.Post;
import com.codewithshahed.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);

    List<Post> findByCategory(Category category);

}
