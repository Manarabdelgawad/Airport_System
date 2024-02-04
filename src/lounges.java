public class lounges {
    private int lounge_code,passenger_id,flight_id;


    public lounges()
    {}

    public lounges(int lounge_code, int passenger_id, int flight_id) {
        this.lounge_code = lounge_code;
        this.passenger_id = passenger_id;
        this.flight_id = flight_id;

    }

    public int getLounge_code() {
        return lounge_code;
    }

    public void setLounge_code(int lounge_code) {
        this.lounge_code = lounge_code;
    }

    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    @Override
    public String toString() {
        return "lounges{" +
                "lounge_code=" + lounge_code +
                ", passenger_id=" + passenger_id +
                ", flight_id=" + flight_id +
                '}';
    }
}
