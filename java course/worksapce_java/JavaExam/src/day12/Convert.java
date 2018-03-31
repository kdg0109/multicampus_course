package day12;

import java.util.ArrayList;
public class Convert {
	public Convert() {
		
	}
	public ArrayList<Integer> convertList(int array[]){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i = array.length-1; i >= 0; i--) {
			arrayList.add(array[i]);
		}
		return arrayList;
	}
}
