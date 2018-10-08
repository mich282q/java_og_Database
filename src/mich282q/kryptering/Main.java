package mich282q.kryptering;

import java.util.Scanner;

public class Main {

    //static String password = "skole";
    public static void main(String[] args) {

       Kryptering krypt1 = new Kryptering();

       krypt1.krypt();

       System.out.println();
        System.out.println();

       krypt1.dekrypt();

    }
}
