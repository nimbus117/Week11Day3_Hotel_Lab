import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void before() {


        ArrayList<Bedroom> bedRooms = new ArrayList<>();
        bedRooms.add(new Bedroom(2, "single"));
        bedRooms.add(new Bedroom(3, "family"));
        bedRooms.add(new Bedroom(1, "double"));

        ArrayList<Dining> diningRooms = new ArrayList<>();
        diningRooms.add(new Dining("Main", 20));

        ArrayList<Conference> conferenceRooms = new ArrayList<>();
        conferenceRooms.add(new Conference("Main", 20));

        hotel = new Hotel(bedRooms, diningRooms, conferenceRooms);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(3, hotel.getBedroomCount());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void hasDiningRooms() {
        assertEquals(1, hotel.getDiningRoomCount());
    }
}
