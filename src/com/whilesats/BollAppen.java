package com.whilesats;

import java.util.Scanner;

public class BollAppen {
    public static void main(String[] args) {
        // Övning 5.3 boken samt 5.4
        var scan = new Scanner(System.in);
        final double percentageDropPerBounce = 0.7;

        while (true) {
            System.out.print("Ange höjd (meter) eller negativt tal för att avsluta: ");
            double height = scan.nextDouble(); // Centimeter
            double ballMaxBounceHeightInCM = 0.01;
            int amountOfBounces = 0;

            if (height < 0) {
                break;
            }

            while (height > ballMaxBounceHeightInCM) { // Kommer hoppa ur denna när 1 beräkning är klar till outer while loop
                height *= percentageDropPerBounce;
                amountOfBounces += 1;
            }
            System.out.println("Bollen studsar " + amountOfBounces + " gånger");
        }
    }
}
