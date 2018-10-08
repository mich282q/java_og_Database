/*
Michael Trans
Date: 31-10-2017
Michael_trans@hotmail.com
 */
package mich282q.Lektion26_10_2017_Selvstaendigt_arbejde;

public class Polymorphism {
    public static void main(String[] args) {

        /*Vi tager brug i contructoren fra SubclassAudi, og vi tager information, som vi kan printe ud og giver dem nye
        værdier */
        displayObject(new SubclassAudi(5,"rød"));

    }
    //Printer ud vha. getter fra setter.
    public static void displayObject(SubclassAudi object){
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor() + ". Radius er "
                + object.getRadius());
    }
}
