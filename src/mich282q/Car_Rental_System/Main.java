package mich282q.Car_Rental_System;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String brugerinput;

        System.out.println("Hello World!");

        Bilmaerker a, b, c, d;
        a = Bilmaerker.TESLA;
        b = Bilmaerker.AUDI;
        c = Bilmaerker.BMW;
        d = Bilmaerker.FIAT;

        Kunde kunde1 = new Kunde("Thomas", "Strandgade 5",4700);
        Kunde kunde2 = new Kunde("Thomas", "Strandgade 5",4700);
        Firma firma1 = new Firma("Elon Musk", "Løvegade 5",4700, "TESLA", 10);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast firmanavn: ");
        brugerinput = scanner.nextLine();

        if (firma1.getCompanyName() == "TESLA") {
            System.out.println("Hvad type bil vil du have ?");
            brugerinput = scanner.nextLine();
            System.out.println("Du har valgt " + brugerinput);
        }
    }
}
