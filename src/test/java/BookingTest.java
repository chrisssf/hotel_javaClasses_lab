import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 2, "Single", 60.00);
        guest = new Guest("Stephen");
        booking = new Booking(bedroom, guest, 4);
    }

    @Test
    public void canGetTotalBill(){
        assertEquals(240, booking.getTotalBill(), 0.01);
    }
}