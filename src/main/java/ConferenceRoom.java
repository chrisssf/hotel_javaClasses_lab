import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.name = name;
    }

    public void addGuest(Guest guest) {
        if ( this.getTotalGuestsInConferenceRoom() == 0) {
            this.guests.add(guest);
        }
    }

    public int getTotalGuestsInConferenceRoom() {
        return this.guests.size();
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
