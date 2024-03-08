package day5;

public class Format {
    public static void main(String[] args) {
        int age = 20;
        String name = "홍길동";
        System.out.println("안녕하세요. " + age + "살 입니다.\n");

        // %d : 정수 , %s : 문자열, %f : 실수 , \n : 줄바꿈
        System.out.printf("안녕하세요. %d살 %s 입니다\n", age, name);
    }
}
