import java.util.Scanner;

public class bmiweight {
	public static void main (String[] args) {
	
			System.out.println("Enter the weight");
			Scanner weigh = new Scanner(System.in);
			int weight = weigh.nextInt();
			System.out.println("Enter the height");
			Scanner heigh = new Scanner(System.in);
			double height= heigh.nextDouble();
			double bmi= weight/(height*height);
			System.out.println("Your BMI is:" + bmi);
			
			
	}
}
