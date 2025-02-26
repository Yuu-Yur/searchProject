package com.yuryuu.searchproject.repositoryTest;

import com.yuryuu.searchproject.domain.SearchWord;
import com.yuryuu.searchproject.domain.SearchedPost;
import com.yuryuu.searchproject.repository.SearchWordRepository;
import com.yuryuu.searchproject.repository.SearchedPostRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class SearchWordRepositoryTest {
    @Autowired
    SearchWordRepository searchWordRepository;

    @Test
    public void ctest() {
        SearchWord searchWord = SearchWord.builder()
                .ko_word("테스트")
                .en_word("test")
                .ge_word("prüfen")
                .ja_word("テスト")
                .ru_word("тест")
                .sp_word("prueba")
                .build();
        searchWordRepository.save(searchWord);
        log.info(searchWord);
    }
}
