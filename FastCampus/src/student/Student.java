package student;

public class Student {
	public static int serialNum = 1000;
	private int studentID;
	private String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
	}
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		serialNum++;
	}
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	public String getStudentName() {
		return studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
