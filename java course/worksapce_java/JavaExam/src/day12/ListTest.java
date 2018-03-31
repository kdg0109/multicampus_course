package day12;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		Convert convertList = new Convert();
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};
		ArrayList<Integer> arrayList = convertList.convertList(array);
		
		for(int result : arrayList)
			System.out.println(result);
	}
}
