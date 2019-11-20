import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog("What is your favorite color?");
	
	
	JOptionPane.showMessageDialog(null,"I also like the color "+input);
	
	Robot BobbyJoe=new Robot();
	
	BobbyJoe.setSpeed(100);
	
	BobbyJoe.penDown();
	
	BobbyJoe.move(100);
	
	BobbyJoe.turn(120);
	
    BobbyJoe.move(100);
	
	BobbyJoe.turn(120);
	
    BobbyJoe.move(100);
	
	BobbyJoe.turn(120);
}
}
