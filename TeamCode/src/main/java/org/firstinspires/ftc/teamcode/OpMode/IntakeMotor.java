package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class IntakeMotor {

    static DcMotor motor;

    public static void initIntakeMotor(DcMotor m) {
        motor = m;
    }

    public static void runIntake(boolean tempButton) {
        motor.setPower(tempButton ? 1 : 0);
    }
}
