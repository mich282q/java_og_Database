package mich282q.Lynda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        // 31, 45, 22, 98, 10


        //5 er størrelse på array det kan ikke udvides
        int[] numbers = new int[5];
        // du initialize her
        numbers[0] = 31;
        numbers[1]= 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        // her initialize du det hele i en linje
        int[] numbers2 = {31, 45, 22 , 98, 10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
        System.out.println("index 1: " + myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "Butterfinger";
        System.out.println("Index 2: " + myFavoriteCandyBars[2]);
        System.out.println("Length: " + myFavoriteCandyBars.length);

        System.out.println(Array.get(myFavoriteCandyBars,2));

    }
}

