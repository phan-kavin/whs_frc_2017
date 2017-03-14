package org.usfirst.frc.team6750.robot.commands;

import org.usfirst.frc.team6750.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Turns on the gear knocker
 * 
 * The speed can be set in the settings via the dash board
 */
public class CommandToggleWinchReverse extends Command {
	public CommandToggleWinchReverse() {
		this.requires(RobotMap.gearLoaderSystem);
	}

	@Override
	public void initialize() {
		RobotMap.gearLoaderSystem.toggleMotorReverse();
	}

	@Override
	public void execute() {
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	public void end() {
	}

	@Override
	public void interrupted() {
		end();
	}
}