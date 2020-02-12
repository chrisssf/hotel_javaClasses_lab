import java.awt.print.Book;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int getBedrooms() {
        return this.bedrooms.size();
    }

    public int getConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public Booking bookRoom(Bedroom bedroom, Guest guest, int nightsBooked){
        if (bedroom.checkRoomIsAvailable()) {
            Booking booking = new Booking(bedroom, guest, nightsBooked);
            bedroom.addGuest(guest);
            return booking;
        }
        return null;
    }
}
