package day2;

public class ExplicitCasting {

	public static void main(String[] args) {

		double salary = 68000.4444444444444444444444444444444444444444444;
		
		int bonus = (int)salary;
		float f= (float) salary;
         
		float f2 = 2000.891112777777777777666666666666f;
		
		System.out.println("salary :"+ salary);
		System.out.println("bonus :"+ bonus);
		System.out.println("float :"+ f);
		System.out.println("float "+ f2);
	}

}
