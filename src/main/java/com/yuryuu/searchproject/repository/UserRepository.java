package com.yuryuu.searchproject.repository;

import com.yuryuu.searchproject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserAdvancedRepository {
}
