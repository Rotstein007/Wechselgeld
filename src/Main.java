import java.util.List;

public class Main {
    public static void main(String[] args) {
        double toPay = 40.05;
        double payed = 50.0;
        List<Double> change = oop.money.CashDesk.pay(toPay, payed);
        System.out.println("Rückgeld: " + change);
    }
}