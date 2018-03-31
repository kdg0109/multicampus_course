package day7;

class Book {
	String title;
	String author;
	int price;
	Book() {
		this("자바의 정석", "남궁성", 30000);
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	String getBookInfo(){
		return "책이름 :" + title + "\t 저자 :" + author + "\t 가격 :" + price;
	}
}
public class BookTest {
	public static void main(String[] args) {
		Book[] abc;
		Book book1 = new Book();
		Book book2 = new Book("컴퓨터개론", "홍길동", 30000);
		Book book3 = new Book("컴퓨터보안", "안랩", 20000);
		Book book4 = new Book("웹개발정석", "크롬", 15000);
		Book book5 = new Book("모바일개발", "잡스", 10000);
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
