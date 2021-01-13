package chapter08.exam04;

import chapter08.exam03.RemoteControl;

public class Audio implements RemoteControl {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
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
		System.out.println("ÇöÀç Audio º¼·ý : "+this.volume);
	}
}
