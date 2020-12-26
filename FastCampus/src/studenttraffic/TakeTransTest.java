package studenttraffic;

public class TakeTransTest {
	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentE = new Student("Edward", 30000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		
		Taxi taxi1004 = new Taxi(1004);
		Taxi taxi6666 = new Taxi(6666);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentE.takeTaxi(taxi6666);
		
		studentJ.showInfo();
		studentJ.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubInfo();
		subwayBlue.showSubInfo();
		
		taxi1004.showTaxiInfo();
		taxi6666.showTaxiInfo();
	}
}
