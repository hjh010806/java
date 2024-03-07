package day4;

public class Account {
    int remainder = 0;
    String  name;

    public void deposit(int depositMoney) {
        remainder += depositMoney;
        System.out.println(depositMoney + "원을 예금했습니다.");
        System.out.println("잔액 : " + remainder + "원");
    }

    public int withdraw(int withdrawMoney) {
        remainder -= withdrawMoney;
        return withdrawMoney;
    }

    public int getRemainder() {
        System.out.print(name + "님 계좌 잔액 : ");
        return remainder;

    }
}

