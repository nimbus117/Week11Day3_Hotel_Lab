import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedRooms;
    private ArrayList<Dining> diningRooms;
    private ArrayList<Conference> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedRooms, ArrayList<Dining> diningRooms, ArrayList<Conference> conferenceRooms) {
        this.bedRooms = bedRooms;
        this.diningRooms = diningRooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int getBedroomCount() {
        return bedRooms.size();
    }

    public int getConferenceRoomCount() {
        return diningRooms.size();
    }

    public int getDiningRoomCount() {
        return conferenceRooms.size();
    }


    public Bedroom getBedroom(String type) {
        for(Bedroom bedroom: bedRooms){
            if (bedroom.getRoomType() == type){
                return bedroom;
            }
        }
        return null;
    }

    public void checkInGuest(Guest guest, Bedroom room) {
        room.addGuest(guest);
    }

    public void checkOutGuests(Bedroom room) {
        room.removeGuests();
    }
}
