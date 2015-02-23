import java.util.Scanner;

public class Rating {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		double TD;
		double Yards;
		double INT;
		double comp;
		double ATT;
		boolean done = false;
		double answer;

		while (done == false) {
			System.out.print("Please Enter Touchdowns: ");
			TD = input.nextDouble();
			System.out.print("Please Enter Total Yards: ");
			Yards = input.nextDouble();
			System.out.print("Please Enter Interceptions: ");
			INT = input.nextDouble();
			System.out.print("Please Enter Completions: ");
			comp = input.nextDouble();
			System.out.print("Please Enter Attempted Passes: ");
			ATT = input.nextDouble();

			answer = (((8.4 * Yards) + (330 * TD) + (100 * comp) - (200 * INT)) / ATT);

			System.out.print("This Player's Rating Is: " + answer);
			break;
		}
		
		input.close();

	}
}