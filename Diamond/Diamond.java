import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println();
		
		for (int i = 1; i <= number; i++) {
			for (int k = number; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
		
		for (int i = 1; i <= number-1; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = number-1; j >= i; j--) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
