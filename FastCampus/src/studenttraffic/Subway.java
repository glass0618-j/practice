package studenttraffic;

public class Subway {
	int lineNum;
	int passenger;
	int money;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}

	public void take(int money) {
		this.money = money;
		passenger++;
	}
	public void showSubInfo() {
		System.out.println(lineNum+" ����ö�� �°��� "+passenger+"�� �̰�, ������ "+money+"�� �Դϴ�.");
	}
}
