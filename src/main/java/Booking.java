

public class Booking {

    Bedroom bedroom;
    int numNights;

    public Booking(Bedroom bedroom, int numNights){
        this.bedroom = bedroom;
        this.numNights = numNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumNights() {
        return numNights;
    }


}
