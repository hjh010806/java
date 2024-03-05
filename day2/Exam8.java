package day2;

public class Exam8 {
    public static void main(String[] args) {
// 출력
    /*

    높이 : [3]

      *
     **
    ***

    */
        for (int high = 1; high < 4; high++){
            for (int i = 3; i > 0 ; --i) {
                if (high < i ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    /*

    높이 : [5]

        *
       **
      ***
     ****
    *****

    */
        for (int high = 1; high < 6; high++){
            for (int i = 5; i > 0 ; --i) {
                if (high < i ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    /*

    높이 : [7]

          *
         **
        ***
       ****
      *****
     ******
    *******

    */
        for (int high = 1; high < 8; high++){
            for (int i = 7; i > 0 ; --i) {
                if (high < i ) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }


    }

}
