package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class IntakeMotor {

    static DcMotor motor;
    static DcMotor motorBack;

    public static void initIntakeMotor(DcMotor m, DcMotor bm) {
        motor = m;
        motorBack = bm;
    }


    public static void runIntake(boolean tempButton, boolean tempButton2) {
        motor.setPower(tempButton ? 1 : 0);
        motorBack.setPower(tempButton2 ? 1 :0);
    }
}
