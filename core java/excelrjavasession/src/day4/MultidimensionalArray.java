package day4;

public class MultidimensionalArray {

	public static void main(String[] args) {

		int arr[][] = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		System.out.println("==========");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length ;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			
			System.out.println();
		}
		
	}

}
