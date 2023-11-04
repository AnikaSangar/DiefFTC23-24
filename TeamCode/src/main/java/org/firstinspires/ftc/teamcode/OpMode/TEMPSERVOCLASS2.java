package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.Servo;

public class TEMPSERVOCLASS2 {

    static Servo tempServo2;

    public static void tempServo2Init(Servo s) {
        tempServo2 = s;
    }

    public static void runTempServo2(boolean tempButton2) {
        tempServo2.setPosition(tempButton2 ? 1 : -1);
    }

}
