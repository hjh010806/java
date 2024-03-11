package day6;

import java.util.Scanner;

public class StringInputExam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // 문자열 -> 숫자열로 변환
        // 올바른 문자형 숫자를 넣어야한다. ex) "a100" = 출력못함,  "100" = 출력가능
        int convertedInt = Integer.parseInt("100");  // "100" 은 문자 100으로 출력되지만 Integer.parseInt()를 이용해 숫자100으로 만들수있다.
        System.out.println(convertedInt + 100);       // 출력 : 200

        System.out.println("나이를 입력해주세요 : ");
//        String age2 = scan.nextLine();
//        int intAge = Integer.parseInt(age2);
        int age2 = Integer.parseInt(scan.nextLine());

        System.out.println("이름을 입력해주세요. : ");
        String name2 = scan.nextLine();

        System.out.printf("안녕하세요. %d살 %s입니다.", age2, name2);


    }
}
