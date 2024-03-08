package day5;

public class SuperExam1 {
    public static void main(String[] args) {
        new 사람1("홍길동", 27);
        // 아래와 같이 출력되게 해주세요.

        // 동물(String 이름, int 나이) 실행됨!
        // 이름 : 홍길동
        // 나이 : 27
    }
}

class 동물1 {

    동물1(String 이름) {
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물1(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}

class 사람1 extends 동물1 {
    사람1(String 이름){
        super(이름);
    }
    사람1(String 이름, int 나이){
        super(이름, 나이);
    }

}

