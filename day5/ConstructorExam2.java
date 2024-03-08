package day5;

public class ConstructorExam2 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔();

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
        a사람.걷다();

        int k = 10; // main 함수 안에서만 산다.

        사람 b사람 = new 사람();
        b사람.나이 = 20;

        int dan = 8;  // main 함수 안에서만 산다.
        for ( int i = 1; i < 9; i++ ) {
            // i => for block 안에서만 산다.
            System.out.println(dan + " * " + i + " = " + dan * i);
        }

        System.out.println(b사람.나이);
        b사람.걷다();
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
    }


}
class 사람 {
    int 나이;

    public 사람(){
        this.나이 = 나이;
    }
    팔 a왼팔 = new 팔();

    void 걷다(){
        System.out.println(나이 + "살인 사람이 걷는다.");
    }

}
class 팔{
    int 길이 = 100;
    손 a손 = new 손();

}

class 손 {
    엄지손가락 a엄지손가락 = new 엄지손가락();
}
class 엄지손가락 {
    int 길이 = 5;
}

