package TestPage.mbti_test.service;

import TestPage.mbti_test.dto.QuestionDTO;
import TestPage.mbti_test.repository.QuestionRepository;
import TestPage.mbti_test.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import TestPage.mbti_test.domain.User;
import TestPage.mbti_test.domain.Question;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final UserRepository userRepository;

    public QuestionService(QuestionRepository questionRepository, UserRepository userRepository){
        this.questionRepository = questionRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public String saveAndCalculateResult(QuestionDTO questionDTO) {

        User user = userRepository.findByName(questionDTO.getUserName())
                .orElseGet(() -> {
                    User newUser = new User();
                    newUser.setName(questionDTO.getUserName());
                    return userRepository.save(newUser);
                });

        Question question = new Question();
        question.setUser(user);
        question.setAnswers(questionDTO.getAnswers());
        questionRepository.save(question);

        String result = calculateMBTI(question.getAnswers());
        user.setResult(result);
        userRepository.save(user);

        return result;
    }

    private String calculateMBTI(List<String> answers) {
        StringBuilder result = new StringBuilder();

        //여기서 MBTI 계산해서 저장함!!
        result.append(countAnswers(answers.subList(0, 3), "E", "I") ? "E" : "I");
        result.append(countAnswers(answers.subList(3, 6), "N", "S") ? "N" : "S");
        result.append(countAnswers(answers.subList(6, 9), "T", "F") ? "T" : "F");
        result.append(countAnswers(answers.subList(9, 12), "P", "J") ? "P" : "J");

        return result.toString();
    }

    private boolean countAnswers(List<String> answers, String option1, String option2) {
        long countOption1 = answers.stream().filter(answer -> answer.equals(option1)).count();
        long countOption2 = answers.stream().filter(answer -> answer.equals(option2)).count();
        return countOption1 >= countOption2;
    }



}
