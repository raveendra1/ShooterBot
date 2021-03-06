// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team1234.robot.subsystems;

import org.usfirst.frc.team1234.robot.RobotMap;
import org.usfirst.frc.team1234.robot.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Shooter extends Subsystem {
	DoubleSolenoid piston1 = RobotMap.shooterpiston1;
	DoubleSolenoid piston2 = RobotMap.shooterpiston2;
int bacon; 
	@Override
	public void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public void extendBoth(){
		piston1.set(DoubleSolenoid.Value.kForward);
		piston2.set(DoubleSolenoid.Value.kForward);
	}
	
	public void retractBoth(){
		piston1.set(DoubleSolenoid.Value.kReverse);
		piston2.set(DoubleSolenoid.Value.kReverse);
	}
	public void offBoth(){
		piston1.set(DoubleSolenoid.Value.kOff);
		piston2.set(DoubleSolenoid.Value.kOff);
	}
   
}

