package com.example.movieinfoservice.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieSummary {
    private String id;
    private String title;
    private String overview;
}
