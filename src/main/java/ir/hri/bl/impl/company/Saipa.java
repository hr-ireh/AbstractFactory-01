package ir.hri.bl.impl.company;

import ir.hri.bl.IDiesel;
import ir.hri.bl.IMotorCar;
import ir.hri.bl.IVehicleFactory;
import ir.hri.bl.impl.car.Foton;
import ir.hri.bl.impl.car.Peride;

public class Saipa implements IVehicleFactory {
    public IDiesel GetDiesel() {
        return new Foton();
    }

    public IMotorCar getMotorCar() {
        return new Peride();
    }
}
