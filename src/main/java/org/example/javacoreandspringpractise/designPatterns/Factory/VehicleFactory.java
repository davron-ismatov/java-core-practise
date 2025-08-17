package org.example.javacoreandspringpractise.designPatterns.Factory;

public class VehicleFactory {
    private static VehicleFactory vehicle;

    private VehicleFactory(){}

    public static VehicleFactory getInstance(){
        if(vehicle == null){
            vehicle = new VehicleFactory();
        }
        return vehicle;
    }

    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        } else if(vehicleType.equalsIgnoreCase("TRUCK")){
            return new Truck();
        }
        return null;
    }

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = getInstance();
        Vehicle car = vehicleFactory.getVehicle("CAR");
        car.drive();
        Vehicle truck = vehicleFactory.getVehicle("TRUCK");
        truck.drive();
    }
}
