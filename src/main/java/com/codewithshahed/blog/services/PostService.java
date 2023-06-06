package com.codewithshahed.blog.services;

import com.codewithshahed.blog.entities.Post;
import com.codewithshahed.blog.payloads.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto, Integer categoryId, Integer userId);

    Post updatePost(PostDto postDto, Integer postId);

    void deletePost(Integer postId);

    List<Post> getAllPost();

    Post getPostById(Integer postId);

    List<Post> getPostsByCategory(Integer categoryId);

    List<Post> getPostsByUser(Integer userId);

    List<Post> searchPosts(String keyword);


}
