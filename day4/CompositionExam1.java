package day4;

public class    CompositionExam1 {
    public static void main(String[] args) {
        // 출력 : 아래와 같이 출력되게 해주세요.

        사람 a사람 = new 사람();
        a사람.나이 = 20;
        a사람.a왼팔();

        System.out.println(a사람.a왼팔.길이() + "cm");
        // 출력 : 100cm
    }
}
class 사람{
    int 나이 = 0;
    왼팔 a왼팔 = new 왼팔();
    public void a왼팔() {
        a왼팔.길이();
    }
}


class  왼팔 {
    public int 길이(){
        int 길이 = 100;
        return 길이;
    }
}

class  오른팔 {
    public int 길이(){
        int 길이 = 100;
        return 길이;
    }
}
