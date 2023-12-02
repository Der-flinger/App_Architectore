package Seminar4.Hometask.BusStation.src;

import java.util.Date;

public class Ticket {

    private int price;
    private Date dateOfTrip;
    private Date dateOfValidating;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int roadNumber;

    public Ticket(int price, Date dateOfTrip, Date dateOfValidating, int startZone, int finishZone, boolean isLuggage,
            int place, int roadNumber) {
        this.price = price;
        this.dateOfTrip = dateOfTrip;
        this.dateOfValidating = dateOfValidating;
        this.startZone = startZone;
        this.finishZone = finishZone;
        this.isLuggage = isLuggage;
        this.place = place;
        this.roadNumber = roadNumber;
    }

    public int getPrice() {
        return price;
    }

    public Date getDateOfTrip() {
        return dateOfTrip;
    }

    public Date getDateOfValidating() {
        return dateOfValidating;
    }

    public int getStartZone() {
        return startZone;
    }

    public int getFinishZone() {
        return finishZone;
    }

    public boolean isLuggage() {
        return isLuggage;
    }

    public int getPlace() {
        return place;
    }

    public int getRoadNumber() {
        return roadNumber;
    }

}
