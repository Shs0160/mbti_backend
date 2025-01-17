package TestPage.mbti_test.repository;

import TestPage.mbti_test.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {



}
