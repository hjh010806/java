package day6;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // 배열의 단점

        int[] arr = new int[10];    // int 10개짜리 배역

        arr[0] = 10; // 0번째 인덱스 10 입력

        // 배열은 크기가 고정이라 유연 X

        // 동적배열 -> 길이를 정하지 않고 유동적으로 변하게 함.
        // 동적배열(ArrayList)은 객체만 저장 가능.

        // 원시타입 -> int, double, boolean 등등
        // 원시타입을 제외한 자바의 모든 것은 객체이다.
        // 원시타입의 객체타입 존재
        // int -> Integer, double -> Double , boolean -> Boolean
        ArrayList<Integer> list = new ArrayList<>();

        // 값 추가하기
        list.add(10); // 0번째 인덱스에 10을 저장
        list.add(20); // 1번째 인덱스에 10을 저장
        list.add(30); // 2번째 인덱스에 10을 저장

        // 값 가져오기
        int rst = list.get(1);    // 1번 인덱스의 값을 가져온다
        System.out.println(rst);  // 20

        //값 삭제하기
        list.remove(1);  // 1번째 인덱스의 값을 삭제. 값이 지워진 인덱스는 이후 값들로 땡겨진다.
        System.out.println(list.get(1));    // 30
//        System.out.println(list.get(2));    // remove 후 2번째 인덱스는 없어진다 -> 에러

        // ArrayList의 크기 확인
        System.out.println(list.size());    // 2

        // ArrayList의 모든 값 출력
        // 마지막인덱스는 항상 개수 -1
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
