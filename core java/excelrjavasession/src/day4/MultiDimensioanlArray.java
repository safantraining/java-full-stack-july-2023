package day4;

public class MultiDimensioanlArray {

	public static void main(String[] args) {

		int arr[][]= new int[10][8];
		
		System.out.println("length :"+ arr.length);
		System.out.println("first row length :"+ arr[0].length);
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			
			System.out.println();
		}
		
		arr[1][5]=1;
		arr[2][3]=1;
		arr[1][6]=1;
		arr[4][4]=1;
		
		System.out.println("------after booking---");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			
			System.out.println();
		}
		
		
	}

}
