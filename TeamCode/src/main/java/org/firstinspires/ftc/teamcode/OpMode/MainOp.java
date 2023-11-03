package org.firstinspires.ftc.teamcode.OpMode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp

public class MainOp extends LinearOpMode {
    @Override

    public void runOpMode() throws InterruptedException {

        DcMotor frontLeft = hardwareMap.dcMotor.get("FL");
        DcMotor frontRight = hardwareMap.dcMotor.get("FR");
        DcMotor backLeft = hardwareMap.dcMotor.get("BL");
        DcMotor backRight = hardwareMap.dcMotor.get("BR");

        DcMotor leftLinslide = hardwareMap.dcMotor.get("LLS");
        DcMotor rightLinSlide = hardwareMap.dcMotor.get("RLS");

        DcMotor intakeMotor = hardwareMap.dcMotor.get("GKKOWHL");

        waitForStart();
        if (isStopRequested()) return;
        while(opModeIsActive()) {

        }
    }
}
