import java.util.Scanner;
class Phone{
	String name,tel;
	public Phone(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}
	boolean Search(String name) {
		if(this.name.equals(name))
			return true;
		else
			return false;
	}
}

public class JC20010459PR0102 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ο���>>");
		int a = scanner.nextInt();
		Phone [] p = new Phone[a];

		for(int i=0; i<a; i++) {
			System.out.print("�̸��� ��ȭ��ȣ (�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			p[i]=new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		for(;;) {
			int s=0;
			System.out.print("�˻��� �̸�>>");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			for(int i=0; i<a; i++) {
				if(true==p[i].Search(name)) {
					System.out.println(name+"�� ��ȣ�� "+p[i].tel+"�Դϴ�.");
					break;
				}
				else if(false==p[i].Search(name)){
					s++;
					if(a==s) {
						System.out.println(name+" �� �����ϴ�.");

					}
				}
				
			}
		}
			
		scanner.close();
	}
}
