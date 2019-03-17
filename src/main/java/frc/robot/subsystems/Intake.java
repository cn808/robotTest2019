/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.IntakeWithJoystick;

import com.revrobotics.CANSparkMax;


/**
 * Add your docs here.
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  CANSparkMax ballcollect = new CANSparkMax(13, com.revrobotics.CANSparkMaxLowLevel.MotorType.kBrushless);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new IntakeWithJoystick());
  }

  public void intakeWithJoystick(Joystick leftStick, Joystick rightStick) {

    boolean outtakeball = leftStick.getRawButton(5);
    boolean outakeball = rightStick.getRawButton(4);

    // INTAKE
    if(outtakeball){ //outtakes ball
      ballcollect.set(-0.2);
    }
    else if(outakeball){
      ballcollect.set(-0.165);

    }
    else{ //defaults
      ballcollect.set(0);
    }

  }

  public void ejectBall(){
    ballcollect.set(-0.3);
  }

  public void stopBallCollect(){
    ballcollect.disable();
  }
}
