package day3;

public class ReturnExam1 {
    public static int func1() {
        int i = 10;
        System.out.print("출력 : ");
        return i;
    }
    public static int func2(int i) {
        System.out.print("출력 : ");
        return i;
    }
    public static int func3(int i) {
        System.out.print("출력 : ");
        return i * i;
    }
    public static int func4(int i, int j) {
        System.out.print("출력 : ");
        return i + j;
    }
    public static void main(String[] args) {
        int a = func1();
        System.out.println(a);
        // 출력 : 10

        int b = func1();
        System.out.println(b);
        // 출력 : 10

        int c = func2(22);
        System.out.println(c);
        // 출력 : 22

        int d = func2(55);
        System.out.println(d);
        // 출력 : 55

        int e = func3(10);
        System.out.println(e);
        // 출력 : 100
        int f = func3(5);
        System.out.println(f);
        // 출력 : 25

        int g = func4(10, 30);
        System.out.println(g);
        // 출력 : 40

        int h = func4(20, 50);
        System.out.println(h);
        // 출력 : 70


    }
}
