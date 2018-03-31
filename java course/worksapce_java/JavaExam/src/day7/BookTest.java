package day7;

class Book {
	String title;
	String author;
	int price;
	Book() {
		this("�ڹ��� ����", "���ü�", 30000);
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	String getBookInfo(){
		return "å�̸� :" + title + "\t ���� :" + author + "\t ���� :" + price;
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book[] abc;
		Book book1 = new Book();
		Book book2 = new Book("��ǻ�Ͱ���", "ȫ�浿", 30000);
		Book book3 = new Book("��ǻ�ͺ���", "�ȷ�", 20000);
		Book book4 = new Book("����������", "ũ��", 15000);
		Book book5 = new Book("����ϰ���", "�⽺", 10000);
		printBook(book1);
		printBook(book2);
		printBook(book3);
		printBook(book4);
		printBook(book5);
	}
	
	public static void printBook(Book book){
		System.out.println(book.getBookInfo());
	}

}
