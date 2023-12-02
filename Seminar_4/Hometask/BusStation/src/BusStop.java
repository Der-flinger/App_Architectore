package Seminar4.Hometask.BusStation.src;

import java.util.List;

public class BusStop {
    public int id;
    public String name;
    public double attitude;
    public double lattitude;

    public BusStop(int id, String name, double attitude, double lattitude) {
        this.id = id;
        this.name = name;
        this.attitude = attitude;
        this.lattitude = lattitude;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAttitude() {
        return attitude;
    }

    public double getLattitude() {
        return lattitude;
    }

    public double[] getCoordinates() {
        return new double[] { getAttitude(), getLattitude() };
    }

}
