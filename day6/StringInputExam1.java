package day6;
import java.util.Scanner;

public class StringInputExam1 {
    // 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
// 조건 : 성과 이름은 띄어쓰기로 구분해주기
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("이름을 입력해주세요: \n");
        String name = scan.nextLine();

        System.out.printf("나이를 입력해주세요: \n");
        int age = scan.nextInt();

        System.out.printf("안녕하세요. %d세 %s입니다. \n", age, name );


        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.


        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.
        System.out.printf("나이를 입력해주세요: \n");
        int age2 = scan.nextInt();      // nextInt 는 입력한 값만 빼오고 \n을 빼오지않는다 -> 다음 입력할때 \n이 남아있으므로 입력을 못하고 출력이 된다.
        scan.nextLine();                // 남은 찌꺼기를 다 빼낸다.

        System.out.printf("이름을 입력해주세요: \n");
        String name2 = scan.nextLine();


        System.out.printf("안녕하세요. %d세 %s입니다. \n", age2, name2);

        // 버퍼 찌꺼기 때문에 입력 꼬이는 법 해결하는 방법
        // 1. 버퍼를 nextLine()이용해 빼낸다.
        // 2. 모든 입력문을 nextLine으로 통일한다.




    }
}
