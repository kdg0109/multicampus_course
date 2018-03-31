package test;
import java.util.HashSet;

class WordCount {
	int countString(String text, boolean word) {
		int count = 0;
		// 기능 구현
		String[] textArray = text.split(" ");
		if(word) {
			HashSet<String> hashSet = new HashSet<>();
			for(String str : textArray) {
				hashSet.add(str);
			}
			count = hashSet.size();
		}else {
			count = textArray.length;
		}
		return count;
	}
}
