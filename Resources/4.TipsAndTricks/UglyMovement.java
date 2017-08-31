package main;

import lejos.nxt.MotorPort;

/**
 * Provides easy-to-use methods for rotating and moving the robot.
 * 
 */
public class UglyMovement
{
	// Constants for the wheel ports
	private final MotorPort RIGHT_WHEEL = MotorPort.A;
	private final MotorPort LEFT_WHEEL = MotorPort.B;
	// Constants for the wheel diameter and wheel base
	private final double WHEEL_DIAMETER = 4.32;
	private final double WHEEL_BASE = 10.75;
	// Constant for the ideal motor speed
	private final int MOTOR_POWER = 75;
	private final int MOTOR_POWER_OFFSET = 2; // How much one wheel needs to be turned down so that the robot drives straight
	/**
	 * Rotates the robot for a given number of degrees.
	 * @param angle how many degrees the robot should rotate. Negative values rotate counter-clockwise.
	 */
	public void rot(double angle)
	{
		// Wheelbase is the radius of the circle
		// So circumference is 2 * wheelbase * pi
		// The distance in one degree is circumference divided by 360
		// Multiply that by the number of degrees needed (the angle)
		double targetDistance = ((2 * WHEEL_BASE * Math.PI) / 360) * angle;
		LEFT_WHEEL.resetTachoCount();
		RIGHT_WHEEL.resetTachoCount();
		if (angle < 0) // If given a negative value (turn counter-clockwise)
		{
			turnSingleWheelOn("right", 1); // Turn on the right wheel
			while (getDistanceRotated("right") <= targetDistance) // While the distance rotated is less than the target distance
			{
				// Just keep turning...
			}
		}
		if (angle >= 0) // If given a positive value (turn clockwise)
		{
			turnSingleWheelOn("left", 1); // Turn on the left wheel
			while (getDistanceRotated("left") <= targetDistance) // While the distance rotated is less than the target distance
			{
				// Just keep turning...
			}
		}
		turnWheelsOff(); // Turn both wheels off
	}
	/**
	 * Moves the robot forward endlessly.
	 */
	public void movFwd() 
	{
		turnBothWheelsOn(1);
	}
	/**
	 * Stops the robot
	 */
	public void stp()
	{
		turnWheelsOff();
	}
	/**
	 * Moves the robot a given distance.
	 * @param targetDistance how far the robot should move (negative values will move robot in reverse).
	 */
	public void movDst(double targetDistance)
	{
		LEFT_WHEEL.resetTachoCount();
		RIGHT_WHEEL.resetTachoCount();
		if (targetDistance < 0)
		{
			turnBothWheelsOn(2);
			while(getDistanceRotated() > targetDistance)
			{
				// Just keep moving...
			}
		}
		else
		{
			turnBothWheelsOn(1);
			while(getDistanceRotated() < targetDistance)
			{
				// Just keep moving...
			}
		}
		turnWheelsOff(); // Turn off the wheels
	}
	private double getDistanceRotated()
	{
	// circumference = pi * diameter
	// Circumference is same as the distance traveled in each rotation
	double distanceInEachRotation = WHEEL_DIAMETER * Math.PI;

	double currentTachoCount = LEFT_WHEEL.getTachoCount();

	/* MATH */
	// distanceInEachRotation is one full rotation, which is 360 tachos
	// So the distance traveled in one tacho is distanceInEachRotation/360
	// And total distance is that multiplied by the tacho count
	return (distanceInEachRotation / 360) * currentTachoCount;
	}

	private double getDistanceRotated(String wheel)
	{
	double distanceInEachRotation = WHEEL_DIAMETER * Math.PI; // Distance in each rotation is equal to the circumference of the wheel

	double currentTachoCount = 0; // Set a default value for the new tacho count

	if (wheel.toLowerCase().equals("right")) // If told to check the right wheel
	{
	currentTachoCount = RIGHT_WHEEL.getTachoCount(); // Use the tacho count on the right wheel
	}
	if (wheel.toLowerCase().equals("left")) // If told to check the left wheel
	{
	currentTachoCount = LEFT_WHEEL.getTachoCount(); // Use the tacho count on the left wheel
	}
	return (distanceInEachRotation / 360) * currentTachoCount; // Return the distance traveled in tachos
	}

	private void turnBothWheelsOn(int direction)
	{
	LEFT_WHEEL.controlMotor(MOTOR_POWER, direction);
	RIGHT_WHEEL.controlMotor(MOTOR_POWER - MOTOR_POWER_OFFSET, direction);
	}

	private void turnSingleWheelOn(String wheel, int direction)
	{
	if (wheel.toLowerCase().equals("left"))
	{
	LEFT_WHEEL.controlMotor(MOTOR_POWER, direction);
	}
	if (wheel.toLowerCase().equals("right"))
	{
	RIGHT_WHEEL.controlMotor(MOTOR_POWER, direction);
	}
	}

	/**
	 * Turns both wheels off.
	 */
	private void turnWheelsOff()
	{
	LEFT_WHEEL.controlMotor(MOTOR_POWER, 3);
	RIGHT_WHEEL.controlMotor(MOTOR_POWER, 3);
	}
}
