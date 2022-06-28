package Num1;
class PrintShop{
	private char n;
	private int k,q;
	PrintShop() {
		this.n='#';
	}
	PrintShop(char n){
		this.n=n;
	}
	PrintShop(char n, int k){
		this.n=n;
		this.k=k;	
	}
	void print() {
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(n);

			}
			System.out.println();
		}
	}
	void print(int q) {
		for(int p=1; p<=q; p++) {
			if(p%2!=0) {
				for(int i=1; i<=5; i++) {
					for(int j=0; j<i; j++) {
						System.out.print(n);
					}
					System.out.println();

				}
			}
			else if(p%2==0) {
				for(int i=0; i<5; i++) {
					for(int j=5; j>i; j--) {
						System.out.print(n);
					}
					System.out.println();

				}
			}
		}


	}
	void printReverse(int q) {
		for(int p=1; p<=q; p++) {
			if(p%2==0) {
				for(int i=1; i<=k; i++) {
					for(int j=0; j<i; j++) {
						System.out.print(n);
					}
					System.out.println();

				}
			}
			else if(p%2!=0) {
				for(int i=0; i<k; i++) {
					for(int j=k; j>i; j--) {
						System.out.print(n);
					}
					System.out.println();

				}
			}
		}
	}
	void printReverse() {

		for(int i=0; i<k; i++) {
			for(int j=k; j>i; j--) {
				System.out.print(n);
			}
			System.out.println();

		}
	}

}
public class JT20010459_E1 {
	public static void main (String[] args) {
		System.out.println("20010459/½Å¿¹¸°");
		PrintShop ps1 = new PrintShop();
		PrintShop ps2 = new PrintShop('@');
		PrintShop ps3 = new PrintShop('$',10);
		
		ps1.print();
		ps2.print(3);
		ps3.printReverse(2);

	}
}
