package com.yuryuu.searchproject.repositoryTest;

import com.yuryuu.searchproject.domain.User;
import com.yuryuu.searchproject.repository.SearchedPostRepository;
import com.yuryuu.searchproject.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Log4j2
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void ctest() {
        User user = User.builder()
                .user_name("test")
                .user_password("pass")
                .build();
        userRepository.save(user);
    }

    @Test
    @Transactional
    public void rtest() {
        User result = userRepository.findById(3L).orElseThrow();
        log.info(result);
    }
}
