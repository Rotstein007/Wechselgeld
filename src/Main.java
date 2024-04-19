import java.util.List;

public class Main {
    public static void main(String[] args) {
        double toPay = 54.56;
        double Payed = 98.88;
        List<Double> change = oop.money.CashDesk.pay(toPay, Payed);
        System.out.println("Rückgeld: " + change);
    }
}