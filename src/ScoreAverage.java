import java.util.Scanner;

public class ScoreAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tell me the score of math");
		double math = input.nextDouble();
		
		System.out.println("Tell me the score of science");
		double science = input.nextDouble();
		
		System.out.println("Tell me the score of English");
		double english = input.nextDouble();
		
		double average = (math + science + english) / 3;
		
		System.out.println("Your average score is " + average);
		
		if(average >= 90)
			System.out.println("A");
		else if(average >= 80)
			System.out.println("B");
		else if(average >= 70)
			System.out.println("C");
		else if(average >= 60)
			System.out.println("D");
		else if(average >= 50)
			System.out.println("E");
		else
			System.out.println("F");
	}
}
