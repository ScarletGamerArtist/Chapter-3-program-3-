package AlannaBotscharowChpter3Pr3;
import java.util.Scanner; 
/* 
 * Alanna Botscharow
 * 10/18
 */
public class Chapter3Proggram3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt user input
			//Input for feet
			System.out.println("Enter the amount of feet that you would like to convert into meters: ");
		
			//Variables!
		double feet = input.nextDouble(); 
		
		//Convert feet to meters
			//formula: foot = 0.305 meter.
		
		double meters = feet * 0.305; 
		
		//Display the results
		
			System.out.println("The total meters is: "+meters);

	}

}
