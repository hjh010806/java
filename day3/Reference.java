package day3;

public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person(); // 객체가 힙 메모리에 생성
        Person p2 = new Person();


        System.out.println(p1);
        System.out.println(p2);

        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        System.out.println(p1.name);

        // 사람 복사
        Person p3 = p1;             // 홍길동 정보를 p3에 복사
        System.out.println(p3.name);

        // 홍길동은 2명이 된걸까 ? X

        p3.name = "이순신";

        System.out.println(p3.name);
        System.out.println(p1.name);

        // 손흥민을 2명 만들어주세요.
        // 손흥민, 31, 런던
        Person Son1 = new Person();
        Son1.name = "손흥민";
        Son1.home = "런던";
        Son1.age = 31;


        Person Son2 = new Person();
        Son2.name = Son1.name;
        Son2.home = Son1.home;
        Son2.age = Son1.age;

        Son1.name = "손흥만";


        System.out.println(Son1.name);
        System.out.println(Son2.name);

        // 객체의 복사
        // 참조값의 복사 -> 얉은 복사
        // 객체값의 복사 -> 깊은 복사


    }
}
