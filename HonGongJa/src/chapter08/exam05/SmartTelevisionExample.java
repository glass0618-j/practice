package chapter08.exam05;

import chapter08.exam03.RemoteControl;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}

}
