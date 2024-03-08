package day5;

public class Constructor {
    public static void main(String[] args) {
        Person1 aPerson = new Person1(20, "홍길동", "서울");

        //객체의 데이터 세팅 -> 객체 초기화
//        aPerson.age = 20;
//        aPerson.name = "홍길동";
//        aPerson.home = "서울";
//        aPerson.reset(20, "홍길동", "서울");     // 객체 초기화는 꼭 필요한데 실수로 누락할 수 있다.

        aPerson.introduce1(); // 객체가 올바르게 작동하는데 데이터가 반드시 필요하다.

        Person1 aPerson2 = new Person1(30, "이순신", "부산");

//        aPerson2.age = 30;
//        aPerson2.name = "이순신";
//        aPerson2.home = "부산";
//        aPerson.reset(30, "이순신", "부산");

        aPerson2.introduce1();

//        Person bPerson = new Person();

    }
}
class Person1{
    int age1;
    String name1;
    String home1;

    //생성자 -> 객체가 생성될 때 자동으로 호출되는 메서드
    // 작성 규칙 -> 리턴타입 X, 이름은 무조건 클래스 이름과 동일하게

    // public Person(){} // 기본 생성자. 안만들면 자바가 자동으로 만들어준다.
    // 다만, 내가 생성자를 의도적으로 만들면 자바는 기본생성자를 만들지 않는다.

    public Person1(int age1, String name1, String home1) {
        System.out.println("사람이 한명 만들어집니다.");
        this.age1 = age1;
        this.name1 = name1;
        this.home1 = home1;
    }

    // 함수의 지역변수와 객체의 인스턴스 변수는 동일한 이름으로 존재 가능
//    void reset (int age, String name, String home){
//        // this는 객체를 가르킨다.
//        this.age = age;
//        this.name = name;
//        this.home = home;
//    }

    void introduce1() {
        System.out.println("안녕하세요. 저는 " + age1 + "살 " + name1 + "입니다.");
    }

}
