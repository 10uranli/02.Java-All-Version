package java16.unit_2;

public class Vehicle extends Insurance{

    public Vehicle(String name, String type) {
        super(name, type);
    }

    int getPremiumForVehicle(){
        return 25;
    }
}
