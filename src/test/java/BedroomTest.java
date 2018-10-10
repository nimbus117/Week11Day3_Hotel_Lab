import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom room1;

    @Before
    public void before() {
        room1 = new Bedroom(1, "double");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, room1.getRoomNumber());
    }

}
