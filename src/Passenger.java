import java.util.Random;

public class Passenger extends Person{
    private int ticket_num,passport_num,flight_num;

   public Passenger()
    {
    }

    public Passenger(int id, String name, float age, String gender, String nationality, int ticket_num, int passport_num, int flight_num) {
        super(id, name, age, gender, nationality);
        this.ticket_num = ticket_num;
        this.passport_num = passport_num;
        this.flight_num = flight_num;
    }

    public int getTicket_num() {
        return ticket_num;
    }

    public void setTicket_num(int ticket_num) {
        this.ticket_num = ticket_num;
    }

    public int getPassport_num() {
        return passport_num;
    }

    public void setPassport_num(int passport_num) {
        this.passport_num = passport_num;
    }

    public int getFlight_num() {
        return flight_num;
    }

    public void setFlight_num(int flight_num) {
        this.flight_num = flight_num;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "ticket_num=" + ticket_num +
                ", passport_num=" + passport_num +
                ", flight_num=" + flight_num +
                '}';
    }

    public  void check_in(int ticket_n, int flight_n)
    {
       if(ticket_n==getTicket_num()&&flight_n==getFlight_num())
       {
           System.out.println("information of your flight corrected");
       }
       else
       {
           System.out.println("please, check insure your flight information");
       }
    }

}
