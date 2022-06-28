import java.util.Scanner;

class Rectangle {
	private int x1, x2, y1, y2;
	
	Rectangle() {
		x1 = x2 = y1 = y2 = 0;
	}

	Rectangle(int xx1, int yy1, int xx2, int yy2) {
		x1=xx1;
		y1=yy1;
		x2=xx2;
		y2=yy2;

	}

	public void set(int xx1, int yy1, int xx2, int yy2) {

		x1=xx1;
		y1=yy1;
		x2=xx2;
		y2=yy2;
	}

	public int square() {
		int size = (x1-x2) * (y1-y2); // ���� ���
		if (size <0)
			size = -size; // ������ ������ ��� ����� ����� ��
		return size;
	}

	public void show() {
		System.out.println("(" + x1 + "," + y1 + ")");
		System.out.println("(" + x2 + "," + y2 + ")");

		System.out.println(square());
	}

	public boolean equals(Rectangle r) {
		int width1 = (r.x1>r.x2?(r.x1-r.x2):r.x2-r.x1); // x�� ���� ����
		int width2 = (x1>x2?(x1-x2):(x2-x1)); // this�� ���� ����
		int height1 = (r.y1>r.y2?(r.y1-r.y2):(r.y2-r.y1)); // x�� ���� ����
		int height2 = (y1>y2?(y1-y2):(y2-y1)); // this�� ���� ����

		if(width1==width2 && height1==height2) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class J20010459Q03 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
    
		r.show();
		s.show();
		System.out.println(s.square());

		r.set(-2,2,-1,4); 
		r.show();

		System.out.println(r.square());

		if (r.equals(s))
			System.out.println("�� �簢���� ���ο� ���ΰ� �����ϴ�.");
		else System.out.println(" �� �簢���� ���ο� ���ΰ� �ٸ��ϴ�.");
	}
}

