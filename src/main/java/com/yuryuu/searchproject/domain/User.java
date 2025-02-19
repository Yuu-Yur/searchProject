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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_no;
    private String user_name;
    private String user_password;
    @ManyToMany
    @JoinTable(
            name = "user_search_word",
            joinColumns = @JoinColumn(name = "user_no"),
            inverseJoinColumns = @JoinColumn(name = "ko_word")
    )
    private Set<SearchWord> searchWords = new HashSet<>();
}
