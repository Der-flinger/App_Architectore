package Seminar_3;

public class Opt_task2 {

}

// 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

class SpeedCalculation {
    /*
     * Я не понимаю зачем тут нужен класс SpeedCalculation поэтому для конкретно
     * этой задачи
     * переместил меттод calculateAllowedSpeed в класс Vehicle, дочерние классы
     * просто оверрайдят этот метод
     */
}

class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }

    public double calculateAllowedSpeed(Vehicle vehicle) {

        return 0.0;
    }
}

/**
 * Car
 */
class Car extends Vehicle {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
        // TODO Auto-generated constructor stub
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public double calculateAllowedSpeed(Vehicle car) {

        return car.getMaxSpeed() * 0.8;
    }

}

/**
 * Bus
 */
class Bus extends Vehicle {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
        // TODO Auto-generated constructor stub
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public double calculateAllowedSpeed(Vehicle bus) {

        return bus.getMaxSpeed() * 0.6;
    }
}
