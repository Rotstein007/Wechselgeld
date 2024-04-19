package oop.money;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CashDesk {

    static double toPay = 34;

    static double Payed = 50;

    public static List<Double> pay() {

        if (Payed < toPay) {
            throw new IllegalArgumentException("Zu wenig bezahlt!");
        }

        double temp = 0;

        temp = toPay - Payed;

        System.out.println("Du hast " + Payed + "€ bezahlt bei einem Artikel Preis von " + toPay + "€. Du bekommst also " + temp + "€ zurück.");

        List<Double> change = new ArrayList<>();

        return change;
    }

}
