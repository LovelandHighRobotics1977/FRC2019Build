package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	/**
	 * Inherited static access to the OI.
	 */
	protected static OI oi;
	protected static Drive drive;
	
	/**
	 * Initialize the CommandBase, in doing so accessing and initializing every
	 * primary subsystem on the robot. Use this during robot initialization to
	 * prevent unnecessary redundancy.
	 */
	
	public static void init() {
		drive = Drive.getInstance();
		oi = OI.getInstance();
		
		
	}
}