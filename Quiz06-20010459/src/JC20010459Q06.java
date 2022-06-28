import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class Point {
	private int x,y;
	public Point (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	public int sum() {
		return x+y;
	}
}
public class JC20010459Q06 {
	public static void main(String[] args) {
		HashMap<Integer,Point> p=new HashMap<Integer,Point>();
		p.put(-20,new Point(-10,-10));
		p.put(20,new Point(10,10));
		p.put(40,new Point(20,20));
		p.put(60,new Point(30,30));

		Set<Integer> keys = p.keySet();
		Iterator<Integer> pt = keys.iterator();
		while(pt.hasNext()) {
			int value = pt.next();
			Point pp = p.get(value);
			System.out.println(pp.toString());
		}
	}
}
