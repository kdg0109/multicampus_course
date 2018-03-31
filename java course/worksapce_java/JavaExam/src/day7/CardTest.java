package day7;

public class CardTest{
	public static void main(String args[]) throws Exception{	
		System.out.println("CardTest 수행이 시작었습니다.");
		Card c1 = new Card();		
		c1.kind = "Heart";
		c1.number = 7;		
		Card c2 = new Card();		
		c2.kind = "Spade";
		c2.number = 4;		
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")");	
		Card.width = 50;
		Card.height = 80;
		System.out.println("c1은 " + c1.kind + ", " + c1.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number 
				+ "이며, 크기는 (" + Card.width + ", " + Card.height + ")" );
	}
}




