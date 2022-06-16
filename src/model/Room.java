package model;

public class Room implements IRoom {

    private String roomNumber;
    private Double roomPrice;
    private RoomType roomType;
    private boolean isFree;

    public Room(String roomNumber, Double roomPrice, RoomType roomType, boolean isFree) {
        super();
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.roomType = roomType;
        this.isFree = isFree;
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return roomPrice;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    public String toString() {
        return roomNumber + " " + roomPrice + " " + roomType + " " + isFree;
    }


}
