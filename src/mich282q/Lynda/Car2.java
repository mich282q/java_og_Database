package mich282q.Lynda;

import java.awt.*;

public class Car2 {

    //Data Tyopes:
    //int --> integer 1, 2, 3
    //double --> decimal 34.5 32.1
    //String --> "ala2" or "hello world"
    //Color --> from awt Library
    //boolean --> true or false

    double averageMilesPerGallon;
    String licensPlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car2(double intputAverageMPG,
               String inputLicensPlate,
               Color inputPaintColor,
               boolean inputAreTaillightsWorking) {
        this.averageMilesPerGallon = intputAverageMPG;
        this.licensPlate = inputLicensPlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTaillightsWorking;
    }


    public void changePaintColor (Color newPaintColor) {
        this.paintColor = newPaintColor;
    }
}
