import java.util.Scanner;
public class B04 {

	void input() {

		Scanner su = new Scanner(System.in);
		System.out.print("연봉을 원단위로 입력하세요. : ");

		int money = su.nextInt();

		double total = cal(money);
		System.out.println("연봉 금액에 대한 소득세는 " + total + "원 입니다.");
		su.close();
	}

	double cal(int money) {

		double total = 0;
		if(money > 0 && money < 10000000) {

		total = money * 0.095;
		
		}
		else if(money >= 10000000 && money < 40000000) {

		total = money * 0.19;

		}
		
		else if(money >= 40000000 && money < 80000000) {

		total = money * 0.28;

		}

		else if(money >= 80000000) {

		total = money * 0.37;

		}

		return  Integer.parseInt(String.valueOf(Math.round(total)));

	}

	public static void main(String[] args) {
		new B04().input();

	}
	
	
}