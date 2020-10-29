import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		batter[] bplayers = new batter[n];

		String style = "";

		for (int i = 0; i < n; i++) {

			int index = i + 1;
			batter tem = null;
			
			System.out.printf("이름 입력 :");
			String name = sc.next();
			
			System.out.printf("타율 입력 : ");
			double average = sc.nextDouble();
			
			System.out.printf("장타력 입력 : ");
			int power = sc.nextInt();
			if(power > 80) {
				tem = new homer();
			}
			else {
				tem = new contact();
			}
			
			tem.name = name;
			tem.average = average;
			tem.power = power;
			tem.index = index;
			
			
			bplayers[i] = tem;
			

		}
		for (int i = 0; i < n; i++) {
			bplayers[i].출력();

		}
		sc.close();
	}
}
