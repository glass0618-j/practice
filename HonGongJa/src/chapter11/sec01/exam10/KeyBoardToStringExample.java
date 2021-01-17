package chapter11.sec01.exam10;

import java.io.IOException;

public class KeyBoardToStringExample {
	public static void main(String[] args) throws IOException {
		
		byte[] bytes = new byte[100];
		
		System.out.print("ют╥б: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.print(str);
	}
}
