package TestPage.mbti_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import TestPage.mbti_test.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {



}
