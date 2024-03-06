package day3;

public class Exam2 {
    public static void main(String[] args) {
        CarTest c1 = new CarTest();
        c1.Carname = "첫번째";
        c1.Speed = 220;

        CarTest c2 = new CarTest();
        c2.Carname = "두번째";
        c2.Speed = 250;

        c1.Run();
        c2.Run();


    }
    // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
    // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
    // 각 자동차가 자신의 최고속력으로 달리게 해주세요.


    // 출력 : 자동차가 최대속력 220km로 달립니다.
    // 출력 : 자동차가 최대속력 250km로 달립니다.

}

class CarTest {
    String Carname;
    int Speed;

    public void Run() {
        System.out.println(Carname + " 자동차가 최대속력 " + Speed + "km로 달립니다.");

    }
}
