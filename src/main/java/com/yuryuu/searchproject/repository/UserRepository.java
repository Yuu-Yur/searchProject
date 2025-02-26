package com.yuryuu.searchproject.repository;

import com.yuryuu.searchproject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long>, UserAdvancedRepository {
}
