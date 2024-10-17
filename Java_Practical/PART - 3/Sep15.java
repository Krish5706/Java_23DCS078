import java.time.LocalTime;

class Airplane {
    String flightNumber;
    String destination;
    LocalTime departureTime;
    LocalTime currentTime;
    boolean isDelayed;

    // Constructor to initialize flight details
    public Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.currentTime = LocalTime.now();
        this.isDelayed = false;
    }

    // Method to check the flight status
    public String checkFlightStatus() {
        currentTime = LocalTime.now();
        if (currentTime.isBefore(departureTime)) {
            return "Flight " + flightNumber + " to " + destination + " is on time. Departure at " + departureTime;
        } else if (currentTime.equals(departureTime) || currentTime.isAfter(departureTime)) {
            return "Flight " + flightNumber + " to " + destination + " has departed.";
        } else {
            return "Invalid flight status.";
        }
    }

    // Method to delay the flight by a specified number of minutes
    public void delayFlight(int minutes) {
        departureTime = departureTime.plusMinutes(minutes);
        isDelayed = true;
    }

    // Method to get the delay status
    public String getDelayStatus() {
        if (isDelayed) {
            return "Flight " + flightNumber + " to " + destination + " is delayed. New departure time is " + departureTime;
        } else {
            return "Flight " + flightNumber + " to " + destination + " is not delayed.";
        }
    }
}

public class Sep15 {
    public static void main(String[] args) {
        // Creating an instance of Airplane with sample data
        Airplane airplane = new Airplane("AB123", "New York", LocalTime.of(15, 30));

        // Checking flight status
        System.out.println(airplane.checkFlightStatus());

        // Delaying the flight by 30 minutes
        airplane.delayFlight(30);

        // Checking delay status
        System.out.println(airplane.getDelayStatus());

        // Checking flight status after delay
        System.out.println(airplane.checkFlightStatus());
    }
}
