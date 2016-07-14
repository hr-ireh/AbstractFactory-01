package ir.hri.bl.impl.company;

import ir.hri.bl.IDiesel;
import ir.hri.bl.IMotorCar;
import ir.hri.bl.IVehicleFactory;
import ir.hri.bl.impl.car.Arena;
import ir.hri.bl.impl.car.Peugeot206;

public class IranKhodro implements IVehicleFactory {
    static IranKhodro iranKhodro;

    private IranKhodro() {
    }

    public static IranKhodro getInstance() {
        if (iranKhodro == null) {
            iranKhodro = new IranKhodro();
            return iranKhodro;
        } else return iranKhodro;
    }

    public IDiesel GetDiesel() {
        return new Arena();
    }

    public IMotorCar getMotorCar() {
        return new Peugeot206();
    }
}
