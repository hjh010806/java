package day2;

public class Exam11 {
    public static void main(String[] args) {
        // 배열의 모든 요소를 세번 출력해주세요.
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 5; j++) {
                System.out.print("[" + arr[j] + "] " );

            }
            System.out.println(i + "번 실행");
        }
    }
}
