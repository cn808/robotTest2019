/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

//Joystick Buttons
public static int PRECISION = 2;
//public static int ADJUST = 9;
public static int ORTHOGONAL = 7;
public static int ROBOTCENTRIC = 11;

//DRIVE
//Motors
public static int FRONTLEFTDRIVE = 1;
public static int FRONTLEFTSTEER = 2;
public static int FRONTRIGHTDRIVE = 3;
public static int FRONTRIGHTSTEER = 4;
public static int BACKLEFTDRIVE = 5;
public static int BACKLEFTSTEER = 6;
public static int BACKRIGHTDRIVE = 7;
public static int BACKRIGHTSTEER = 8;

//Swerve Constants
public static int POSITIONSENSORSAMPLES = 10;
public static double POSITIONSENSORRANGE = 0.0879; // 360 divided by (maximum unit of rotation), turns encoder units into degrees
public static double SINEOFFRONTLEFTWHEEL = 0.7071; //+ 45 Degree //measure length and width of the robot and find cosine/sine
public static double COSINEOFFRONTLEFTWHEEL = 0.7071; //+
public static double SINEOFFRONTRIGHTWHEEL = -0.7071; //- 45 Degree
public static double COSINEOFFRONTRIGHTWHEEL = 0.7071; //+
public static double SINEOFBACKLEFTWHEEL = 0.7071; //+		45 Degree
public static double COSINEOFBACKLEFTWHEEL = -0.7071; //-
public static double SINEOFBACKRIGHTWHEEL = -0.7071; //- 	45 Degree
public static double COSINEOFBACKRIGHTWHEEL = -0.7071; //-
//DONT TOUCH BELOW?
public static double CONVERTTORAD = 0.0175;
public static double CONVERTTODEG = 57.2958;
public static int WHEELTURNTENDENCY = 95;
public static int NOPRECISIONMODE = 0;
public static double SLOWMODE = 0.4; //0.5
public static int NEGATE = -1;
public static int ANGLEDIFFERENCEDEADBAND = 2;	//3
public static double JOYMAX = 1.1;
public static double JOYDEADBAND = 0.1;
public static double MAGNITUDEDEADBAND = 0.282;
public static int KEEPANGLEPOSITIVE = 360;
public static int KEEPOFFSETPOSITIVE = 720;
public static int MAXANGLEDIFFERENCE = 60;		//80

public static double STOPMOTOR = 0.0;

public static double DIALOFFSET = 0.425;	//Real
public static int DIALSCALER = 4;

//Competition Robot
//turn the wheels straight manually and read encoder value
public static double FLSTRAIGHTPOS	= 2390.0;  
public static double FRSTRAIGHTPOS = 2237.0;
public static double BLSTRAIGHTPOS =	3188.0;
public static double BRSTRAIGHTPOS = 2521.0;

public static double FLTURNPOS	= 1370.0;
public static double FRTURNPOS = 1222.0;
public static double BLTURNPOS =	2125.0;
public static double BRTURNPOS = 1508.0;

public static double FLROTATEPOS = 1892.0;
public static double FRROTATEPOS = 2778.0;
public static double BLROTATEPOS = 3690.0;
public static double BRROTATEPOS = 2045.0;

//Steer PID values
public static double FLTURNP	= 2.5;
public static double FLTURNI	= 0.0;
public static double FLTURND	= 0.0;

public static double FRTURNP	= 2.5;
public static double FRTURNI	= 0.0;
public static double FRTURND	= 0.0;

public static double BLTURNP	= 2.5;
public static double BLTURNI	= 0.0;
public static double BLTURND	= 0.0;

public static double BRTURNP	= 2.5;
public static double BRTURNI	= 0.0;
public static double BRTURND	= 0.0;

//Limelight PID     
public static double FLADJUSTP	= 0.1;
public static double FLADJUSTI	= 0.0;
public static double FLADJUSTD	= 0.0;

public static double FRADJUSTP	= 0.1;
public static double FRADJUSTI	= 0.0;
public static double FRADJUSTD	= 0.0;

public static double BLADJUSTP	= 0.1;
public static double BLADJUSTI	= 0.0;
public static double BLADJUSTD	= 0.0;

