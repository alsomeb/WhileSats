package com.whilesats;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var input = new Scanner(System.in);

        System.out.print("Skriv in ett tal: ");
        int n = input.nextInt();
        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }

        // Savings Calc
        System.out.print("Hur mycket tjänar du per månad?: ");
        int monthlySalary = input.nextInt();

        System.out.print("Hur mycket vill du spara?: ");
        int desiredSavingAmount = input.nextInt();
        int count = 0;
        int currentlySaved = 0;

        while (true) { // med en infinity loop som vi bryter med en ifsats
            currentlySaved += monthlySalary; // plussar med sig själv varje varv
            count++; // koll på månad/varv
            if (currentlySaved >= desiredSavingAmount) {
                System.out.println("Det kommer ta " + count + " månader att spara ihop " + desiredSavingAmount);
                break;
            }
        }
    }
}
