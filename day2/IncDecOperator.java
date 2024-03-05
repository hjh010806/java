package day2;

public class IncDecOperator {
    public static void main(String[] args) {

        // 증감연산자
        int num = 10;
        System.out.println(num + 5);


        // 변수의 값을 5 증가시키고 싶다.
        num += 5;    // num = num + 5;     와 같은 표현
        System.out.println(num);

        // 변수의 값을 3 감소시키고 싶다
        num -= 3;   // num = num - 3;      와 같은 표현
        System.out.println(num);

        num += 1;  //  증가값이 인 경우에 한해서는 num++ 라고 쓸 수 있다.
        num++ ; // num += 1; 와 같은 표현

        num -= 1;
        num --; // num -= 1;
    }
}
