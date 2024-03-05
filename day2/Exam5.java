package day2;
public class Exam5 {
    public static void main(String[] args) {
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16

  ...

  9단까지 이런식으로 나오면 됩니다.
*/
        // 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                if (j % 2 == 0) {
                    System.out.println(i + " X " + j + " = " + (i * j));
                }

            }

        }

        /*for (int i = 1; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {

                System.out.println(i + " X " + j + " = " + (i * j));

            }

        }

        for (int i = 1; i < 9; i++) {
            System.out.println(i + "번 실행");
            for (int j = 1; j < 10; j++ ) {
                System.out.println("2 X " + j + " = " + (2*j));
            }
        }

*/
    }
}
