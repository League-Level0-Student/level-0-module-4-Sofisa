//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	static int happiness = 0;
	//    Initialize to zero.

	public static void main(String[] args) {
		ImageIcon petImage = null;
		// 1. Ask the user what kind of pet they want to buy, and store in variable
String pet = JOptionPane.showInputDialog("Hi! What pet do you want? We currently have a dinosaur or a corgi in stock");
if(pet.equals("corgi")) {
	petImage = new ImageIcon(HappyPet.class.getResource("corgi.jpg"));

}
if(pet.equals("dinosaur")) {
	petImage = new ImageIcon(HappyPet.class.getResource("dino.jpg"));
}
	
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			
			// 5. Use user input to call the appropriate method created in step 4.
for (int i = 0; i < 100000; i++) {
	int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet", "This Pet is Alot of Work", 0, JOptionPane.INFORMATION_MESSAGE, petImage,
			new String[] { "food", "play", "sleep", "groom" }, null);
System.out.println(task);

if (task == 0) {
	food();
}
if (task == 1) {
	play();
}
if (task == 2) {
	sleep();
}	
if (task == 3) {
	groom();
}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happiness >= 500) {
	JOptionPane.showMessageDialog(null, "Wow your a really good with pets! Your adwarded with a buy one pet get one free coupon!");
	break;
	
	
}
}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void food () {
		happiness += 100;
		JOptionPane.showMessageDialog(null, "Your pet LOVES food. Good job! Your happiness score is " + happiness);
		
	}
	static void play () {
		happiness -= 5;
		JOptionPane.showMessageDialog(null, "Uhhhh your pets L-A-Z-Y they dont like to exercise! Your happiness score is " + happiness);
		
	}
	static void sleep () {
		happiness += 100;
		JOptionPane.showMessageDialog(null, "Your pet loves sleep. It thanks you! Your happiness score is " + happiness);
	}
	static void groom () {
		happiness -= 80;
		JOptionPane.showMessageDialog(null, "Your pet thinks you dont like the way it looks currently. They think their fur looks just fine! Your happiness score is " + happiness);
	}
	}

