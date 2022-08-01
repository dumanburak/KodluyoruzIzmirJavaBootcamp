import java.util.Scanner;							// importing scanner library

public class Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();					// getting input from user
		
		System.out.println();
		
		for (int i = 1; i <= number; i++) {			// outer loop for top-stars
			for (int k = number; k > i; k--) {		// inner loop for left-spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {			// inner loop for drawing stars
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
		
		for (int i = 1; i <= number-1; i++) {		// outer loop for bottom-stars
			for (int k = 1; k <= i; k++) {			// inner loop for left-spaces
				System.out.print(" ");
			}
			for (int j = number-1; j >= i; j--) {	// inner loop for drawing stars
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		sc.close();									// closing scanner
	}

}
