package Num1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
class Location{
	private String name,w,k;
	Location(String name, String w, String k){
		this.name=name;
		this.w=w;
		this.k=k;
	}
	String name() {
		return name;
	}
	public String toString() {
		return name + " "+k+" "+w;
	}
	
}
public class JC20010459E1 {
	public static void main(String []args) {
		HashMap<String, Location> city =new HashMap<String,Location>();
		String [] comma = new String[4];
		Location [] loc = new Location[4];
		Scanner scanner = new Scanner(System.in);
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String citys =scanner.nextLine();
			comma = citys.split(",");
			loc[i] = new Location(comma[0],comma[1],comma[2]);
			city.put(comma[0],loc[i]);
			
		}
		System.out.println("---------------------------");
		Set<String>keys=city.keySet();
		Iterator<String> a = keys.iterator();
		while(a.hasNext()) {
			String name=a.next();
			Location b=city.get(name);
			System.out.println(b.toString());
		}
		System.out.println("---------------------------");
		while(true) {
			System.out.print("���� �̸� >>");
			String cityname= scanner.next();
			if(cityname.equals("�׸�")) {
				break;
			}
			Location l=city.get(cityname);
			if(l==null) {
				System.out.println(cityname + "�� �����ϴ�.");
			}
			else {
				System.out.println(l.toString());
			}
			
		}
		
		scanner.close();
	}
}
