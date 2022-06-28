import java.util.Scanner;
public class JC20010459PR0101 {
	public static void main(String[] args) {
	    int intArray[][] = new int[4][4];
	    int ql, pl;
	    for(int i = 0 ; i < 10; i++) {
		    while(true) {
		    	ql = (int)(Math.random()*4);
			    pl = (int)(Math.random()*4);
			    if (intArray[ql][pl] == 0) {
			    	break;
			    }
	    	}
		    intArray[ql][pl] = (int)(Math.random()*10 + 1);
	    }
	    for(int[] i : intArray) {
	    	for(int j : i) {
	    		System.out.print(j + " ");
	    	}
	    	System.out.println();
	    }
	}
}
