import java.util.Scanner;

/**
 * Room Calculator
 * 
 * Prompts the user for the width and length of a room and returns the perimeter
 * and the area based on the given input.
 * 
 * @author Brendan
 *
 */
public class RoomCalculator {

	public static void main(String[] args) {	
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		Scanner scanner = new Scanner(System.in);
		
		String continueResponse = "";
		
		do {
			calculateRoom(scanner);
			System.out.println("Continue? (y/n)");
			continueResponse = scanner.next();
		} while (continueResponse.equalsIgnoreCase("y"));
		
		scanner.close();
	}
	
	/**
	 * Runs the main program, prompting the user for the length and width
	 * of the room.  This will be ran every time the user decides to continue as
	 * well as when the program is initially ran.
	 * 
	 * @param scanner Used to handle user input
	 */
	private static void calculateRoom(Scanner scanner) {
		System.out.println("Enter Length:");
		double length = scanner.nextDouble();
		System.out.println("Enter Width:");
		double width = scanner.nextDouble();
		System.out.println("Area: " + getArea(width, length));
		System.out.println("Perimeter: " + getPerimeter(width, length));
	}
	
	/**
	 * Calculates the perimeter of the given rectangle given the width
	 * and height.
	 * 
	 * @param width The width of the rectangle
	 * @param length The height of the rectangle
	 * @return Perimeter of the rectangle
	 */
	private static double getPerimeter(double width, double length) {
		return width + width + length + length;
	}
	
	
	/**
	 * Calculates the area of the given rectangle given the width and height.
	 * 
	 * @param width The width of the rectangle
	 * @param length The height of the rectangle
	 * @return The area of the rectangle
	 */
	private static double getArea(double width, double length) {
		return width * length;
	}

}
