public class Runway {
    private int Runway_num,Flight_num;
    boolean occupied_status;
    public Runway()
    {

    }

    public Runway(int runway_num, int flight_num) {
        Runway_num = runway_num;
        Flight_num = flight_num;
    }

    public int getRunway_num() {
        return Runway_num;
    }

    public void setRunway_num(int runway_num) {
        Runway_num = runway_num;
    }

    public int getFlight_num() {
        return Flight_num;
    }

    public void setFlight_num(int flight_num) {
        Flight_num = flight_num;
    }

    public boolean isOccupied_status() {
        return occupied_status;
    }

    public void setOccupied_status(boolean occupied_status) {
        this.occupied_status = occupied_status;
    }
    public void check_occupied()
    {
        if(occupied_status==true)
            System.out.println("flight is occupied");
        else {
            System.out.println("exits places in flight");
        }
    }


    public  String details() {
        return "Runway{" +
                "Runway_num=" + Runway_num +
                ", Flight_num=" + Flight_num +
                ", occupied_status=" + occupied_status +
                '}';
    }
}
