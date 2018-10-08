/*
Michael Trans
Date: 31-10-2017
Michael_trans@hotmail.com
 */
package mich282q.Lektion26_10_2017_Selvstaendigt_arbejde;

public class SubclassBMW extends AbstractSuperclassBil {

    private double width;
    private double height;

    public SubclassBMW() {
    }

    public SubclassBMW(
            double width, double height) {
        this.width = width;
        this.height = height;
    }

    public SubclassBMW(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);

    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /** Return area */
    public double getAreal() {
        return width * height;
    }

    /** Return perimeter */
    public double getOmkreds() {
        return 2 * (width + height);
    }
}
