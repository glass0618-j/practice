package studenttraffic;

public class Taxi {
	int taxiNum;
	int money;
	
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}

	public void take(int money) {
		this.money = money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNum+"�� �ý��� ������ "+money+"�� �Դϴ�.");
	}
}
