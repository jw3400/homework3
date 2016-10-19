import java.util.Scanner;
public class B02 {
	
	void input() {
		
		Scanner su = new Scanner(System.in);
		System.out.print("아파트 분양 면적(제곱미터)을 입력하세요. : ");
		double m2_area = su.nextDouble();
			
		double pyung_area = cal(m2_area);
		System.out.print("아파트의 평형은 ");
		System.out.printf("%.2f", pyung_area); 		// 아파트의 평수를 소수점 둘째짜리까지 표시하도록 선언
		System.out.print("입니다. \n");
		 
		print(pyung_area);
		su.close();
		
	}
	
		double cal(double m2_area){
	
			double pyung_area = 0;
			pyung_area = m2_area / 3.305;
			return pyung_area;
	
		}
	
	
	void print(double pyung_area) {
		
		if(pyung_area > 0 && pyung_area < 15){
			System.out.print("소형 아파트 입니다.");
		}
		else if(pyung_area >= 15 && pyung_area < 30) {
			System.out.print("중소형 아파트 입니다.");
		}
		else if(pyung_area >= 30 && pyung_area < 50) {
			System.out.print("중형 아파트 입니다.");
		}
		else if(pyung_area >= 50) {
			System.out.print("대형 아파트 입니다.");
		}
		else
			System.out.print("아파트의 평수 입력을 잘못하셨습니다. 다시 입력해주십시오.");
			
	} 
	
	public static void main(String[] args) {
			new B02().input();

	}
}