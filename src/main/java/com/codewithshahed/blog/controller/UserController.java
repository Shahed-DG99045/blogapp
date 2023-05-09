package com.codewithshahed.blog.controller;

import com.codewithshahed.blog.payloads.ApiResponse;
import com.codewithshahed.blog.payloads.UserDto;
import com.codewithshahed.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    //POST-create user
    @PostMapping("/")
    public ResponseEntity<UserDto>createUser(@RequestBody UserDto userDto)
    {
        UserDto createUserDto=this.userService.createUser(userDto);
        return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
    }
    //PUT-update user
    @PutMapping("/{userId}")
    public ResponseEntity<UserDto>updateUser(@RequestBody UserDto userDto,@PathVariable("userId")Integer uId)
    {
         UserDto updatedUser=this.userService.updateUser(userDto,uId);
         return ResponseEntity.ok(updatedUser);
    }
    //Delete- delete user
    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId")Integer uid){
        this.userService.deleteUser(uid);
        return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted Successfully",true),HttpStatus.OK);
    }

    //Get-user get
    @GetMapping("/")
    public ResponseEntity<List<UserDto>>getAllUsers(){
        return ResponseEntity.ok(this.userService.getAllUsers());
    }

    //Get-user get
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto>getSingleUser(@PathVariable Integer userId){
        return ResponseEntity.ok(this.userService.getUserById(userId));
    }

}
