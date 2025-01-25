package TestPage.mbti_test.dto;

import java.util.List;

public class QuestionDTO {
    private String userName;
    private List<String> answers;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
