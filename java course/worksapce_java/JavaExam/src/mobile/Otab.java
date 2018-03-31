package mobile;

public class Otab extends Mobile{
	public Otab() {
		
	}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	@Override
	public void operate(int time) {
		//1�� ���� 12����
		setBatterySize(getBatterySize() - time*12);
	}
	@Override
	public void charge(int time) {
		//1�� ������ 8����
		setBatterySize(getBatterySize() + time*8);
	}	
}
