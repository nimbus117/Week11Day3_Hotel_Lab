import java.util.ArrayList;

public class Dining {
    String roomName;
    int capacity;
    ArrayList<Guest> guests;

    public Dining (String roomName, int capacity ){

        this.roomName = roomName;
        this.capacity = capacity;
        guests = new ArrayList<>();

    }

    public String getRoomName() {
        return roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRoomGuestCount() {
        return guests.size();
    }
}
