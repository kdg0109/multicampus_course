package day7;

class Product {
	String name;
	int balance;
	int price;
	Product() {
		this("듀크인형", 5, 10000);
	}
	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	String getName() {
		return name;
	}
	int getBalance() {
		return balance;
	}
	int getPrice() {
		return price;
	}
}

public class ProductTest {
	public static void main(String[] args) {
		String[] 	name 	= 	{"죽도", "배트", "탁구공", "축구공"};
		int[] 		balance = 	{6, 8, 3, 8};
		int[] 		price 	= 	{50000, 90000, 1500, 80000};

		//배열 변수는 타입의 종류 상관없이 무조건 4바이트 잡힘(참조변수라서 논리적 주소값만 있으면 됌)
		Product[] p = new Product[5];		//참조형은 항상 4바이트
		for (int i = 0; i < p.length; i++){
			if(i == 0){
				p[i] = new Product();
			}else{
				p[i] = new Product(name[i-1], balance[i-1], price[i-1]);
			}
		}
		printProduct(p);
	}
	public static void printProduct(Product[] product){
		for(Product pro : product)
			System.out.printf("상품명 :\t%s,\t재고량:\t%d,\t가격 :\t%,d\n", 
					pro.getName(), pro.getBalance(), pro.getPrice());
	}
}
