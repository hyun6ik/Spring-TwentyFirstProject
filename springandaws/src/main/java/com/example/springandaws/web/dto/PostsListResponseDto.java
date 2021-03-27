package com.example.springandaws.web.dto;

import com.example.springandaws.domain.posts.Posts;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }

}
