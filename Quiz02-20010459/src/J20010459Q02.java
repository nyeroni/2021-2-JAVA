
public class J20010459Q02 {
	public static void main (String[] args) {
		System.out.println("20010459 �ſ���");
		int intArray[][] = new int[4][]; // �� ���� ���۷��� �迭 ����
		for(int i=0; i<4; i++)
		{
			intArray[i]=new int[5-i];
		}
		

		for (int i=0; i<intArray.length; i++) // �࿡ ���� �ݺ�
			for (int j=0; j<intArray[i].length; j++) // ���� ���� �ݺ�
				intArray[i][j] = (int)(Math.random()*100+1);

		for (int i=0; i<intArray.length; i++) {
			int total=0;
			for (int j=0; j<intArray[i].length; j++)
			{
				total+=intArray[i][j];
				System.out.print(intArray[i][j]+" ");

			}
			System.out.print("=> Sum of this row = "+ total);
			System.out.println(); // ���� �ٷ� �Ѿ��
			
		}
	}
}
