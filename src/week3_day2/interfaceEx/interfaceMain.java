package week3_day2.interfaceEx;

public class interfaceMain {
    public static void main(String[] args) {
        CurrentMoney currentMoneyA = new CurrentMoney(5, new Dollar()); //달러 -> 원
        currentMoneyA.exchange();

        CurrentMoney currentMoneyB = new CurrentMoney(9000, new Yen()); //엔화 -> 원
        currentMoneyB.exchange();
    }
}
