package day2;

public class Exam13 {
    public static void main(String[] args) {
        /*
		// 아래 4줄은 위 1줄과 같은 의미 입니다.
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
		*/
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i <= 5; i++) {
            if (i < 5) {
                arr[i] = arr[i]+arr[i];
            }
            if(i == 4){
                System.out.println(arr[i]);
            }
        }
    }
}
