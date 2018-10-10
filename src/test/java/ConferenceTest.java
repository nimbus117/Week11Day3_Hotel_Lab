import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private Conference room1;

    @Before
    public void before() {
        room1 = new Conference("Main", 20);
    }

    @Test
    public void hasRoomName(){
        assertEquals("Main", room1.getRoomName());
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(20, room1.getCapacity());
    }

    @Test
    public void hasNoGuests(){

        assertEquals(0, room1.getRoomGuestCount());
    }

}