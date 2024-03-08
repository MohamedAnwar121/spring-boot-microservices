package com.example.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "movie")
public class Movie {

    @Id
    private String movieId;
    private String name;
    private String description;
}
