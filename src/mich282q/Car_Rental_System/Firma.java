package mich282q.Car_Rental_System;

public class Firma extends Brugere {

    private String companyName;
    private int rabat = 10;

    public Firma(String navn, String adresse, int postcode, String companyName, int rabat) {
        super(navn, adresse, postcode);
        this.companyName = companyName;
        this.rabat = rabat;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getRabat() {
        return rabat;
    }

    public void setRabat(int rabat) {
        this.rabat = rabat;
    }
}
