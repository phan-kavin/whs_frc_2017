package org.usfirst.frc.team6750.robot.subsystems;

import org.usfirst.frc.team6750.robot.RobotMap;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Composed of the 4 motors used to drive the robot
 */
public class DriveSystem extends Subsystem {
	public Jaguar backLeftMotor, frontLeftMotor, backRightMotor, frontRightMotor;

	public DriveSystem() {
		super();

		backLeftMotor = new Jaguar(RobotMap.BACK_LEFT_MOTOR);
		backRightMotor = new Jaguar(RobotMap.BACK_RIGHT_MOTOR);
		frontLeftMotor = new Jaguar(RobotMap.FRONT_LEFT_MOTOR);
		frontRightMotor = new Jaguar(RobotMap.FRONT_RIGHT_MOTOR);
	}

	@Override
	protected void initDefaultCommand() {
	}
}