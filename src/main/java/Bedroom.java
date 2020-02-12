import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;
    private Double nightlyCost;


    public Bedroom(int roomNumber, int capacity, String roomType, Double nightlyCost){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
        this.nightlyCost = nightlyCost;
    }

    public boolean checkRoomIsAvailable(){
        if ( this.getTotalGuestsInRoom() == 0){
            return true;
        }
        return false;
    }

    public void addGuest(Guest guest) {
            this.guests.add(guest);
    }

    public int getTotalGuestsInRoom() {
        return this.guests.size();
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public Double getNightlyCost(){
        return this.nightlyCost;
    }
}
