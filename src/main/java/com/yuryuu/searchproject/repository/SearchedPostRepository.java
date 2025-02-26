package com.yuryuu.searchproject.repository;

import com.yuryuu.searchproject.domain.SearchedPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SearchedPostRepository extends JpaRepository<SearchedPost, Long>, SearchedPostAdvancedRepository {
}
