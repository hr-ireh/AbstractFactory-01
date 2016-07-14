package ir.hri.view;

import ir.hri.bl.IDiesel;
import ir.hri.bl.IVehicleFactory;
import ir.hri.bl.impl.company.IranKhodro;
import ir.hri.bl.impl.company.Saipa;

public class App {
    public static void main(String[] args) {
        IVehicleFactory factoryIranKhodro = IranKhodro.getInstance();
        IDiesel diesel = factoryIranKhodro.GetDiesel();
        System.out.println(diesel.getName());
        System.out.println(factoryIranKhodro.getMotorCar().getName());

        IVehicleFactory factorySaipa = new Saipa();
        System.out.println(factorySaipa.GetDiesel().getName());
        System.out.println(factorySaipa.getMotorCar().getName());
    }
}
