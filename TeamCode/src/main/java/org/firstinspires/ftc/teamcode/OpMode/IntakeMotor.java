package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class IntakeMotor {

    public static void spinMotor(DcMotor m, boolean tempButton) {
        m.setPower(tempButton ? 1 : 0);
    }
}
