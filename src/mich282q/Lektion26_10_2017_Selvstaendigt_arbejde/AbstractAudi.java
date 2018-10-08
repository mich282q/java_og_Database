/*
Michael Trans
Date: 31-10-2017
Michael_trans@hotmail.com
 */
package mich282q.Lektion26_10_2017_Selvstaendigt_arbejde;

public class AbstractAudi extends AbstractSuperclassBil {
    private double radius;

    public AbstractAudi() {
    }

    public AbstractAudi(double radius) {
        this.radius = radius;
    }

    public AbstractAudi(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    //Return areal
    public double getRadius() {
        return radius;
    }

    //Set ny radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Return areal
    public double getAreal() {
        return radius * radius * Math.PI;
    }

    //Return diameter
    public double getDiameter() {
        return 2 * radius;
    }

    //Return omkreds
    public double getOmkreds() {
        return 2 * radius * Math.PI;
    }

    //Udskriv bilens info
    public void printBil() {
        System.out.println("Bilen er lavet " + getDateCreated() + " og radius på bilen er " + radius);

    }
}
