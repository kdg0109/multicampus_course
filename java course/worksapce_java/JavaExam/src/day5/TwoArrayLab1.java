package day5;

public class TwoArrayLab1 {
	public static void main(String[] args) {
		char play[][] = { 
				{ 'X', 'X', 'X', 'R', 'X', 'R'},
				{ 'R', 'X', 'X', 'X', 'X', 'X'},
				{ 'X', 'X', 'R', 'X', 'X', 'X'},
				{ 'R', 'X', 'X', 'F', 'X', 'X'},
				{ 'X', 'R', 'X', 'X', 'X', 'X'},
				{ 'X', 'R', 'X', 'R', 'X', 'R'},
				};
		
		int catchNum = 0;
		/*
		 * R은 토끼이고 F는 여우다
		 * 여우는 여우가 존재하는 위치에서 대각선과 
		 * 직선으로만 이동 가능하다. 
		 * 위와 같은 2차원 배열 데이터에서
		 * 토끼를 몇마리 잡겠는가?
		 */
		
		int xPos = 0;	//최초 여우 행 좌표
		int yPos = 0;	//최초 여우 열 좌표
	
//		int f_x_move_pos = 0;
//		int f_y_move_pos = 0;
		
		// 1. 여우 위치 스캔
		search : for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (play[i][j] == 'F') {
					xPos = i;
					yPos = j;
//					f_x_move_pos = xPos;
//					f_y_move_pos = yPos;
					
					break search;
					// System.out.println("최초 여우 위치: (" + xPos +"," + yPos
					// +")");
				}
			}
		}

		// 가로 직선 검사
		for (int i = 0; i < play[xPos].length; i++) {
			if (play[xPos][i] == 'R') {
				catchNum++;
				// System.out.println("좌우: (" + xPos +"," + i +")");
			}
		}
		// 세로 직선 검사
		for (int i = 0; i < play.length; i++) {
			if (play[i][yPos] == 'R') {
				catchNum++;
				// System.out.println("위아래: (" + i +"," + yPos +")");
			}
		}

		// 오른쪽 대각선 검사
		for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (i + j == xPos + yPos && play[i][j] == 'R') {
					catchNum++;
					break;
					// System.out.println("오른쪽 대각선: (" + i + "," + j + ")");
				}
			}
		}

		// 왼쪽 상단 행렬 좌표 초기화
		if (xPos < yPos) {
			yPos -= xPos;
			xPos = 0;
		} else {
			xPos -= yPos;
			yPos = 0;
		}

		// 왼쪽 대각선 검사
		for (; xPos < play.length && yPos < play[0].length; xPos++, yPos++) {
			if (play[xPos][yPos] == 'R') {
				catchNum++;
				// System.out.println("왼쪽 대각선: (" + xPos + "," + yPos + ")");
			}
		}
		
		
		
//		//왼쪽 대각선 위로
//		for(; f_x_move_pos >= 0 && f_y_move_pos >= 0; f_x_move_pos--, f_y_move_pos--){
//			if(play[f_x_move_pos][f_y_move_pos] == 'R'){
//				catchNum++;
//				//System.out.println("왼쪽 대각선: (" + f_x_move_pos +"," + f_y_move_pos +")");
//			}
//		}
//		
//		//초기화
//		f_x_move_pos = xPos;
//		f_y_move_pos = yPos;
//		//왼쪽 대각선 아래로
//		for(; f_x_move_pos < play.length && f_y_move_pos < play[0].length; f_x_move_pos++, f_y_move_pos++){
//			if(play[f_x_move_pos][f_y_move_pos] == 'R'){
//				catchNum++;
//				//System.out.println("왼쪽 대각선: (" + f_x_move_pos +"," + f_y_move_pos +")");
//			}
//		}
//		
//		//초기화
//		f_x_move_pos = xPos;
//		f_y_move_pos = yPos;
//		//오른쪽 대각선 위로
//		for(; f_x_move_pos >= 0 && f_y_move_pos < play[0].length; f_x_move_pos--, f_y_move_pos++){
//			if(play[f_x_move_pos][f_y_move_pos] == 'R'){
//				catchNum++;
//				//System.out.println("오른쪽 대각선: (" + f_x_move_pos +"," + f_y_move_pos +")");
//			}
//		}
//
//		//초기화
//		f_x_move_pos = xPos;
//		f_y_move_pos = yPos;
//		// 오른쪽 대각선 아래로
//		for (; f_x_move_pos < play.length && f_y_move_pos >= 0; f_x_move_pos++, f_y_move_pos--) {
//			if (play[f_x_move_pos][f_y_move_pos] == 'R') {
//				catchNum++;
//				//System.out.println("오른쪽 대각선: (" + f_x_move_pos +"," + f_y_move_pos +")");
//			}
//		}
		
		
		//왼쪽 대각선에서는 행과 열을 한 값들이 다 동일
		//오른쪽 대각선에서는 행과 열을 더한 값들이 다 동일
		
		System.out.printf("여우는 토끼를 %d 마리 잡는다.", catchNum);		
	}
}


