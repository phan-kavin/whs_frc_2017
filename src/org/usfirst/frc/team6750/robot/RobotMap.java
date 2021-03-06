package org.usfirst.frc.team6750.robot;

import org.usfirst.frc.team6750.robot.subsystems.DriveSystem;
import org.usfirst.frc.team6750.robot.subsystems.WinchSystem;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Maps out the entire robot
 * 
 * Contains the motors, subsystems, controllers, pneumatics, etc.
 */
public class RobotMap {
	/**
	 * Gear catcher is the front
	 * Used to globally define what motors are connected to which PWM
	 * 
	 * 3 is middle middle spark
	 * 4 is front right jaguar
	 * 2 is back left jaguar
	 * 5 is front middle spark
	 * 
	 * Also makes it easy to change the motors
	 * 
	 */
	public static final int BACK_LEFT_MOTOR = 2, FRONT_LEFT_MOTOR = 5, BACK_RIGHT_MOTOR = 3, FRONT_RIGHT_MOTOR = 4, WINCH_MOTOR = 8;

	/**
	 * Contains the motors used to drive
	 */
	public static DriveSystem driveSystem;

	public static WinchSystem winchSystem;

	/**
	 * Used to drive the robot
	 * 
	 * The order in which the parameters are entered is intended to be that way
	 * (see doc for RobotDrive)
	 */
	public static RobotDrive robotDrive;

	/**
	 * The controller
	 * 
	 * Should be the only controller plugged in
	 */
	public static XboxController xboxController;

	public static JoystickButton buttonA,
			buttonB,
			buttonX,
			buttonY,
			lBumper,
			rBumper,
			backButton;
}