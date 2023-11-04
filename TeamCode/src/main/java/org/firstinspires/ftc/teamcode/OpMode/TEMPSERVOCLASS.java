package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.Servo;

public class TEMPSERVOCLASS {

    static Servo tempServo;

    public static void tempServoInit(Servo s) {
        tempServo = s;
    }

    public static void runTempServo(boolean tempButton) {
        tempServo.setPosition(tempButton ? 1 : -1);
    }

}
