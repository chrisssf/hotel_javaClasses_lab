import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;


    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
    }

}
