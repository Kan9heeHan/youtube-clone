package com.clonetube.youtubeclone.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    private String id;
    private String text;
    private String authorId;
    private Integer likeCount;
    private Integer dislikeCount;
}
