package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.Servo;

public class HatchServo {

    static Servo hatchServo;

    public static void hatchServoInit(Servo s) {
        hatchServo = s;
    }

    public static void runHatchServo(boolean tempButton) {
        hatchServo.setPosition(tempButton ? 0.25 : 0);
    }

}
