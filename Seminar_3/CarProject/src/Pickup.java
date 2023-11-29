package Seminar_3.CarProject.src;

import java.awt.Color;

import Seminar_3.CarProject.src.Enums.CarType;
import Seminar_3.CarProject.src.Enums.FuelType;
import Seminar_3.CarProject.src.Enums.GearBoxType;
import Seminar_3.CarProject.src.Interfaces.ICarWip;
import Seminar_3.CarProject.src.Interfaces.IFuelStation;

public class Pickup extends Car implements ICarWip, IFuelStation {

    private float loadCapacity;

    public Pickup(String make, String model, Color bodyColor, int wheelsNumber, FuelType fuel,
            GearBoxType gearBox, float engineCap, float loadCapacity) {
        super(make, model, bodyColor, CarType.PICKUP, wheelsNumber, fuel, gearBox, engineCap);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void refillingTheCar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refillingTheCar'");
    }

    @Override
    public void wipWindshield() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipWindshield'");
    }

    @Override
    public void wipHeadlights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipHeadlights'");
    }

    @Override
    public void wipMirrors() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipMirrors'");
    }

}
