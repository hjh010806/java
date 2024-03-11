package day6;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 출력 : 프로그램이 어떤 값을 콘솔창(표준 입력 = 키보드)에서 출력
        // 입력 : 프로그램에 어떤 값을 콘솔창(표준 입력 = 키보드)에서 입력

        System.out.println(); // System = 표준 / out = 내보내다

        Scanner scan = new Scanner(System.in);  // 자바에는 Scanner 함수가 있어서 Scanner (변수명) = new Scanner(System.in) 을 활용이 편하다.

        int num = scan.nextInt();     // 정수를 입력

        System.out.printf("당신이 입력한 값은 : %d\n", num);

        //문자열 입력
        String str = scan.next();
        System.out.printf("당신이 입력한 문자열은 : %s\n", str);

        // 구구단의 단을 입력받아 해당 단을 출력해주는 프로그램을 만들어주세요.

        // 예시)
        // 단을 입력해주세요 : 3
        // 3단 출력

        // 단을 입력해주세요 : 5
        // 5단 출력

        Scanner scan1 = new Scanner(System.in);

        int dan = scan1.nextInt();

        System.out.printf("단을 입력해주세요 : %d\n", dan);

        for (int i = 0; i < 10; i++){
            System.out.printf(dan + " X " + i + " = " + (dan*i)+"\n");

        }


    }
}
