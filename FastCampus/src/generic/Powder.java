package generic;

public class Powder extends Meterial {
	
	public String toSting() {
		return "재료는 Powder 입니다.";
	}
	@Override
	public void doPrinting() {
		System.out.println("Powder로 프린팅합니다.");
	}
}
