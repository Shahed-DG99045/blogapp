package com.codewithshahed.blog.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    @Column(name = "post_title",length = 100,nullable = false)
    private String title;
    @Column(length = 1000)
    private String content;
    private String imageName;
    private Date addedDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    private User user;
}