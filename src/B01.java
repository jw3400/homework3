import java.util.*;
public class B01 {
	
	void input() {
		
		Scanner su = new Scanner(System.in);
		int [] num = new int[3];
			for(int i=0; i<num.length; i++)
				{
					System.out.println( i+1 + "번째 숫자를 입력하세요. :  ");
					num[i] = su.nextInt();
				}
			
		 print(num); 
		 su.close();
	}
	
	
	void print(int num[]) {
	
		int max_num, min_num, tmp;
		for(int i=0; i<num.length; i++)
		{
			for(int j=0; j<num.length-1; j++)
			{
				if(num[j] > num[j+1]) {
						tmp = num[j];
						num[j] = num[j+1];
						num[j+1] = tmp;
				}
			}
				
		}
		max_num = num[num.length-1];
		min_num = num[0];
		System.out.println("가장 큰 수는 " + max_num + " 이고, 가장 작은 수는 " + min_num + " 입니다!");
			
	} 
	
	public static void main(String[] args) {
			new B01().input();

	}
}