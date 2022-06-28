
public class J20010459Q02 {
	public static void main (String[] args) {
		System.out.println("20010459 신예린");
		int intArray[][] = new int[4][]; // 각 행의 레퍼런스 배열 생성
		for(int i=0; i<4; i++)
		{
			intArray[i]=new int[5-i];
		}
		

		for (int i=0; i<intArray.length; i++) // 행에 대한 반복
			for (int j=0; j<intArray[i].length; j++) // 열에 대한 반복
				intArray[i][j] = (int)(Math.random()*100+1);

		for (int i=0; i<intArray.length; i++) {
			int total=0;
			for (int j=0; j<intArray[i].length; j++)
			{
				total+=intArray[i][j];
				System.out.print(intArray[i][j]+" ");

			}
			System.out.print("=> Sum of this row = "+ total);
			System.out.println(); // 다음 줄로 넘어가기
			
		}
	}
}
