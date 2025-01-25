package TestPage.mbti_test.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Question {

    @Id
    @Column(name = "user_id", nullable = false)
    private Long UserId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    @ElementCollection
    @CollectionTable(name = "question_answers", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "answer")
    private List<String> answers;
}
