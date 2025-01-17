package TestPage.mbti_test.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Result {

    @Id
    @Column(name = "user_id", nullable = false)
    private Long UserId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String result;
}
