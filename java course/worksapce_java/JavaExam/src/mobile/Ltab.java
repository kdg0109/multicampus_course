package mobile;

public class Ltab extends Mobile{
	public Ltab() {
		
	}
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	@Override
	public void operate(int time) {
		//1분 사용시 10감소
		setBatterySize(getBatterySize() - time*10);
	}
	@Override
	public void charge(int time) {
		//1분 충전시 10증가
		setBatterySize(getBatterySize() + time*10);
	}	
}
