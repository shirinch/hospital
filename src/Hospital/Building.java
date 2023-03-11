package Hospital;

public class Building {
private int floor;
private int area;
private String address;


    public Building(){}
    public Building(int floor, int area, String address) {
        this.floor = floor;
        this.area = area;
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
