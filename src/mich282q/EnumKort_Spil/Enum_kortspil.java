package mich282q.EnumKort_Spil;/*
Michael Trans
Date: 01-10-2017
Michael_trans@hotmail.com
 */

public class Enum_kortspil {
    public static void main(String[] args){

        //declare variables
        Rank highcard = Rank.ACE;
        Rank faceCard = Rank.KING;
        Rank card1    = Rank.FOUR;
        Rank card2    = Rank.NINE;

        // en hånd der giver blackjack
        System.out.println("a blackjack hand: " + highcard + " and " + faceCard + ".");

        //gør så computer kan læse værdierne vi har på begge kort.
        int card1Val = 2;
        int card2Val = 9;

        System.out.println("A two card hand; " + card1 + " and " + card2);
        System.out.println("hard value: " + card1Val + " and " + card2Val);
    }
}

