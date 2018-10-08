package mich282q.Fakultet_udregning;

public class Factorial_plus {

    public static void main(String[] args) {

        System.out.println("hello world");
        System.out.println("Resultatet er " + factorial(5));
    }

    /*
    Skriv en rekursiv metode (factorial(5)), som beregner factorial af n=5. Brug følgende pseudokode:
1! = 1
N! = N * (N-1)! for N > 1


     */

    public static int factorial (int n) {

        if (n>=0){
            if (n==1)
            {return 1;}
            else {
                return n * factorial(n-1);}

        }else return(0);
    }
}