public static double BRADJUSTP	= 0.1;
public static double BRADJUSTI	= 0.0;
public static double BRADJUSTD	= 0.0;

public static int PRACTICEMODE = 1; //0.7

//Auto Steer PID Value
public static double INITFRONTLEFTPVALUE = 0.4;
public static double INITFRONTLEFTIVALUE = 0.0;
public static double INITFRONTLEFTDVALUE = 0.0;

public static double INITFRONTRIGHTPVALUE = 0.4;
public static double INITFRONTRIGHTIVALUE = 0.0;
public static double INITFRONTRIGHTDVALUE = 0.0;

public static double INITBACKLEFTPVALUE = 0.4;
public static double INITBACKLEFTIVALUE = 0.0;
public static double INITBACKLEFTDVALUE = 0.0;

public static double INITBACKRIGHTPVALUE = 0.4;
public static double INITBACKRIGHTIVALUE = 0.0;
public static double INITBACKRIGHTDVALUE = 0.0;



public static double FRONTLEFTPVALUE = 1.0;
public static double FRONTLEFTIVALUE = 0.0;
public static double FRONTLEFTDVALUE = 0.0;

public static double FRONTRIGHTPVALUE = 1.0;
public static double FRONTRIGHTIVALUE = 0.0;
public static double FRONTRIGHTDVALUE = 0.0;

public static double BACKLEFTPVALUE = 1.0;
public static double BACKLEFTIVALUE = 0.0;
public static double BACKLEFTDVALUE = 0.0;

public static double BACKRIGHTPVALUE = 1.0;
public static double BACKRIGHTIVALUE = 0.0;
public static double BACKRIGHTDVALUE = 0.0;

//PID BACK
public static double BACKFRONTLEFTPVALUE = 1.0;
public static double BACKFRONTLEFTIVALUE = 0.0;
public static double BACKFRONTLEFTDVALUE = 0.0;

public static double BACKFRONTRIGHTPVALUE = 1.0;
public static double BACKFRONTRIGHTIVALUE = 0.0;
public static double BACKFRONTRIGHTDVALUE = 0.0;

public static double BACKBACKLEFTPVALUE = 1.0;
public static double BACKBACKLEFTIVALUE = 0.0;
public static double BACKBACKLEFTDVALUE = 0.0;

public static double BACKBACKRIGHTPVALUE = 1.0;
public static double BACKBACKRIGHTIVALUE = 0.0;
public static double BACKBACKRIGHTDVALUE = 0.0;

public static double VELOCITYPVALUE = 0;//0.1;
public static double VELOCITYIVALUE = 0;//0.001;
public static double VELOCITYDVALUE = 0;//0.0;

//Auto drive pid
public static double AUTOFLDRIVEP = 0.75;
public static double AUTOFLDRIVEI = 0;
public static double AUTOFLDRIVED = 0;

public static double AUTOFRDRIVEP = 0.75;
public static double AUTOFRDRIVEI = 0;
public static double AUTOFRDRIVED = 0;

public static double AUTOBLDRIVEP = 0.75;
public static double AUTOBLDRIVEI = 0;
public static double AUTOBLDRIVED = 0;

public static double AUTOBRDRIVEP = 0.75;
public static double AUTOBRDRIVEI = 0;
public static double AUTOBRDRIVED = 0;

//Steering PID tolerance
public static double PIDTOLERANCE = 0.1;
public static double STEERDEADBAND = 0.02;

//Intake
public static int BALLINTAKE = 9;
public static int BALLINTAKE2 = 10;

//Elevator
public static double LIFTTOLERANCE = 40;
public static double LIFTDEADBAND = 0.2;
public static int MAXPOTVALUE = 800;
public static int MINPOTVALUE = 90;

// Throw away code
public static double FRONTRIGHTSCALE = 1.0;
public static double FRONTLEFTSCALE = 1.0;
public static double BACKLEFTSCALE = 1.0;
public static double BACKRIGHTSCALE = 1.0;
//Make sure they're all false before driving. These are for PID tuning
public static boolean PIDTUNING = false;
public static boolean TUNINGDEBUG = false;
public static boolean SCALETUNING = false;

public static double KEEPPOSITIVE = 518000; //Limelight adjusting

}
