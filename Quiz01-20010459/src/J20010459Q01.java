import java.util.Scanner;

public class J20010459Q01 {
	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.println("20010459 �ſ���");
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scanner.nextInt();

		if(score >= 95) // score�� 90 �̻�
			grade = 'A';
		else if(score >= 75) // score�� 80 �̻� 90 �̸�
			grade = 'B';
		else if(score >= 60) // score�� 70 �̻� 80 �̸�
			grade = 'C';
		else if(score >= 40) // score�� 60 �̻� 70 �̸�
			grade = 'D';
		else // score�� 60 �̸�
			grade = 'F';
		System.out.println("������ "+ grade + "�Դϴ�.");
		
		scanner.close();
	}
}
