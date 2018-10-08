/*
Michael Trans
Date: 31-10-2017
Michael_trans@hotmail.com
 */
package mich282q.Lektion26_10_2017_Selvstaendigt_arbejde;

public class TestAudi {
    public static void main(String[] args) {
        SubclassAudi Audi = //Laver en ny bil
                new SubclassAudi(2);
        System.out.println("En bil er " + Audi.toString()); //Printer datoen hvornår den er lavet
        System.out.println("Farven er " + Audi.getColor()); // Printer farve
        System.out.println("Radius er " + Audi.getRadius()); //Printer radiussen
        System.out.println("Arealet er " + Audi.getAreal()); //Printer arealet
        System.out.println("Diameteren er " + Audi.getDiameter()); //Printer diameteren


        SubclassBMW BMW = new SubclassBMW(2,4);
        System.out.println("\nA Bil " + BMW.toString());
        System.out.println("Arealet er " + BMW.getAreal());
        System.out.println("Omkredsen er " + BMW.getOmkreds());
    }
}
