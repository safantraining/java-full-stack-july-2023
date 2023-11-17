package day4;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int marks[] = new int[5];
		
		System.out.println("size of array :"+ marks.length);
		
		for(int i=0 ;i<marks.length; i++)
		      System.out.print(marks[i] +" ");
		
		
		System.out.println();
         
		 marks[1]=67;
         marks[2]=82;
         marks[4]=51;
         
         for(int i=0 ;i<marks.length; i++)
		      System.out.print(marks[i]+" ");

		
	}

}
