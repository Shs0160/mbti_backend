package TestPage.mbti_test.controller;

import TestPage.mbti_test.dto.QuestionDTO;
import TestPage.mbti_test.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mbti_test")

public class MBTIController {

    private QuestionService questionService;

    public MBTIController(QuestionService questionService){
        this.questionService = questionService;
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitAnswers(@RequestBody QuestionDTO questionDTO) {
        String result = questionService.saveAndCalculateResult(questionDTO);
        return ResponseEntity.ok(result);
    }
}
