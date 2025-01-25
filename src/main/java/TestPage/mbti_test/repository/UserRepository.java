package TestPage.mbti_test.repository;

import TestPage.mbti_test.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import TestPage.mbti_test.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);


}
