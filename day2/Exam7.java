package day2;

public class Exam7 {
    public static void main(String[] args) {
        // 출력
    /*
    높이 : [3]

    *
    **
    ***


    */
        for (int high = 1; high <= 3; high++) {
            for (int i = 1; i <= high; i++) {
                System.out.print("*");
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
        for (int high = 1; high <= 5; high++) {
            for (int i = 1; i <= high; i++) {
                System.out.print("*");
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
        for (int high = 1; high <= 7; high++) {
            for (int i = 1; i <= high; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
