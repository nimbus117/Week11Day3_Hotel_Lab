import com.sun.jndi.ldap.Ber;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom;


    @Before
    public void before() {
        bedroom = new Bedroom(2, "single");
    }

    @Test
    public void hasBedroom(){
        Booking booking = new Booking(bedroom, 2);
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNumNights(){
        Booking booking = new Booking(bedroom, 2);
        assertEquals(2, booking.getNumNights());
    }

    @Test
    public void hasTotalBill(){
        Booking booking = new Booking(bedroom, 2);
        assertEquals(12, booking.totalBill());
    }



}
