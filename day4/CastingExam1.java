package day4;

public class CastingExam1 {
    public static void main(String[] args) {
        // 문제1
        // 변수는 수정하지 않습니다.
        int num1 = 10;
        int num2 = 4;

        System.out.println((double)num1 / (double)num2); // 출력 : 2.5

        // 문제 2
        무기 a무기 = new 칼();
        a무기.공격();
        // 출력 : 칼로 공격합니다.

        a무기 = new 활();
        a무기.공격();
        // 출력 : 활로 공격합니다.
    }
}

class 무기{

    public void 공격(){
    }
    public void 무기스킬사용() {
    }

}
class 칼 extends 무기 {
    double 데미지 = 10;
    double 크리티컬 = 2;
    double 스킬데미지 = 데미지 * 크리티컬;
    public void 사용() {
        System.out.println("칼로 데미지 " + 데미지 + " 공격");
    }

    public void 무기스킬사용() {
        System.out.println("연속 베기 스킬을 사용합니다. " + 크리티컬 + "배(" + 스킬데미지 + ")의 피해를 입힙니다.");
    }
}

class 활 extends 무기 {
    double 데미지 = 15;
    double 크리티컬 = 1.5;

    double 스킬데미지 = 데미지 * 크리티컬;
    public void 사용() {
        System.out.println("활로 데미지 " + 데미지 + " 공격");
    }

    public void 무기스킬사용() {
        System.out.println("불화살 스킬을 사용합니다. " + 크리티컬 + "배(" + 스킬데미지 + ")의 피해를 입힙니다.");
    }
}