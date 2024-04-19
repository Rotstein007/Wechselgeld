package oop.money;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CashDesk {

    public static List<Double> pay(double toPay, double Payed) {

        if (Payed < toPay) {
            throw new IllegalArgumentException("Zu wenig bezahlt!");
        }

        if (toPay <= 0) {
            double change = toPay*-1;
            return Collections.singletonList(change);
        }

        int difference = (int) (Payed * 100 - toPay * 100);

        System.out.println("Du hast " + Payed + "€ bezahlt bei einem Artikel Preis von " + toPay + "€. Du bekommst also " + difference + "€ zurück.");

        List<Double> change;
        change = new ArrayList<>();
        double[] coins = new double[] {50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        for (double c : coins) {
            while (difference >= c*100) {
                difference -= (int) (c*100);
                change.add(c);
            }
        }

        int remaining = difference;

        return change;
    }

}
