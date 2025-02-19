package com.yuryuu.searchproject.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class SearchedPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long post_no;

    private String title;
    private String translated_title;
    private String link;
    private String translated_content;
    @ManyToMany
    @JoinTable(
            name = "search_post_word",
            joinColumns = @JoinColumn(name = "post_no"),
            inverseJoinColumns = @JoinColumn(name = "ko_word")
    )
    private Set<SearchWord> searchWords;
}
