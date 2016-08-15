package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot thorvo = new Robot ();
thorvo.penDown();
thorvo.setPenColor(68,238,68);
for (int i = 0; i < 4; i++) {
thorvo.move (300);
thorvo.turn(-90);
}

	}
}
