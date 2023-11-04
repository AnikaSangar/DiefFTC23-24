package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.CRServo;

public class TEMPCRSERVOCLASS2 {

    static CRServo tempCRServo2;

    public static void tempCRServo2Init(CRServo crs) {
        tempCRServo2 = crs;
    }

    public static void runTempCRServo2(boolean tempButton5) {
        tempCRServo2.setPower(tempButton5 ? 1 : 0);
    }

}
