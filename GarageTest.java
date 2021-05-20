import java.util.ArrayList;
import java.util.List;

import ClassPractice.Car;
import ClassPractice.Garage;
import ClassPractice.MotorCycle;
import ClassPractice.Vehicle;
public class GarageTest{


    public static void main(String[] args) {
        Car car1 = new Car(10, 20, "Corolla");
        Car car2 = new Car(8, 50, "Versa");
        Car car3 = new Car(7, 30, "Mustang");
        MotorCycle moto1 = new MotorCycle(150, "Honda", 50);
        MotorCycle moto2 = new MotorCycle(100, "Harly", 10);
        
        List<Vehicle> starting_vehicles = new ArrayList<Vehicle>();
        starting_vehicles.add(car1);
        starting_vehicles.add(car2);
        Garage garage = new Garage(starting_vehicles);
        garage.addVehicle(car3);
        garage.removeVehicle(car1);
        garage.addVehicle(moto1);
        System.out.println(garage.TotalBill());
        System.out.println(garage.specificBill(moto2));
        garage.clearGarage();

    }



}