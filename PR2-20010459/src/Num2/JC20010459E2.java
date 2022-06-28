package Num2;
import java.util.Vector;
import java.util.Scanner;
abstract class Shape{
	private Shape next;
	public Shape() {
		next = null;
	}
	public void setNext(Shape obj) {
		next = obj;
	}
	public Shape getNext() {
		return next;
	}
	public abstract void draw();
}
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class JC20010459E2 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Shape> sp=new Vector<Shape>();
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");
		while(true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int type = scanner.nextInt();
			if(type ==1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int a = scanner.nextInt();
				Shape shape;
				if(a==1) {
					shape = new Line();
					sp.add(shape);
				}
				else if(a==2) {
					shape = new Rect();
					sp.add(shape);
				}
				else if(a==3) {
					shape = new Circle();
					sp.add(shape);
				}
				else {
					System.out.println("�ش��ϴ� ��ȣ�� �����ϴ�.");
				}
			}
			else if(type==2) {
				System.out.print("������ ������ ��ġ>>");
				int b = scanner.nextInt();
				if(b>sp.size()) {
					System.out.println("������ �� �����ϴ�.");
				}
				else if(b-1<0) {
					System.out.println("������ �� �����ϴ�.");

				}
				else {
					sp.remove(b-1);
				}
			}
			else if (type ==3) {
				for(int i=0; i<sp.size(); i++) {
					Shape shape = sp.get(i);
					shape.draw();
				}
			}
			else if(type ==4) {
				System.out.println("beauty�� �����մϴ�.");
				break;
			}
			else {
				System.out.println("�ش��ϴ� ��ȣ�� �����ϴ�.");
			}
		}
		scanner.close();
	}
}
