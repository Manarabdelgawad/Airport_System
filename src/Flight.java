
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTextArea;
public class Flight {
    private int Flight_id;
    private String Flight_name, Source, Destination;
    private static int Capacity=100;
    private List<Passenger> passengers;
    private int seat_num,lounge_id;

    public Flight() {
        passengers = new ArrayList<>();
    }

    public Flight(int flight_id, String flight_name, String source, String destination) {
        Flight_id = flight_id;
        Flight_name = flight_name;
        Source = source;
        Destination = destination;

        this.passengers = new ArrayList<>();
    }

    public int getFlight_id() {
        return Flight_id;
    }

    public void setFlight_id(int flight_id) {
        Flight_id = flight_id;
    }

    public String getFlight_name() {
        return Flight_name;
    }

    public void setFlight_name(String flight_name) {
        Flight_name = flight_name;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }
    public void view_passenger(Passenger passenger) {
        Capacity++;
        if (passengers.size() < Capacity) {
            passengers.add(passenger);
            System.out.println("Passenger " + passenger.getName() + " added to flight " );
            System.out.println("ID  of passenger is " +passenger.getId());
            System.out.println("Gender of passenger is " +passenger.getGender());
            System.out.println("Nationality of passenger is " +passenger.getNationality());
            System.out.println("passport num of passenger is " +passenger.getPassport_num());
            System.out.println("Source of your flight is  "+getSource());
            System.out.println("Destination of your flight is  "+getDestination());

        } else {
            System.out.println("Sorry, the flight " + Flight_name + " is already full.");
        }

    }
    public List<Passenger> getPassengers() {
        // return an unmodifiable view of the list
        return Collections.unmodifiableList(this.passengers);
    }
   public String checked_Status() {
        String remarksArray[] = { "Cancelled", "Delayed", "Departed", "Final Call", "Boarding" };
        Random r1 = new Random();
        int randomNumber = r1.nextInt(remarksArray.length);
        return remarksArray[randomNumber];
    }

    @Override
    public String toString() {
        return "Flight{" +
                "Flight_id=" + Flight_id +
                ", Flight_name='" + Flight_name + '\'' +
                ", Source='" + Source + '\'' +
                ", Destination='" + Destination + '\'' +
                ", Capacity=" + Capacity +
                ", passengers=" + passengers +
                ", seat_num=" + seat_num +
                ", lounge_id=" + lounge_id +
                '}';
    }
}

