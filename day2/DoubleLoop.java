package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        for (int i =  1; i <= 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("실행");
            System.out.println("됩니다");

        }

        for (int i =  0; i < 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(j);
            }
        }


    }
}
