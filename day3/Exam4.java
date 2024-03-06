package day3;

public class Exam4 {

    public void printValue(String n) {
        System.out.println("출력 : " + n);
    }

    // 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.

    public static void main(String[] args) {
        int num = 10;


        System.out.println("출력 : " + num); // 출력 : 10

        Exam4 p1 = new Exam4();
        p1.printValue("안녕");


        // 출력 : 안녕
    }
}
