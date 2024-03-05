package day2;

public class Exam10 {
    public static void main(String[] args) {
        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]+((i+1)*10));
        }
    }
}
