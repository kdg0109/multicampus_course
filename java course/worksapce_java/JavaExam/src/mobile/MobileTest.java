package mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile[] mobile = new Mobile[2];
		mobile[0] = new Ltab("Ltab", 500, "ABC-01");
		mobile[1] = new Otab("Otab", 1000, "XYZ-20");
		printMobile(mobile);
		for(Mobile mb : mobile) 
			mb.charge(10);
		System.out.println("[ 10�� ���� ]");
		
		printMobile(mobile);
		for(Mobile mb : mobile) 
			mb.operate(5);
		System.out.println("[ 5�� ��ȭ ]");
		printMobile(mobile);
	}
	public static void printMobile(Mobile[] mobile) {
		printTitle();
		for(Mobile mb : mobile) {
			System.out.println(mb.getMobileName() +"\t\t\t" + mb.getBatterySize() + "\t\t\t" + mb.getOsType());
		}
		System.out.println();
	}
	public static void printTitle() {
		System.out.println("Mobile\t\tBattery\t\tOS");
		System.out.println("------------------------------------------");
		
	}
}
