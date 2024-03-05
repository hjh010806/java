package day2;

public class Exam12 {
    public static void main(String[] args) {
        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < 3; i++) {

            for (int j = 4; j > -1; j--) {
                System.out.print("[" + arr[j] + "] ");

            }
            System.out.println((i +1) + "번 실행");
        }



    }
}
