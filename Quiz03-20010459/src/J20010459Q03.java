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
		int size = (x1-x2) * (y1-y2); // 면적 계산
		if (size <0)
			size = -size; // 면적이 음수인 경우 양수로 만들어 줌
		return size;
	}

	public void show() {
		System.out.println("(" + x1 + "," + y1 + ")");
		System.out.println("(" + x2 + "," + y2 + ")");

		System.out.println(square());
	}

	public boolean equals(Rectangle r) {
		int width1 = (r.x1>r.x2?(r.x1-r.x2):r.x2-r.x1); // x의 가로 길이
		int width2 = (x1>x2?(x1-x2):(x2-x1)); // this의 가로 길이
		int height1 = (r.y1>r.y2?(r.y1-r.y2):(r.y2-r.y1)); // x의 세로 길이
		int height2 = (y1>y2?(y1-y2):(y2-y1)); // this의 세로 길이

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
			System.out.println("두 사각형의 가로와 세로가 같습니다.");
		else System.out.println(" 두 사각형은 가로와 세로가 다릅니다.");
	}
}

