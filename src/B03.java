import java.util.*;
public class B03 {
	
	void input() {
		
		Scanner su = new Scanner(System.in);
		int  [][] score = { {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, {31, 28, 31, 30, 31,  30, 31, 31, 30, 31, 30 ,31} };
		for(int i = 0; i < score.length; i++) {
				 /* System.out.print(" " + i + "��:" + " "); */
			for(int j = 0; j < score[i].length; j++) {
				/*System.out.print(score[i][j] + "  "); */
			}
			/* System.out.println(" "); */
		}
		
		System.out.print("���� �Է��ϼ���. : ");
		int month = su.nextInt();
		
		System.out.print("���� �Է��ϼ���. : ");
		int day =su.nextInt();

		day_count(score, month, day);
		su.close();
		
	}
	

	
	void day_count(int score [][], int month, int day) {
		
		int day_count=0;
		if(month >= 1 && month <= 12) {
			for(int i = 1; i <= month; i++) {
				day_count += score [1][i-1]; 		// �Է��� month������ �� �� ���� ���ϴ� ����[������� 3���̸� 3���������� �� �� ���]
			}
				
			 if(day >= 1 && day <= 31){
					if(month == 2){
							if(day >=29 && day <= 31){
								System.out.println("2���� 1~28�ϱ��� �Է��Ͻ� �� �ֽ��ϴ�.(�߸� �Է��ϼ̽��ϴ�.)");
								System.exit(day_count);
						}
					}
					else if(month == 4 || month == 6 || month == 9 || month == 11 ) {
							if(day>=31) {
								System.out.println("�Է��Ͻ� " + month  + "���� 30�ϱ��� �Է��Ͻ� �� �ֽ��ϴ�.(�߸� �Է��ϼ̽��ϴ�.)");
								System.exit(day_count);
						}
					}
				 		day_count =  day_count - score [1][month-1] +  day;				
						System.out.println("���ϰ��� �ϴ� �� �� �� : " + day_count);
					}
				else  
				{
					System.out.println("1~31�Ͽ� �ش����� �ʴ� ���ڸ� �Է��ϼ̽��ϴ�.(�߸� �Է��ϼ̽��ϴ�.)");	
			 		System.exit(day_count);
				}							
		}
		else 
		{
			System.out.println("1~12���� �ش����� �ʴ� ���ڸ� �Է��ϼ̽��ϴ�.(�߸� �Է��ϼ̽��ϴ�.)");
			System.exit(day_count);
		}	
		System.out.println("�� ��¥�� 1�� �� " + day_count + " ��° ���� �ش�˴ϴ�.");
		}

	
	public static void main(String[] args) {
			new B03().input();

	}
}