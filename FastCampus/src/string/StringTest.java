package string;

public class StringTest {
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		String str3 = "abc3";
		String str4 = "abc4";
		System.out.println(str3 == str4);
	}
}