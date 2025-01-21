package TestPage.mbti_test.repository;

import TestPage.mbti_test.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByNumRange(int start, int end);

}
