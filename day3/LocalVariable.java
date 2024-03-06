package day3;

public class LocalVariable {
    public static int test() {
        int num = 10;

        return num;
    }

    public static void main(String[] args) {
        int num = test();
        System.out.println(num);

//        Person.introduce(); // 안녕하세요 저는 20살 입니다.
//        Person.addAge();   // 나이 1 증가
//        Person.introduce(); // 안녕하세요 저는 21살 입니다.
        Person p1  =new Person();
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        p1.introduce(); // 홍길동 자기소개
        p1.addAge();    // 홍길동 나이 증가
        p1.introduce(); // 홍길동 자기소개

        Person p2 = new Person();
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";

        p2.introduce(); // 이순신 자기소개
        p2.addAge();    // 이순신 나이 증가
        p2.introduce(); // 이순신 자기소개

        Person.averageAge = 31;

        p1.introduce();
        p2.introduce();





    }
}
