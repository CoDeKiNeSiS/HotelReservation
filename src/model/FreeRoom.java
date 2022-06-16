package model;

public class FreeRoom extends Room {

    private Double price;

    public FreeRoom(String roomNumber, Double roomPrice, RoomType roomType, boolean isFree, Double price) {
        super(roomNumber, roomPrice, roomType, isFree);
        price = 0.0;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Price: " + price;
    }
}
