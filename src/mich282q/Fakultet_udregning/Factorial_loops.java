package mich282q.Fakultet_udregning;

public class Factorial_loops {
    public static void main(String[] args) {
        System.out.println("Resultatet med loop " + factorial(5));

    }
        public static int factorial (int n) {

        int resultat = n ;
        for (int i = n-1; i > 1; i--) {
       resultat = resultat *i;
        }return resultat;

}}
