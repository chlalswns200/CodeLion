package week3_day2.interfaceEx;

public class CurrentMoney {
    int currentMoney;
    Money money;

    public CurrentMoney(int currentMoney, Money money) {
        this.currentMoney = currentMoney;
        this.money = money;
    }

    public void exchange() {
        System.out.println(this.currentMoney * money.price() + "원");
    }
}
