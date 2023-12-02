package Seminar4.Hometask.BusStation.src;

public class TransportZone {

    private int id;
    private String remark;

    public TransportZone(int id, String remark) {
        this.id = id;
        this.remark = remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public String getRemark() {
        return remark;
    }
}
