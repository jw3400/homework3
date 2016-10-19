import java.util.*;
public class B03 {
	
	void input() {
		
		Scanner su = new Scanner(System.in);
		int  [][] score = { {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, {31, 28, 31, 30, 31,  30, 31, 31, 30, 31, 30 ,31} };
		for(int i = 0; i < score.length; i++) {
				 /* System.out.print(" " + i + "행:" + " "); */
			for(int j = 0; j < score[i].length; j++) {
				/*System.out.print(score[i][j] + "  "); */
			}
			/* System.out.println(" "); */
		}
		
		System.out.print("월을 입력하세요. : ");
		int month = su.nextInt();
		
		System.out.print("일을 입력하세요. : ");
		int day =su.nextInt();

		day_count(score, month, day);
		su.close();
		
	}
	

	
	void day_count(int score [][], int month, int day) {
		
		int day_count=0;
		if(month >= 1 && month <= 12) {
			for(int i = 1; i <= month; i++) {
				day_count += score [1][i-1]; 		// 입력한 month까지의 총 일 수를 구하는 계산식[예를들면 3월이면 3월말까지의 일 수 계산]
			}
				
			 if(day >= 1 && day <= 31){
					if(month == 2){
							if(day >=29 && day <= 31){
								System.out.println("2월은 1~28일까지 입력하실 수 있습니다.(잘못 입력하셨습니다.)");
								System.exit(day_count);
						}
					}
					else if(month == 4 || month == 6 || month == 9 || month == 11 ) {
							if(day>=31) {
								System.out.println("입력하신 " + month  + "월은 30일까지 입력하실 수 있습니다.(잘못 입력하셨습니다.)");
								System.exit(day_count);
						}
					}
				 		day_count =  day_count - score [1][month-1] +  day;				
						System.out.println("구하고자 하는 총 일 수 : " + day_count);
					}
				else  
				{
					System.out.println("1~31일에 해당하지 않는 숫자를 입력하셨습니다.(잘못 입력하셨습니다.)");	
			 		System.exit(day_count);
				}							
		}
		else 
		{
			System.out.println("1~12월에 해당하지 않는 숫자를 입력하셨습니다.(잘못 입력하셨습니다.)");
			System.exit(day_count);
		}	
		System.out.println("이 날짜는 1년 중 " + day_count + " 번째 날에 해당됩니다.");
		}

	
	public static void main(String[] args) {
			new B03().input();

	}
}