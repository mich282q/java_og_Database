/*
Michael Trans
Date: 31-10-2017
Michael_trans@hotmail.com
 */
package mich282q.Lektion26_10_2017_Selvstaendigt_arbejde;

import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city: cities)
            System.out.print(city + " ");
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
        new BigInteger("432232323239292"),
                new BigInteger("54623239292")};
        java.util.Arrays.sort(hugeNumbers);
        for(BigInteger number: hugeNumbers)
            System.out.print(number + " ");
    }
}
