public class Booking {

    private Bedroom bedroom;
    private Guest guest;
    private int numberOfNightsBooked;

    public Booking(Bedroom bedroom, Guest guest, int numberOfNightsBooked) {
        this.bedroom = bedroom;
        this.guest = guest;
        this.numberOfNightsBooked = numberOfNightsBooked;
    }


    public Double getTotalBill(){
        return this.bedroom.getNightlyCost() * this.numberOfNightsBooked;
    }
}



