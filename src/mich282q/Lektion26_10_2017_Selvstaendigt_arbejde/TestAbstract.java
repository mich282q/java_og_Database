/*
Michael Trans
Date: 31-10-2017
Michael_trans@hotmail.com
 */
package mich282q.Lektion26_10_2017_Selvstaendigt_arbejde;

public class TestAbstract {
    public static void main(String[] args) {

        AbstractSuperclassBil bilObject1 = new AbstractAudi(5);
        AbstractSuperclassBil bilObject2 = new AbstractBMW(5, 3);

        System.out.println("Har de to biler det samme areal? " + equalArea(bilObject1, bilObject2));

        displayAbstractSuperclassBil(bilObject1);

        displayAbstractSuperclassBil(bilObject2);

    }
    public static boolean equalArea(AbstractSuperclassBil object1, AbstractSuperclassBil object2) {
        return object1.getAreal() == object2.getAreal();
    }
    public static void displayAbstractSuperclassBil(AbstractSuperclassBil object) {
        System.out.println();
        System.out.println("Arealet er " + object.getAreal());
        System.out.println("Omkredsen er " + object.getOmkreds());
    }

}
