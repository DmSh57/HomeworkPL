package homework4;

public class Bankomat {
    int count20;
    int count50;
    int count100;

    public Bankomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void plusMoney(int count20, int count50, int count100) {
        this.count20 = this.count20 + count20;
        this.count50 = this.count50 + count50;
        this.count100 = this.count100 + count100;
        int balance = this.count20 * 20 + this.count50 * 50 + this.count100 * 100;
        System.out.println("Количество купюр номиналом 20 - " + this.count20);
        System.out.println("Количество купюр номиналом 50 - " + this.count50);
        System.out.println("Количество купюр номиналом 100 - " + this.count100);
        System.out.println("Текущий баланс - " + balance);
    }

    public boolean withdrawMoney(int amount) {

        int fullBalance = count20 * 20 + count50 * 50 + count100 * 100;

        if (amount > fullBalance) {
            System.out.println("Недостаточно средств");
            return false;
        }
        if (amount % 10 != 0) {
            System.out.println("Ошибка");
            return false;
        }
        int tempCount100 = count100;
        int tempCount50 = count50;
        int tempCount20 = count20;
        int give100 = 0;
        int give50 = 0;
        int give20 = 0;
        int balanceIssue = amount;

        while (balanceIssue >= 100 && tempCount100 > 0) {
            give100++;
            tempCount100--;
            balanceIssue = balanceIssue - 100;
        }
        while (balanceIssue >= 50 && tempCount50 > 0) {
            give50++;
            tempCount50--;
            balanceIssue = balanceIssue - 50;
        }
        while (balanceIssue >= 20 && tempCount20 > 0) {
            give20++;
            tempCount20--;
            balanceIssue = balanceIssue - 20;
        }
        if (balanceIssue != 0) {
            System.out.println("Невозможно выдать запрошенную сумму");
            return false;
        }

        this.count100 = tempCount100;
        this.count50 = tempCount50;
        this.count20 = tempCount20;

        System.out.println("Успешно, выдано - " + amount);
        return true;
    }
    public void showBalance() {
        System.out.println("В банкомате:");
        System.out.println("100: " + count100);
        System.out.println("50 :" + count50);
        System.out.println("20: " + count20);
    }
}

