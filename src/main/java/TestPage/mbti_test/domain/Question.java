package TestPage.mbti_test.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    private Long Num1;

    private Long Num2;

    private Long Num3;

    private Long Num4;

    private Long Num5;

    private Long Num6;

    private Long Num7;

    private Long Num8;

    private Long Num9;

    private Long Num10;

    private Long Num11;

    private Long Num12;

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getNum1() {
        return Num1;
    }

    public void setNum1(Long num1) {
        Num1 = num1;
    }

    public Long getNum2() {
        return Num2;
    }

    public void setNum2(Long num2) {
        Num2 = num2;
    }

    public Long getNum3() {
        return Num3;
    }

    public void setNum3(Long num3) {
        Num3 = num3;
    }

    public Long getNum4() {
        return Num4;
    }

    public void setNum4(Long num4) {
        Num4 = num4;
    }

    public Long getNum5() {
        return Num5;
    }

    public void setNum5(Long num5) {
        Num5 = num5;
    }

    public Long getNum6() {
        return Num6;
    }

    public void setNum6(Long num6) {
        Num6 = num6;
    }

    public Long getNum7() {
        return Num7;
    }

    public void setNum7(Long num7) {
        Num7 = num7;
    }

    public Long getNum8() {
        return Num8;
    }

    public void setNum8(Long num8) {
        Num8 = num8;
    }

    public Long getNum9() {
        return Num9;
    }

    public void setNum9(Long num9) {
        Num9 = num9;
    }

    public Long getNum10() {
        return Num10;
    }

    public void setNum10(Long num10) {
        Num10 = num10;
    }

    public Long getNum11() {
        return Num11;
    }

    public void setNum11(Long num11) {
        Num11 = num11;
    }

    public Long getNum12() {
        return Num12;
    }

    public void setNum12(Long num12) {
        Num12 = num12;
    }
}
