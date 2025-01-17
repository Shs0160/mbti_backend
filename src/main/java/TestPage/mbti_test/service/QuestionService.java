package TestPage.mbti_test.service;

import TestPage.mbti_test.controller.QuestionController;
import TestPage.mbti_test.dto.QuestionDTO;
import TestPage.mbti_test.repository.QuestionRepository;
import TestPage.mbti_test.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import TestPage.mbti_test.domain.User;
import TestPage.mbti_test.domain.Question;


@Service
@Transactional(readOnly = true)
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final UserRepository userRepository;

    public QuestionService(QuestionRepository questionRepository, UserRepository userRepository){
        this.questionRepository = questionRepository;
        this.userRepository = userRepository;
    }

    public void saveAnswer(QuestionDTO questionDTO){
        User user = userRepository.findById(questionDTO.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

       Question question = new Question();
       question.setUser(user);
       question.setNum1(questionDTO.getNum1());
       question.setNum2(questionDTO.getNum2());
       question.setNum3(questionDTO.getNum3());
       question.setNum4(questionDTO.getNum4());
       question.setNum5(questionDTO.getNum5());
       question.setNum6(questionDTO.getNum6());
       question.setNum7(questionDTO.getNum7());
       question.setNum8(questionDTO.getNum8());
       question.setNum9(questionDTO.getNum9());
       question.setNum10(questionDTO.getNum10());
       question.setNum11(questionDTO.getNum11());
       question.setNum12(questionDTO.getNum12());

       questionRepository.save(question);

    }


}
