package org.firstinspires.ftc.teamcode.OpMode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp

public class MainOp extends LinearOpMode {
    @Override

    public void runOpMode() throws InterruptedException {

        //*******************************DRIVECHAIN INIT****************************************************************

        DcMotor frontLeft = hardwareMap.dcMotor.get("FL");
        DcMotor frontRight = hardwareMap.dcMotor.get("FR");
        DcMotor backLeft = hardwareMap.dcMotor.get("BL");
        DcMotor backRight = hardwareMap.dcMotor.get("BR");

        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE); //UNSURE IF THIS IS CORRECT
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE); //UNSURE IF THIS IS CORRECT

        //******************************LINSLIDE INIT****************************************************************

        DcMotor leftLinSlide = hardwareMap.dcMotor.get("LLS");
        DcMotor rightLinSlide = hardwareMap.dcMotor.get("RLS");

        leftLinSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightLinSlide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftLinSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftLinSlide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightLinSlide.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightLinSlide.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftLinSlide.setDirection(DcMotorSimple.Direction.REVERSE); //UNSURE IF THIS IS CORRECT

        //*********************************INTAKE/GOGEKKOWHEEL INIT*****************************************************

        DcMotor intakeMotor = hardwareMap.dcMotor.get("GKKOWHL");

        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //***********************************HINGE/HATCH INIT***********************************************

        Servo hingeServo = hardwareMap.servo.get("hngs");
        Servo hatchServo = hardwareMap.servo.get("htcs");

        //********************************INIT METHODS************************************************************

        IntakeMotor.initIntakeMotor(intakeMotor);
        LinearSlides.initLinSlides(leftLinSlide, rightLinSlide);
        HingeServo.hingeServoInit(hingeServo);
        HatchServo.hatchServoInit(hatchServo);


        //******************************TELEOP********************************************************

        waitForStart();

        if (isStopRequested()) return;

        while(opModeIsActive()) {

            IntakeMotor.runIntake(gamepad1.a /*TEMP*/);
            LinearSlides.runLinSlides(gamepad1.right_trigger, gamepad1.left_trigger /*TEMP*/);
            HingeServo.runHingeServo(true);
            HatchServo.runHatchServo(true);


            //man fuck this copy pasted drivechain bullshit

            double y = -gamepad1.left_stick_y; // Remember, this is reversed!
            double x = gamepad1.left_stick_x * 1.1; // Counteract imperfect strafing
            double rx = gamepad1.right_stick_x ;
            // Denominator is the largest motor power (absolute value) or 1
            // This ensures all the powers maintain the same ratio, but only when
            // at least one is out of the range [-1, 1]
            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
            double frontLeftPower = (y + x + rx)/ denominator;
            double backLeftPower = (y - x + rx)/ denominator;
            double frontRightPower = (y - x - rx)/ denominator;
            double backRightPower = (y + x - rx)/ denominator;
        }
    }
}
