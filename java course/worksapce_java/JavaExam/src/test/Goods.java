package test;

public class Goods {
	String prodId; // ��ǰ ���̵� 
	String prodName; // ��ǰ �̸� 
	int price; // ��ǰ ���� 
	char asYn; // AS ���� ���� 

	// ������ �� ���� �����Ͻÿ�. 
	Goods(String prodId, String prodName, int price){
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	
	Goods(String prodId, String prodName, int price, char asYn){
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.asYn = asYn;
	}

	// getGoodsInfo() �޼��带 �����Ͻÿ�.
	public String getGoodsInfo() {
		String asCheck = "����";
		if(asYn == 'N') {
			asCheck = "�Ұ�";
		}
		return String.format("��ǰID : %s, ��ǰ�� : %s, ���� : %,d��, AS���ɿ��� : %s", prodId, prodName, price, asCheck);
	}
}
