import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean prime = true;
		String number = JOptionPane.showInputDialog("Pick a number and I will tell you if it's prime or not!");
		int newNumber = Integer.parseInt(number);
		for (int i = 2; i < newNumber; i++) {
			if (newNumber % i == 0) {
				System.out.println("That number isn't prime.");
				prime = false;
				break;
			}

		}
		if (prime == true) {
			System.out.println("That number is prime!");
		}

	}

}
