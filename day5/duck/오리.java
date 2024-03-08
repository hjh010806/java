package day5.duck;

public class 오리 {

    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄치다();
        // 출력 : 저는 날 수 없어요..
        // 출력 : 오리가 둥둥 떠다닙니다.

        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.날다();
        a아수라오리.헤엄치다();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 둥둥 떠다닙니다.
    }
}
abstract class 날개아이템{
    abstract void 사용();
}

class 날개 extends 날개아이템{
    void 사용(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 고무날개 extends 날개아이템{
    void 사용(){
        System.out.println("저는 날수 없어요..");
    }
}

abstract class 발아이템{
    abstract void 사용();
}

class 발 extends 발아이템{
    void 사용() {
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}

class 고무발 extends 발아이템{
    void 사용(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}

class 그냥오리{
    날개아이템 a날다 = new 날개();
    void 날다(){
        a날다.사용();
    }
    발아이템 a헤엄치다 = new 발();
    void 헤엄치다(){
        a헤엄치다.사용();
    }
}

class 청둥오리 extends 그냥오리{

}

class 흰오리 extends 그냥오리{

}

class 고무오리 extends 그냥오리{
    발아이템 a발 = new 고무발();
    void 헤엄치다(){
        a발.사용();
    }
}

class 고무오리2 extends 고무오리{

}

class 아수라오리 extends 그냥오리{
    발아이템 a발 = new 고무발();
    void 헤엄치다(){
        a발.사용();
    }
}