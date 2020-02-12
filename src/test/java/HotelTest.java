import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 2, "Double");
        bedroom2 = new Bedroom(2, 2, "Single");
        conferenceRoom1 = new ConferenceRoom(10, "Eagle");
        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom1);
        guest1 = new Guest("Stephen");
        guest2 = new Guest("Alex");
        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void checkHotelHasBedrooms(){
        assertEquals(2, hotel.getBedrooms());
    }

    @Test
    public void checkHotelHasConferenceRooms(){
        assertEquals(1, hotel.getConferenceRooms());
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getTotalGuestsInRoom());
    }

    @Test
    public void canCheckGuestOutOfBedroom(){
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.getTotalGuestsInRoom());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.getTotalGuestsInConferenceRoom());
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom(){
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.removeGuest(guest1);
        assertEquals(0, conferenceRoom1.getTotalGuestsInConferenceRoom());
    }


}
