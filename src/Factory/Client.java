package Factory;

public class Client {
    private final Vehicle vehicle;

    public Client(VehicleType type) {
        this.vehicle = VehicleFactory.create(type);
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public static void main(String[] args) {
        Client client = new Client(VehicleType.VT_FourWheeler);
        Vehicle vehicle1 = client.getVehicle();
        vehicle1.printVehicle();
    }
}
