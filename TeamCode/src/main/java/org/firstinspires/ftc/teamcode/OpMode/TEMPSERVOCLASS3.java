package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.Servo;

public class TEMPSERVOCLASS3 {

    static Servo tempServo3;

    public static void tempServo3Init(Servo s) {
        tempServo3 = s;
    }

    public static void runTempServo3(boolean tempButton3) {
        tempServo3.setPosition(tempButton3 ? 1 : -1);
    }

}
