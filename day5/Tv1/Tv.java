package day5.Tv1;

public class Tv {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!


        System.out.println("== 표준Tv 리모콘 들여온 후 ==");
        // 표준Tv 리모콘을 만든다.
        표준Tv a표준Tv;

        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
        a표준Tv = a샤오미Tv;
        a표준Tv.켜기();
        // 출력 : 샤오미TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오미TV 꺼집니다.

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
        a표준Tv.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성TV 꺼집니다.


        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
        a표준Tv.켜기();
        // 출력 : LGTV 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTV 꺼집니다.


        LGTv aLGTv2 = (LGTv)a표준Tv;
        aLGTv2.게임모드전환();
    }
}

// 추상클래스는 객체화하여 사용할 수 없다. 반드시 상속받아 오버라이딩 해서 사용해야한다.
abstract class 표준Tv{     // abstract 클래스
    abstract void 켜기();  // abstract = 추상 메서드   => abstract를 넣으려면 class도 abstract클래스여야한다.
    abstract void 끄기();
}
class 삼성Tv extends 표준Tv{    // 추상 메서드를 상속받은 클래스들은 추상메서드를 오버라이딩을 통하여 무조건 정의해야한다.
     void 켜기() {
        System.out.println("삼성Tv가 켜집니다.");
    }

     void 끄기() {
        System.out.println("삼성Tv가 꺼집니다.");
    }

     void ar켜기() {
        System.out.println("삼성Tv ar켜기!");
    }
}

class 샤오미Tv extends 표준Tv {
     void 켜기() {
        System.out.println("샤오미Tv가 켜집니다.");
    }

     void 끄기() {
        System.out.println("샤오미Tv가 꺼집니다.");
    }

     void vr켜기() {
        System.out.println("샤오미Tv vr켜기!");
    }
}

class LGTv extends 표준Tv{
     void 켜기() {
        System.out.println("LGTv가 켜집니다.");
    }

     void 끄기() {
        System.out.println("LGTv가 꺼집니다.");
    }

     void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");
    }
}

