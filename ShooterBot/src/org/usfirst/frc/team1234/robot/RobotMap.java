// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team1234.robot;
    
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DoubleSolenoid shooterpiston1;
    public static DoubleSolenoid shooterpiston2;
    public static Solenoid shooterlatchPiston;
    public static DigitalInput shooterpiston1ReedSwitchFront;
    public static DigitalInput shooterpiston1ReedSwitchBack;
    public static DigitalInput shooterhotGoalSensor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
     //   Warning, the two modules in robot builder are different!
shooterpiston1 = new DoubleSolenoid(1, 3, 4);      
        LiveWindow.addActuator("Shooter", "piston1", shooterpiston1);
        
     //   Warning, the two modules in robot builder are different!
shooterpiston2 = new DoubleSolenoid(1, 5, 6);      
        LiveWindow.addActuator("Shooter", "piston2", shooterpiston2);
        
        shooterlatchPiston = new Solenoid(1, 2);
        LiveWindow.addActuator("Shooter", "latchPiston", shooterlatchPiston);
        
        shooterpiston1ReedSwitchFront = new DigitalInput(9);
        LiveWindow.addSensor("Shooter", "piston1ReedSwitchFront", shooterpiston1ReedSwitchFront);
        
        shooterpiston1ReedSwitchBack = new DigitalInput(11);
        LiveWindow.addSensor("Shooter", "piston1ReedSwitchBack", shooterpiston1ReedSwitchBack);
        
        shooterhotGoalSensor = new DigitalInput(3);
        LiveWindow.addSensor("Shooter", "hotGoalSensor", shooterhotGoalSensor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
