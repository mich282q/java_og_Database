/*
Michael Trans
Date: 31-10-2017
Michael_trans@hotmail.com
 */
package mich282q.Lektion26_10_2017_Selvstaendigt_arbejde;
//Med udgangspunkt i at superclassen er en "bil".

public class SuperclassBil {
    private String color = "sort"; //Sætter bilerne til standard at være sort
    private java.util.Date dateCreated;

    //Konstruerer en default bil
    public SuperclassBil() {
        dateCreated = new java.util.Date();
    }

    //Konstruerer en bil med en speciel farve
    public SuperclassBil(String color){
        dateCreated = new java.util.Date();
        this.color = color;
    }

    //Return color
    public String getColor(){
        return color;
    }

    //Lav en ny farve
    public void setColor(String color){
        this.color = color;
    }

    // Get dateCreated
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    //Return a string representation of this object
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color;
    }

}
