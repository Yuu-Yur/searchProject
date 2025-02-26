package com.yuryuu.searchproject.repository;

import com.yuryuu.searchproject.domain.SearchWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchWordRepository extends JpaRepository<SearchWord, Long>, SearchWordAdvancedRepository {
}
