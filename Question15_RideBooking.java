abstract class Ride {
    protected double distance;
    
    public Ride(double distance) {
        this.distance = distance;
    }
    
    public abstract double calculateFare();
}

class BikeRide extends Ride {
    public BikeRide(double distance) {
        super(distance);
    }
    
    @Override
    public double calculateFare() {
        return distance * 5; // $5 per km
    }
}

class AutoRide extends Ride {
    public AutoRide(double distance) {
        super(distance);
    }
    
    @Override
    public double calculateFare() {
        return distance * 8; // $8 per km
    }
}

class CarRide extends Ride {
    public CarRide(double distance) {
        super(distance);
    }
    
    @Override
    public double calculateFare() {
        return distance * 12; // $12 per km
    }
}

public class Question15_RideBooking {
    public static void main(String[] args) {
        Ride[] rides = new Ride[3];
        rides[0] = new BikeRide(10); // 10 km
        rides[1] = new AutoRide(15);  // 15 km
        rides[2] = new CarRide(8);    // 8 km
        
        System.out.println("=== Ride Booking System ===");
        for (Ride ride : rides) {
            String rideType = ride.getClass().getSimpleName().replace("Ride", "");
            System.out.println(rideType + " ride fare: $" + ride.calculateFare());
        }
    }
}
