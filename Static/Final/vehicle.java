
public class vehicle {
    private static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0.0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee. Please enter a non-negative value.");
        }
    }

    public void displayRegistrationDetails() {
        if (this instanceof vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("The object is not an instance of the Vehicle class.");
        }
    }

    public String getOwnerName() { return ownerName; }
    public String getVehicleType() { return vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }

    public static void main(String[] args) {
        vehicle.updateRegistrationFee(150.0);
        vehicle vehicle1 = new vehicle("Honest raj", "Sedan", "ABC123");
        vehicle vehicle2 = new vehicle("Price danish", "SUV", "XYZ789");
        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();
    }
}
