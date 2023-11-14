package ch08;

public class RobotEx {
	public static void main(String[] args) {
		Robot[] robots = new Robot[3];
		robots[0] = new DanceRobot();
		robots[1] = new SingRobot();
		robots[2] = new DrawRobot();
		
		for(Robot robot:robots) {
			action(robot);
		}
	}

	private static void action(Robot robot) {
		if(robot instanceof DanceRobot)
			((DanceRobot) robot).dance();
		else if(robot instanceof SingRobot)
			((SingRobot) robot).sing();
		else
			((DrawRobot) robot).draw();
			
		
	}
}
