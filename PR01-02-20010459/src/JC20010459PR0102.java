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
		System.out.print("인원수>>");
		int a = scanner.nextInt();
		Phone [] p = new Phone[a];

		for(int i=0; i<a; i++) {
			System.out.print("이름과 전화번호 (이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			p[i]=new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		for(;;) {
			int s=0;
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			for(int i=0; i<a; i++) {
				if(true==p[i].Search(name)) {
					System.out.println(name+"의 번호는 "+p[i].tel+"입니다.");
					break;
				}
				else if(false==p[i].Search(name)){
					s++;
					if(a==s) {
						System.out.println(name+" 이 없습니다.");

					}
				}
				
			}
		}
			
		scanner.close();
	}
}
