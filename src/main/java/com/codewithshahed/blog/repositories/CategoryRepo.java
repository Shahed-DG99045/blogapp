package com.codewithshahed.blog.repositories;

import com.codewithshahed.blog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
