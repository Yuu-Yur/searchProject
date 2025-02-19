package com.yuryuu.searchproject.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class SearchWord {
    @Id
    private String ko_word;

    private String en_word;
    private String ru_word;
    private String ja_word;
    private String ge_word;
    private String sp_word;
    @ManyToMany(mappedBy = "searchWords")
    private Set<User> users = new HashSet<>();
    @ManyToMany(mappedBy = "searchWords")
    private Set<SearchedPost> searchedPosts = new HashSet<>();
}
