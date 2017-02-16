package org.usfirst.frc.team6750.robot.commands;

import org.usfirst.frc.team6750.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class CommandDrive extends Command {
	public Timer timer;
	public double duration, moveSpeed, rotateSpeed;
	
	public CommandDrive(double duration, double moveSpeed, double rotateSpeed) {
		this.duration = duration;
		this.moveSpeed = moveSpeed;
		this.rotateSpeed = rotateSpeed;
		
		this.requires(RobotMap.driveSystem);
	}
	
	@Override
	public void initialize() {
		timer = new Timer();
		
		timer.start();
	}
	
	@Override
	public void execute() {
		RobotMap.robotDrive.arcadeDrive(moveSpeed, rotateSpeed);
	}

	@Override
	protected boolean isFinished() {
		return timer.get() >= duration ? true : false;
	}
	
	@Override
	public void end() {
		timer.stop();
		RobotMap.robotDrive.arcadeDrive(0D, 0D);
	}

	@Override
	public void interrupted() {
		end();
	}
}