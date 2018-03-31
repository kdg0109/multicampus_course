package collection;

import java.util.TreeSet;

class Product implements Comparable<Product> {
	private String productID;
	private String productName;
	private int productPrice;
	
	public Product(String productID, String productName, int productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String getProductID() {	return productID;	}
	public void setProductID(String productID) {		this.productID = productID;	}
	public String getProductName() {		return productName;	}
	public void setProductName(String productName) {		this.productName = productName;	}
	public int getProductPrice() {		return productPrice;	}
	public void setProductPrice(int productPrice) {		this.productPrice = productPrice;	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
			Product tmp = (Product)obj;
			return productID.equals(tmp.productID);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return productID.hashCode();
	}
	
	@Override
	public String toString() {
		return getProductID() + "\t\t\t"+ getProductName() + "\t\t\t" + getProductPrice();
	}

	@Override
	public int compareTo(Product p) {
		int result = -1;
		if(productName.equals(p.productName) && productID == p.productID){
			result = 0;
			return 0;
		}
		if(getProductPrice() < p.getProductPrice()) {
			result = 1;
		}else if(getProductPrice() == p.getProductPrice()) {
			result = 0;
			System.out.println("Product");
		}
		return result;
	}
}

public class ProductTest {
	public static void main(String[] args) {
		TreeSet<Product> set = new TreeSet<>();

		getSize(set, new Product("p100", "TV", 20000));
		getSize(set, new Product("p200", "Computer", 10000));
		getSize(set, new Product("p100", "MP3", 700));
		getSize(set, new Product("p300", "Audio", 1000));
//		Object obj = set.toArray();

		System.out.println("제품 ID\t\t\t제품명\t\t\t가격");
		System.out.println("-------------------------------------------------");
		for(Product pro : set) {
			System.out.println(pro.toString());
		}
	}

	private static void getSize(TreeSet<Product> set, Product pro) {
		if(set.add(pro)) {
			System.out.println("성공적으로 저장되었습니다.");
		}else {
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
	}
}
