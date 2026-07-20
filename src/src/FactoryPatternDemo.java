import java.util.Scanner;

 class VehicleFactory {

    public Vehicle getVehicle(String type) {

        switch(type.toLowerCase()) {
            case "car":
                return new Car();

            case "bus":
                return new Bus();

            case "bike":
                return new Bike();

            default:
                return null;
        }
    }
}

class Bike implements Vehicle {
    public void show() {
        System.out.println("Bike object created");
    }
}

class Bus implements Vehicle {
    public void show() {
        System.out.println("Bus object created");
    }
}

class Car implements Vehicle {
    public void show() {
        System.out.println("Car object created");
    }
}

interface Vehicle {
    void show();
}

public class FactoryPatternDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (car/bus/bike): ");
        String choice = sc.nextLine();

        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle = factory.getVehicle(choice);

        if (vehicle != null) {
            vehicle.show();
        } else {
            System.out.println("Invalid Vehicle Type");
        }

        sc.close();
    }
}