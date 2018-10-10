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
}
