package mich282q.Lynda;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Car myCar = new Car(25.5,"1BC32E",Color.blue,true );
        Car sallyCar = new Car(13.9,"3D20BN",Color.black,false);

        System.out.println("My mich282q.Lynda.Car's License Plate:" + myCar.licensPlate);
        System.out.println("Sally's License Plate:" + sallyCar.licensPlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());
    }


}
