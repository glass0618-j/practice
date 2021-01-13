package chapter08.exam10;

import chapter08.exam08.Vehicle;
import chapter08.exam09.Bus;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
