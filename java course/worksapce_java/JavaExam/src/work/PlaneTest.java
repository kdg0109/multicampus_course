package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] lists = new Plane[2];
		lists[0] = new Airplane("L747", 1000);
		lists[1] = new Cargoplane("C40", 1000);
		

		printTitle();
		for(Plane list : lists) {
			printInfo(list);
		}
		
		System.out.println("[100 운항]");
		printTitle();
		for(Plane list : lists) {
			list.flight(100);
			printInfo(list);
		}

		System.out.println("[200 주유]");
		printTitle();
		for(Plane list : lists) {
			list.refuel(200);
			printInfo(list);
		}
	}
	public static void printInfo(Plane list) {
		System.out.println(list.getPlaneName() +"\t\t\t" + list.getFuelSize());
		System.out.println();
	}
	public static void printTitle() {
		System.out.println("Plane\t\t\tfuelSize");
		System.out.println("---------------------------");
		
	}
}
