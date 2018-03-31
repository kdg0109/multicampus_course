package day7;

class Product {
	String name;
	int balance;
	int price;
	Product() {
		this("��ũ����", 5, 10000);
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
		String[] 	name 	= 	{"�׵�", "��Ʈ", "Ź����", "�౸��"};
		int[] 		balance = 	{6, 8, 3, 8};
		int[] 		price 	= 	{50000, 90000, 1500, 80000};

		//�迭 ������ Ÿ���� ���� ������� ������ 4����Ʈ ����(���������� ���� �ּҰ��� ������ ��)
		Product[] p = new Product[5];		//�������� �׻� 4����Ʈ
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
			System.out.printf("��ǰ�� :\t%s,\t���:\t%d,\t���� :\t%,d\n", 
					pro.getName(), pro.getBalance(), pro.getPrice());
	}
}
