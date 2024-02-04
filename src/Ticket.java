import java.util.Random;

public class Ticket {
    private int ticket_num,flight_num;
    private int passenger_id;
   private String source,destination;
   private double price;
    private int date,seat_num,lounge_id;

   public Ticket()
   {
   }

    public Ticket(int ticket_id, int flight_id, int passenger_id, String source, String destination, double price) {
        this.ticket_num = ticket_id;
        this.flight_num = flight_id;
        this.passenger_id = passenger_id;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public int getTicket_id() {
        return ticket_num;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_num = ticket_id;
    }

    public int getFlight_id() {
        return flight_num;
    }

    public void setFlight_id(int flight_id) {
        this.flight_num= flight_id;
    }

    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }


    public void book_ticket()
    {

        Random r1=new Random();
        ticket_num= r1.nextInt(1,1000);
        flight_num= r1.nextInt(1,1000);
        date=r1.nextInt(1,24);
        seat_num=r1.nextInt(1,100);
        lounge_id= r1.nextInt(1,50);
    }

    public void view_ticket()
    {
        System.out.println("Your booked information :");
        System.out.println("Ticket num is   "+ticket_num);
        System.out.println("Flight num is   "+flight_num);
        System.out.println("Date your flight is   "+date);
        System.out.println("Your seat num is   "+seat_num);
        System.out.println("Lounge  num is   "+lounge_id);
    }


    public String Details_ticket() {
        return "Ticket{" +
                "ticket_id=" + ticket_num +
                ", flight_id=" + flight_num+
                ", date=" + date +
                '}';
    }
}
