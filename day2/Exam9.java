package day2;

public class Exam9 {
    public static void main(String[] args) {
        int y = 3;
        // 출력
        /*


           *
          ***
         *****


         */
        for (int i = 1; i <= y; i++) {
            // 공백 출력
            for (int j = 1; j <= y - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
        y = 5;
        // 출력
        /*


         *
         ***
         *****
         *******
         *********


         */
        for (int i = 1; i <= y; i++) {
            // 공백 출력
            for (int j = 1; j <= y - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
        y = 7;
        // 출력
        /*


         *
         ***
         *****
         *******
         *********
         ***********
         *************


         */
        for (int i = 1; i <= y; i++) {
            // 공백 출력
            for (int j = 1; j <= y - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }

    }
}
