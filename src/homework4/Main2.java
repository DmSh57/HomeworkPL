package homework4;

public class Main2 {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(10,20,30);
        bankomat.plusMoney(10,10,10);
        bankomat.withdrawMoney(56565656);
        bankomat.withdrawMoney(233);
        bankomat.plusMoney(1,2,3);
        bankomat.showBalance();
    }
}
