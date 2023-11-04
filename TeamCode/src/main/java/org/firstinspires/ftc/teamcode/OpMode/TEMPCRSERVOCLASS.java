package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

public class TEMPCRSERVOCLASS {

    static CRServo tempCRServo;

    public static void tempCRServoInit(CRServo crs) {
        tempCRServo = crs;
    }

    public static void runTempCRServo(boolean tempButton4) {
        tempCRServo.setPower(tempButton4 ? 1 : 0);
    }

}
