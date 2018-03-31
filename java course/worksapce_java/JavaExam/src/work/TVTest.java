package work;

public class TVTest {

	public static void main(String[] args) {
		
		SaleTV saleTV = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rentalTV = new RentalTV(100000, "RENTALTV-10", 42, 1);
		saleTV.channelUp();
		saleTV.channelUp();
		rentalTV.channelDown();
		rentalTV.channelDown();
		rentalTV.channelDown();
		printAllTV(saleTV);
		printAllTV(rentalTV);
		printRentalTV(rentalTV);
	}
	static void printAllTV(TV tv) {			// TV tv = saleTV;			TV tv = rentalTV;
		if(tv instanceof SaleTV) {
			System.out.println(((SaleTV)tv).toString());
			((SaleTV)tv).play();
			((SaleTV)tv).sale();
		}else {
			System.out.println(((RentalTV)tv).toString());
			((RentalTV)tv).play();
		}
	}
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}
