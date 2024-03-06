package day3;

public class MethodExam4 {
    public static void introduce(String name, int age) {
        System.out.println("안녕하세요. 저는 " + age + "살 " + name + "입니다. !");
    }
    public static void introduce2(int i) {
        System.out.println(i + "번 실행");
        for (int j = 0; j < i; j++) {

            System.out.println("안녕하세요. 저는 20살 홍길동 입니다. !");
        }
    }
    public static void greeting1(int i) {
        if (i == 1) {
            System.out.println("안녕하세요.");
        }
        else if (i == 2) {
            System.out.println("하이~");
        }
        else {
            System.out.println("봉쥬");
        }
    }
    public static void greeting2(int i, int j) {
        System.out.println(j + "번 실행");
        for (int x = 0; x < j; x++) {
            if (i == 1) {
                System.out.println("안녕하세요.");
            } else if (i == 2) {
                System.out.println("하이~");
            } else {
                System.out.println("봉쥬");
            }
        }
    }

    public static void main(String[] args) {

        introduce("홍길동", 20);
        introduce2(3);
        introduce2(5);
        introduce2(10);

        greeting1(2);
        greeting1(3);
        greeting1(1);

        greeting2(1, 3);
        greeting2(2, 5);
        greeting2(3, 7);


    }
}
