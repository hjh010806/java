package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;

public class ArrayListExam3 {
    public static void main(String[] args) {
        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        ArrayList<사람> list = new ArrayList<>(Arrays.asList(사람1, 사람2, 사람3, 사람4));
        // 2. 네 사람에게 자기소개 시키기
        for (사람 사람 : list){
            사람.introduce();
        }
        // 3. 30대인 사람에게만 자기소개 시키기
        // 향상된 반복문

        // 배열 처음부터 끝가지 탐색 -> for( 타입 임시변수명 : 변수 ) -> 향상된 반복문.
        for (사람 사람 : list) {
            if (사람.getAge() >= 30 && 사람.getAge() < 40) {
                System.out.printf("%d살 %s입니다.\n", 사람.getAge(), 사람.getName());
            }
        }

    }
}

class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}