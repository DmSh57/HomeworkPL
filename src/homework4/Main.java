package homework4;

import javax.smartcardio.Card;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(5757, 345.66);
        CreditCard card2 = new CreditCard(5656, 1000);
        CreditCard card3 = new CreditCard(5555, 999.999);

        card1.deposit(100);
        card2.deposit(50);
        card3.withdrawal(100);

        card1.info();
        card2.info();
        card3.info();
    }
}
