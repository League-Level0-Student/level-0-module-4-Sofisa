import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	//skills.skill1();
          	//skills.skill2();
          	//skills.skill3();
          	//skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
	
// Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int newDimes = Integer.parseInt(dimes);


// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "You have " + (newDimes+10));



// Ask the user how tall they are (inches)
String inches = JOptionPane.showInputDialog("How many tall are you in inches?");
int newInches = Integer.parseInt(inches);


// If they are shorter than 36 inches, tell them to eat their Wheaties
if(newInches < 36) {
	JOptionPane.showMessageDialog(null, "Eat your wheaties!");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for (int i = 0; i < 31; i++) {
	if (i%3==0) {
		System.out.println(i);
	}
}




}

void skill3() { // Get a random number that is less than 20 and print it to the console 

Random randy = new Random();
int randnum = randy.nextInt(20);
System.out.println(randnum);
// Get another random number that is less than 10 and print it to the console
int randnum2 = randy.nextInt(10);
System.out.println(randnum2);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, randnum - randnum2);


}

void skill4() { // In a pop-up, ask the user for the city they live in 
String city = JOptionPane.showInputDialog("What city do you live in?");


// If they answered "San Diego", tell them they live in America's Finest City 
if (city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
}else {
	JOptionPane.showMessageDialog(null, "Move to San Diego!");
}


// Otherwise, tell them to move to San Diego 



// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String cars = JOptionPane.showInputDialog("How many cars do you have?");
int newCars = Integer.parseInt(cars);
if (newCars == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}
// If there is 1 car, use a pop-up to display the make/model of the car 
if (newCars == 1) {
	JOptionPane.showMessageDialog(null, "Your car is the one from Back to the Future");
}


// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
if (newCars >1) {
	JOptionPane.showMessageDialog(null, "You have " + newCars *4 + " wheels");
}


}

void skill5() { // In a pop-up, ask the user for the name of their school 
String school = JOptionPane.showInputDialog("What's the name of your school?");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 

JOptionPane.showMessageDialog(null, school + " is an awesome school!");

}
}