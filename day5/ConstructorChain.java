package day5;

public class ConstructorChain {
    public static void main(String[] args) {
        동물 a동물 = new 동물();
        고양이 a고양이 = new 고양이(30);
        고양이 b고양이 = new 고양이();

    }
}

class 동물 {
    public 동물 (){}      // 기본생성자 추가
    public 동물(int 나이){

    }

}

class 고양이 extends 동물 {
    public 고양이(){
    }
    public 고양이(int 나이){
        System.out.println("고양이가 생성되었0습니다.");
    }
}