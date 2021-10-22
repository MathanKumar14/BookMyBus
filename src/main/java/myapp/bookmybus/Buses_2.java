package myapp.bookmybus;

public class Buses_2 {
    String bus,bus_type,departure,arrival,duration,fare,seat;

    public Buses_2(String bus, String bus_type, String departure, String arrival, String duration, String fare, String seat) {
        this.bus = bus;
        this.bus_type = bus_type;
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
        this.fare = fare;
        this.seat = seat;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public void setBus_type(String bus_type) {
        this.bus_type = bus_type;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getBus() {
        return bus;
    }

    public String getBus_type() {
        return bus_type;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDuration() {
        return duration;
    }

    public String getFare() {
        return fare;
    }

    public String getSeat() {
        return seat;
    }
}
