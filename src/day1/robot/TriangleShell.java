package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class 
 {

	// 1. Create a new Robot
    Robot servo = new Robot();
	
	void go() {
		
		// 6. Make the robot go as fast as possible
        
		// 4. make a variable to hold the length of the triangle and set it to 50
        int lenth = (50);
		// 7. Do the following (up to step 10) 60 times

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	        drawTriangle(lenth);
			// 10. Turn the tortoise 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
    for (int i = 0; i < 3; i++) {
    servo.turn(360/3);
    }

	
}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
