package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.CRServo;

public class TEMPCRSERVOCLASS3 {

    static CRServo tempCRServo3;

    public static void tempCRServo3Init(CRServo crs) {
        tempCRServo3 = crs;
    }

    public static void runTempCRServo3(boolean tempButton6) {
        tempCRServo3.setPower(tempButton6 ? 1 : 0);
    }

}
