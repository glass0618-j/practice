package chapter11.sec01.exam08;

import chapter07.sec01.exam06.Car;

public class ClassExample {
	public static void main(String[] args) {
		
		Class clazz = Car.class;
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
