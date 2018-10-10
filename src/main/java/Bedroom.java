import java.util.ArrayList;

public class Bedroom {
    int roomNumber;
    int capacity;
    ArrayList<Guest> guests;
    String roomType;
    int nightRate;

    public Bedroom (int roomNumber, String roomType ){

        this.roomNumber = roomNumber;
        if (roomType == "single"){
            capacity = 1;
            nightRate = 6;
        }
        else if (roomType ==  "double"){
            capacity = 2;
            nightRate = 8;
        }
        else {
            capacity = 4;
            nightRate = 10;
        }

        this.roomType = roomType;
        guests = new ArrayList<>();

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomGuestCount() {
        return guests.size();
    }

    public void addGuest(Guest guest){
        guests.add (guest);
    }

    public void removeGuests() {
        guests.clear();
    }

    public int getNightRate() {
        return nightRate;
    }
}
