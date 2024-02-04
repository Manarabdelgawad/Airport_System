import java.util.ArrayList;
import java.util.List;
public class AirManagement {
     private  static String AirportName,location;
     public AirManagement()
     {}
     public AirManagement(String name, String location) {
        this.AirportName= name;
        this.location = location;

     }
     public String getAirportName() {
        return AirportName;
    }

     public void setAirportName(String airportName) {
        AirportName = airportName;
    }


     public String getName() {
            return AirportName;
     }

     public String getLocation() {
            return location;
     }

        @Override
        public String toString() {
            return "Airport{" +
                    "name='" + AirportName + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }
}

