package day3;

import java.awt.*;

public class Exam1 {
    public void Car(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("자동차가 달립니다.");
        }
    }

    public static void main(String[] args) {

        // 문제 : 자동차가 3번 달리게 해주세요.
        // 출력 : 자동차가 달립니다.

        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Exam1 v1 = new Exam1();
        v1.Car(3);
        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        Exam1 v2 = new Exam1();
        for (int i = 0; i < 3; i++) {
            v2.Car(1);
        }

        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.



    }
}
