package mobile;

public class Otab extends Mobile{
	public Otab() {
		
	}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	@Override
	public void operate(int time) {
		//1분 사용시 12감소
		setBatterySize(getBatterySize() - time*12);
	}
	@Override
	public void charge(int time) {
		//1분 충전시 8증가
		setBatterySize(getBatterySize() + time*8);
	}	
}
