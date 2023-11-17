package day4;

public class JaggedArray {

	public static void main(String[] args) {

		int arr[][] = new int[3][];
		
		arr[0] =new int[4];
		arr[1]= new int[7];
		arr[2]=new int [2];
		
	     System.out.println(arr.length);
	     System.out.println(arr[0].length);
	     
	     System.out.println("----jagged array---");
	     
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
