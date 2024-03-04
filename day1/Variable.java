package day1;

public class Variable {
    public static void main(String[] args){
        // 변수
        // 변수는 데이터를 저장하는 공간
        // int 정수를 의미
        int number;

        // 변수에 값 저장
        number = 40;
        int age;
        age = 24;
        int year;
        year = 2024;
        // int muber2 = "황준하"; // 숫자 변수에 문자를 저장하려고 하면 안됨.
        // String ==> 문자열.
        String str;
        str = "황준하";

        // 변수에 저장되어 있는 값을 사용
        // 변수명을 값처럼 사용한다.

        String name;
        name = "황준하";

        /*System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
*/
        // 자기소개 10번 출력


        System.out.println("안녕하세요");
        System.out.println("제 이름은 "+(name)+"입니다.");
        System.out.println("나이는 " +(age)+"세 입니다.");
        System.out.println("저의 내년 나이는 "+ (age+1) + "세 입니다.");


        System.out.println("안녕하세요. "+ year++ +"년도 제 나이는 "+ age++ +"세 " + name + "입니다.");
        System.out.println("안녕하세요. "+ year++ +"년도 제 나이는 "+ age++ +"세 " + name + "입니다.");
        System.out.println("안녕하세요. "+ year++ +"년도 제 나이는 "+ age++ +"세 " + name + "입니다.");
        System.out.println("안녕하세요. "+ year++ +"년도 제 나이는 "+ age++ +"세 " + name + "입니다.");
        System.out.println("안녕하세요. "+ year++ +"년도 제 나이는 "+ age++ +"세 " + name + "입니다.");
    }
}
