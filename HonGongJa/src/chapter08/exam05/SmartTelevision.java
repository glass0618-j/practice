package chapter08.exam05;

import chapter08.exam03.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = volume;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = volume;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : "+this.volume);
	}

}
