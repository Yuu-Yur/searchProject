package com.yuryuu.searchproject.repositoryTest;

import com.yuryuu.searchproject.domain.SearchWord;
import com.yuryuu.searchproject.domain.SearchedPost;
import com.yuryuu.searchproject.repository.SearchWordRepository;
import com.yuryuu.searchproject.repository.SearchedPostRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
@Log4j2
public class SearchedPostRepositoryTest {
    @Autowired
    SearchedPostRepository searchedPostRepository;
    @Autowired
    SearchWordRepository searchWordRepository;

    @Test
    public void ctest() {
        Set<SearchWord> searchWords = new HashSet<>();
        searchWords.add(searchWordRepository.findById(1L).orElseThrow());
        SearchedPost searchedPost = SearchedPost.builder()
                .link("testlink.com")
                .title("testTitle")
                .translated_title("테스트제목")
                .translated_content("테스트내용")
                .searchWords(searchWords)
                .build();
        searchedPostRepository.save(searchedPost);
    }
}
