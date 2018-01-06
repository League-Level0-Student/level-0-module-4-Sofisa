import javax.swing.JOptionPane;

public class TestScores {
 public static void main(String[] args) {

String score = JOptionPane.showInputDialog("What's your test score?");
int number = Integer.parseInt (score);
	if (number >= 90) {
		JOptionPane.showMessageDialog(null, "Good job! That's an A.");
	}
	if (number <= 89 && number >= 85) {
		JOptionPane.showMessageDialog(null, "Thats a B your score is average.");
	}
	if (number <= 84 && number >= 77) {
		JOptionPane.showMessageDialog(null, "Thats a C. Better luck next time");
	}
	if (number <= 76 && number >= 70) {
		JOptionPane.showMessageDialog(null, "Thats a D. You probably didn");
	}
	if (number <= 69) {
		JOptionPane.showMessageDialog(null, "Thats an F. You failed :(");
	}
 }
 }

