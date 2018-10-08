/*
Michael Trans
Date: 31-10-2017
Michael_trans@hotmail.com
 */
package mich282q.Lektion26_10_2017_Selvstaendigt_arbejde;

public class Casting {
    public static void main(String[] args) {

        Object object1 = new SubclassAudi(5);

        displayObject(object1);
    }

    public static void displayObject(Object object){
        if (object instanceof SubclassAudi) {
            System.out.println("Bilens areal er " + ((SubclassAudi)object).getAreal());
            System.out.println("Bilens diameter er " + ((SubclassAudi)object).getDiameter());

        }

    }

}
