package mich282q.kryptering;

import java.util.Scanner;

public class Kryptering {

    private String password = "";

    public void krypt(){

        Scanner input = new Scanner(System.in);
        //this.password = password;
        System.out.println("Indtast dit password:");
        password = input.next();
        System.out.println("Dit password er krypteret til: ");

        for (int i = 0; i <password.length(); i++) {

            char bogstav = password.charAt(i);

            if (bogstav == 'p'){
                bogstav = 'g';
            }
            else if (bogstav == 'a'){
                bogstav = 'u';
            }
            else if (bogstav == 'i'){
                bogstav = 'w';
            }
            else if (bogstav == 'z'){
                bogstav = 'm';
            }
            else if (bogstav == 'b'){
                bogstav = 'ø';
            }
            else if (bogstav == 'c'){
                bogstav = 'æ';
            }
            else if (bogstav == 'd'){
                bogstav = 'y';
            }
            else if (bogstav == 'e'){
                bogstav = 'x';
            }
            else if (bogstav == 'f'){
                bogstav = 'z';
            }
            else if (bogstav == 'g'){
                bogstav = 'v';
            }
            else if (bogstav == 'h'){
                bogstav = 't';
            }
            else if (bogstav == 'j'){
                bogstav = 's';
            }
            else if (bogstav == 'k'){
                bogstav = 'r';
            }
            else if (bogstav == 'l'){
                bogstav = 'q';
            }
            else if (bogstav == 'm'){
                bogstav = 'p';
            }
            else if (bogstav == 'n'){
                bogstav = 'o';
            }
            else if (bogstav == 'o'){
                bogstav = 'n';
            }
            else if (bogstav == 'q'){
                bogstav = 'l';
            }
            else if (bogstav == 'r'){
                bogstav = 'k';
            }
            else if (bogstav == 's'){
                bogstav = 'j';
            }
            else if (bogstav == 't'){
                bogstav = 'i';
            }
            else if (bogstav == 'u'){
                bogstav = 'h';
            }
            else if (bogstav == 'v'){
                bogstav = 'å';
            }
            else if (bogstav == 'w'){
                bogstav = 'f';
            }
            else if (bogstav == 'x'){
                bogstav = 'e';
            }
            else if (bogstav == 'y'){
                bogstav = 'd';
            }
            else if (bogstav == 'æ'){
                bogstav = 'c';
            }
            else if (bogstav == 'ø'){
                bogstav = 'b';
            }
            else if (bogstav == 'å'){
                bogstav = 'a';
            }
            System.out.print(bogstav);
        }
     // return password;
    }

    public String dekrypt() {
        //this.password = password;
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast dit krypterede password:");
        password = input.next();
        System.out.println("Dit password er dekrypteret til: ");

        for (int i = 0; i <password.length(); i++) {

            char bogstav = password.charAt(i);

            if (bogstav == 'g'){
                bogstav = 'p';
            }
            else if (bogstav == 'u'){
                bogstav = 'a';
            }
            else if (bogstav == 'w'){
                bogstav = 'i';
            }
            else if (bogstav == 'm'){
                bogstav = 'z';
            }
            else if (bogstav == 'ø'){
                bogstav = 'b';
            }
            else if (bogstav == 'æ'){
                bogstav = 'c';
            }
            else if (bogstav == 'y'){
                bogstav = 'd';
            }
            else if (bogstav == 'x'){
                bogstav = 'e';
            }
            else if (bogstav == 'z'){
                bogstav = 'f';
            }
            else if (bogstav == 'v'){
                bogstav = 'g';
            }
            else if (bogstav == 't'){
                bogstav = 'h';
            }
            else if (bogstav == 's'){
                bogstav = 'j';
            }
            else if (bogstav == 'r'){
                bogstav = 'k';
            }
            else if (bogstav == 'q'){
                bogstav = 'l';
            }
            else if (bogstav == 'p'){
                bogstav = 'm';
            }
            else if (bogstav == 'n'){
                bogstav = 'o';
            }
            else if (bogstav == 'o'){
                bogstav = 'n';
            }
            else if (bogstav == 'l'){
                bogstav = 'q';
            }
            else if (bogstav == 'k'){
                bogstav = 'r';
            }
            else if (bogstav == 'j'){
                bogstav = 's';
            }
            else if (bogstav == 'i'){
                bogstav = 't';
            }
            else if (bogstav == 'h'){
                bogstav = 'u';
            }
            else if (bogstav == 'å'){
                bogstav = 'v';
            }
            else if (bogstav == 'f'){
                bogstav = 'w';
            }
            else if (bogstav == 'e'){
                bogstav = 'x';
            }
            else if (bogstav == 'd'){
                bogstav = 'y';
            }
            else if (bogstav == 'c'){
                bogstav = 'æ';
            }
            else if (bogstav == 'b'){
                bogstav = 'ø';
            }
            else if (bogstav == 'a'){
                bogstav = 'å';
            }

            System.out.print(bogstav);
        }

        return password;
    }

}
