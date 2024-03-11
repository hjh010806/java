package day6.pkg1;
import day6.pkg2.Test;   // 다른 폴더(패키지)의 클래스를 불러온다.\

public class AccessModifier {
    public static void main(String[] args) {

        // 접근제어자 => 인스턴스변수와 메서드, 클래스에 사용.
        // public, protected, default, private
        // public : 모든 클래스 접근 가능
        // protected : 같은 패키지 내의 클래스와 다른 패키지의 상속관계에 있는 클래스에서 접근가능.
        // default : 같은 패키지 내의 클래스에서 접근 가능
        // private : 같은 클래스 내에서만 접근 가능

        // alt + enter 로 자동 임포트 가능.
        Test t1 = new Test();
        t1.a = 10;
        System.out.println(t1.a);

//        Test2 t2 = new Test2();
//        t2.a = 20;
//        System.out.println(t2.a);

        // 문제 : 값이 출력되게 해주세요.
        Person p1 = new Person();
        p1.setId(20);


        System.out.println("제 번호는 " + p1.getId() + " 입니다.");

        // 출력 : 제 번호는 20 입니다.
        // 문제 : 사람의 id를 출력해주세요.
        // 조건 : 사람의 id를 20으로 설정해주세요.
        // 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
        // 조건 : 사람 클래스에서 출력할 수 없습니다.

        // 출력 : 제 번호는 20 입니다.

    }
}

class Test2 {
    private int a;   // 자기 자신만 사용 가능. Test2 클래스 내에서만 사용 가능.
}

class Person{
    private int id;
    private int age;
    private String name;
    private String address;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.

    // 카멜표기법 : 단어 여러개 조합해서 명칭할 대 의미가 바뀌는 부분에서 대문자를 넣어주는 방식.



    //  [ alt + insert ] => getter, setter 자동 생성 단축키.
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}