package mich282q.OOD_oevelser;
/*
 * The Circle class models a circle with a radius and color.
 */

public class Circle {

    // Save as "Circle.java"
    // private instance variable, not accessible from outside this class

    private double radius;
    private String color;


    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // 2nd constructor with given radius, but color default
    public Circle(double r) {
        this.radius = radius;
        this.color = "red";

    }

    // 3rd constructor to construct a new instance of Circle with the given radius and color
    public Circle (double r, String c) {
        this.radius = radius;
        this.color  = color;

    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    // Setter for instance variable color
    public void setColor(String newColor) {
    }
        // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    // Return a description of this instance in the form of
// Circle[radius=r,color=c]
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    }

