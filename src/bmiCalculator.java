import java.util.Scanner;
import java.text.DecimalFormat;

public class bmiweight {
	public static void main (String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
	
			System.out.println("Enter the weight");
			Scanner weigh = new Scanner(System.in);
			int weight = weigh.nextInt();
			System.out.println("Enter the height");
			Scanner heigh = new Scanner(System.in);
			double height= heigh.nextDouble();
			double bmi= weight/(height*height);
			System.out.println("Your BMI is:" +df.format(bmi));
			
			
	}
}
