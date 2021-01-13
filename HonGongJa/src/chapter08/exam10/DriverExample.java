package chapter08.exam10;

import chapter08.exam08.Bus;
import chapter08.exam08.Taxi;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
