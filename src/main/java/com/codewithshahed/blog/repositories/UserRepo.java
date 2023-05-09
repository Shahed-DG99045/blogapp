package com.codewithshahed.blog.repositories;

import com.codewithshahed.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
