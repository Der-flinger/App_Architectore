package Seminar_4.Hometask.BusStation.src;

import java.util.List;

public class BusRoute {

    public int id;
    public String remark;
    public int capacity;
    public List<BusStop> busStops;

    public BusRoute(int id, String remark, int capacity, List<BusStop> busStops) {
        this.id = id;
        this.remark = remark;
        this.capacity = capacity;
        this.busStops = busStops;
    }

    public int getId() {
        return id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<BusStop> getBusStops() {
        return busStops;
    }

    public void setBusStops(List<BusStop> busStops) {
        this.busStops = busStops;
    }
}
