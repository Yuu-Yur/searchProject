package com.yuryuu.searchproject.repository;

import com.yuryuu.searchproject.domain.SearchedPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchedPostRepository extends JpaRepository<SearchedPost, Long>, SearchedPostAdvancedRepository {
}
