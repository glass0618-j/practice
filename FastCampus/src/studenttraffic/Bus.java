package studenttraffic;

public class Bus {
	
	int busNum;
	int passenger;
	int money;

	public Bus(int busNum) {
		this.busNum = busNum;
	}
	public void take(int money) {
		this.money = money;
		passenger++;
	}
	public void showBusInfo() {
		System.out.println(busNum+"번 버스의 승객은 "+passenger+"명 이고, 수입은 "+money+"원 입니다.");
	}
}
