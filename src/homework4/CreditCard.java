package homework4;

public class CreditCard {
    int number;
    double balance;

    public CreditCard(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Сумма после начисления: " + balance);
    }

    public void withdrawal(double amount){
        balance = balance - amount;
        System.out.println("Сумма после снятия:" + balance);
    }

    public void info(){
        System.out.println("Номер счета " + number + " Текущая сумма счета " + balance);
    }
}
