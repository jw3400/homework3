import java.util.Scanner;
public class B02 {
	
	void input() {
		
		Scanner su = new Scanner(System.in);
		System.out.print("����Ʈ �о� ����(��������)�� �Է��ϼ���. : ");
		double m2_area = su.nextDouble();
			
		double pyung_area = cal(m2_area);
		System.out.print("����Ʈ�� ������ ");
		System.out.printf("%.2f", pyung_area); 		// ����Ʈ�� ����� �Ҽ��� ��°¥������ ǥ���ϵ��� ����
		System.out.print("�Դϴ�. \n");
		 
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
			System.out.print("���� ����Ʈ �Դϴ�.");
		}
		else if(pyung_area >= 15 && pyung_area < 30) {
			System.out.print("�߼��� ����Ʈ �Դϴ�.");
		}
		else if(pyung_area >= 30 && pyung_area < 50) {
			System.out.print("���� ����Ʈ �Դϴ�.");
		}
		else if(pyung_area >= 50) {
			System.out.print("���� ����Ʈ �Դϴ�.");
		}
		else
			System.out.print("����Ʈ�� ��� �Է��� �߸��ϼ̽��ϴ�. �ٽ� �Է����ֽʽÿ�.");
			
	} 
	
	public static void main(String[] args) {
			new B02().input();

	}
}