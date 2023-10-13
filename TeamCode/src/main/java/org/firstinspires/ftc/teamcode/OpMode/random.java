package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class random extends LinearOpMode
{
    //static DcMotor motorFR;
    //static DcMotor motorFL;
    //static DcMotor motorBR;
    //static DcMotor motorBL;

    //0 = frontRight, 1 = frontLeft, 2 = backRight, 3 = backLeft
    static DcMotor[] motors = new DcMotor[4];

    //the bit th
    public void runOpMode()
    {
        //initialize all the motors (map, zero power behaviour, and set up for encoder
        String[] motorNames = {"frontR", "frontL", "backR", "backL"};

        for(int i = 0; i < motors.length; i++)
        {
            motors[i] = hardwareMap.dcMotor.get(motorNames[i]);
            motors[i].setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            motors[i].setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            motors[i].setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }


        //wait for go to start running
        waitForStart();

        /* if motors in 2D array, can loop this instead
        * perform all the initialization stuff in one loop
        * might have to move this into the opMode active loop
        *
        //maps the motor
        motorFR = hardwareMap.dcMotor.get("motorFR");
        motorFL = hardwareMap.dcMotor.get("motorFL");
        motorBR = hardwareMap.dcMotor.get("motorBR");
        motorBL = hardwareMap.dcMotor.get("motorBL");

        //for when no power is being fed to the motors
        motorFR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE)
        motorFL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE)
        motorBR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE)
        motorBL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE)

        //reset the encoder values (make sure start count at 0)
        motorFR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorFL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorBL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        //tell motors to keep track of encoder values
        motorFR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorFR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
         */

        //code will run so long as active
        while(opModeIsActive())
        {
            //set speed of motors
            for(DcMotor m: motors)
            {
                setPower(m);
            }
        }
    }

    //sets the speed of the motors
    public void setPower(DcMotor motor)
    {
        motor.setPower(-gamepad1.left_stick_y);
    }
}
