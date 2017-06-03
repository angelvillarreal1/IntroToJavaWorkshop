import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;



public class Graffiti {
	public static void main(String[] args) {
		Robot r2d2=new Robot();
		r2d2.setSpeed(10);
		r2d2.penDown();
		r2d2.setPenColor(Color.orange);
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.move(100);
		r2d2.setPenColor(Color.pink);
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.move(100);
		r2d2.setPenColor(Color.green);
		r2d2.penUp();
		r2d2.turn(180);
		r2d2.move(100);
		r2d2.penDown();
		r2d2.turn(-90);
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.move(100);
		r2d2.turn(180);
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.setPenColor(Color.cyan);
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.move(200);
		r2d2.penUp();
		r2d2.setPenColor(Color.red);
		r2d2.penDown();
		r2d2.turn(180);
		r2d2.turn(25);
		r2d2.move(225);
		r2d2.turn(130);
		r2d2.move(225);
		r2d2.turn(115);
		r2d2.move(200);
		r2d2.penUp();
		r2d2.move(111110);
		
		
	}

}
