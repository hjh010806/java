package day1;

public class Print {
    public static void main(String args[]){
        System.out.println(100);
        System.out.println(200);
        System.out.println("황준하");
        System.out.println("홍길동");
        System.out.println("안녕하세요");
        System.out.println(300);
        System.out.println(400);
        System.out.println(500);
        System.out.println("사과");
        System.out.println("배고파");
        System.out.println(600);

        // \n은 줄바꿈
        System.out.println("안녕하세요\n반갑습니다.");

        // 문자 합치기
        System.out.println("안녕하세요 황준하입니다.");
        System.out.println("안녕하세요"+" 황준하입니다.");

        // 숫자 더하기
        System.out.println(100+200);
        System.out.println(2000 + 3000);

        System.out.println("100");  //문자
        System.out.println(100);    //숫자
        System.out.println("100"+"200");
        System.out.println(100 + 200);

        // JAVA에서는 문자 + 숫자 => 숫자를 문자화해서 붙임
        System.out.println("100" + 200);


        // 출력문을 이용해 더하기 식 표현하기
        System.out.println("100 + 200 = 300");
        // + 연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("123124 + 56563 = " + (123124 + 56563) );

        // 숫자 곱하기 (*)
        System.out.println(100*200);

        // 구구단 2단을 출력해주세요. 단, 출력문은 한번만 사용
        System.out.println("2 * 1 = " + (2*1) +
                "\n2 x 2 = " + (2*2)+
                "\n2 x 3 = " + (2*3)+
                "\n2 x 4 = " + (2*4)+
                "\n2 x 5 = " + (2*5)+
                "\n2 x 6 = " + (2*6)+
                "\n2 x 7 = " + (2*7)+
                "\n2 x 8 = " + (2*8)+
                "\n2 x 9 = " + (2*9)+
                "\n2 x 10 = " + (2*10)
        );




    }
}
