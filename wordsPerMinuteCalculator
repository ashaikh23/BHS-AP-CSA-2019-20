import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int wpm,totalPages,wordsPerPage;
		double calc, negtimecalc;
		String response, endResponse;
		System.out.println("How many words do you type on average per minute?");
		wpm = scan.nextInt();
		System.out.println("How many pages do you plan on writing?");
		totalPages = scan.nextInt();
		System.out.println("How many words do you have, on average, per page?");
		wordsPerPage = scan.nextInt();
		
		/*
		 * calculation
		 * 0 = totalPages - (((wpm)(x))/100);
		 */	
		calc = ((totalPages * wordsPerPage) / wpm);	
		response = "It will take you: ";
		endResponse = "hours to create your paper";
		double timeInHours = calc/60;
		
		if (calc > 0) {
			System.out.println(response + timeInHours + endResponse);
		}
		
		else if (calc < 0) {
			negtimecalc = timeInHours * -1;
			System.out.println(response + timeInHours + endResponse);
		}
		
		else {
			System.out.println("Wackey numbers, huh!" + response + timeInHours + endResponse);
		}	
		
	}
}
