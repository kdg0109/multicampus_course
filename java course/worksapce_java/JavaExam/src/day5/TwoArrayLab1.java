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
		 * R�� �䳢�̰� F�� �����
		 * ����� ���찡 �����ϴ� ��ġ���� �밢���� 
		 * �������θ� �̵� �����ϴ�. 
		 * ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 */
		
		int xPos = 0;	//���� ���� �� ��ǥ
		int yPos = 0;	//���� ���� �� ��ǥ
	
//		int f_x_move_pos = 0;
//		int f_y_move_pos = 0;
		
		// 1. ���� ��ġ ��ĵ
		search : for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (play[i][j] == 'F') {
					xPos = i;
					yPos = j;
//					f_x_move_pos = xPos;
//					f_y_move_pos = yPos;
					
					break search;
					// System.out.println("���� ���� ��ġ: (" + xPos +"," + yPos
					// +")");
				}
			}
		}

		// ���� ���� �˻�
		for (int i = 0; i < play[xPos].length; i++) {
			if (play[xPos][i] == 'R') {
				catchNum++;
				// System.out.println("�¿�: (" + xPos +"," + i +")");
			}
		}
		// ���� ���� �˻�
		for (int i = 0; i < play.length; i++) {
			if (play[i][yPos] == 'R') {
				catchNum++;
				// System.out.println("���Ʒ�: (" + i +"," + yPos +")");
			}
		}

		// ������ �밢�� �˻�
		for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (i + j == xPos + yPos && play[i][j] == 'R') {
					catchNum++;
					break;
					// System.out.println("������ �밢��: (" + i + "," + j + ")");
				}
			}
		}

		// ���� ��� ��� ��ǥ �ʱ�ȭ
		if (xPos < yPos) {
			yPos -= xPos;
			xPos = 0;
		} else {
			xPos -= yPos;
			yPos = 0;
		}

		// ���� �밢�� �˻�
		for (; xPos < play.length && yPos < play[0].length; xPos++, yPos++) {
			if (play[xPos][yPos] == 'R') {
				catchNum++;
				// System.out.println("���� �밢��: (" + xPos + "," + yPos + ")");
			}
		}
		
		
		
//		//���� �밢�� ����
//		for(; f_x_move_pos >= 0 && f_y_move_pos >= 0; f_x_move_pos--, f_y_move_pos--){
//			if(play[f_x_move_pos][f_y_move_pos] == 'R'){
//				catchNum++;
//				//System.out.println("���� �밢��: (" + f_x_move_pos +"," + f_y_move_pos +")");
//			}
//		}
//		
//		//�ʱ�ȭ
//		f_x_move_pos = xPos;
//		f_y_move_pos = yPos;
//		//���� �밢�� �Ʒ���
//		for(; f_x_move_pos < play.length && f_y_move_pos < play[0].length; f_x_move_pos++, f_y_move_pos++){
//			if(play[f_x_move_pos][f_y_move_pos] == 'R'){
//				catchNum++;
//				//System.out.println("���� �밢��: (" + f_x_move_pos +"," + f_y_move_pos +")");
//			}
//		}
//		
//		//�ʱ�ȭ
//		f_x_move_pos = xPos;
//		f_y_move_pos = yPos;
//		//������ �밢�� ����
//		for(; f_x_move_pos >= 0 && f_y_move_pos < play[0].length; f_x_move_pos--, f_y_move_pos++){
//			if(play[f_x_move_pos][f_y_move_pos] == 'R'){
//				catchNum++;
//				//System.out.println("������ �밢��: (" + f_x_move_pos +"," + f_y_move_pos +")");
//			}
//		}
//
//		//�ʱ�ȭ
//		f_x_move_pos = xPos;
//		f_y_move_pos = yPos;
//		// ������ �밢�� �Ʒ���
//		for (; f_x_move_pos < play.length && f_y_move_pos >= 0; f_x_move_pos++, f_y_move_pos--) {
//			if (play[f_x_move_pos][f_y_move_pos] == 'R') {
//				catchNum++;
//				//System.out.println("������ �밢��: (" + f_x_move_pos +"," + f_y_move_pos +")");
//			}
//		}
		
		
		//���� �밢�������� ��� ���� �� ������ �� ����
		//������ �밢�������� ��� ���� ���� ������ �� ����
		
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);		
	}
}


