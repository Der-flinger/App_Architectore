
package Seminar_3.CarProject.src;

import java.awt.Color;

import Seminar_3.CarProject.src.Enums.CarType;
import Seminar_3.CarProject.src.Enums.FuelType;
import Seminar_3.CarProject.src.Enums.GearBoxType;

class Car {

    private String make;
    private String model;
    private java.awt.Color bodyColor;
    private CarType bodyType;
    private int wheelsNumber;
    private FuelType fuel;
    private GearBoxType gearBox;
    private float engineCap; // Обьем двигла

    public Car(String make, String model, Color bodyColor, CarType bodyType, int wheelsNumber, FuelType fuel,
            GearBoxType gearBox, float engineCap) {
        this.make = make;
        this.model = model;
        this.bodyColor = bodyColor;
        this.bodyType = bodyType;
        this.wheelsNumber = wheelsNumber;
        this.fuel = fuel;
        this.gearBox = gearBox;
        this.engineCap = engineCap;
    }

    public void movement() {

    }

    public void maintenance() {

    }

    public boolean trnLights() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getBodyType() {
        return bodyType;
    }

    public void setBodyType(CarType bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return wheelsNumber;
    }

    public void setNumberWheels(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public FuelType getFuelType() {
        return fuel;
    }

    public void setFuelType(FuelType fuel) {
        this.fuel = fuel;
    }

    public GearBoxType getGearBoxType() {
        return gearBox;
    }

    public void setGearBoxType(GearBoxType gearBox) {
        this.gearBox = gearBox;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public float getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(int engineCap) {
        this.engineCap = engineCap;
    }

    public boolean trnWrps() {
        return true;
    }

}