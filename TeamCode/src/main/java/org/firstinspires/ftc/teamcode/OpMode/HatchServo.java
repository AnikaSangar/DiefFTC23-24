package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.Servo;

public class HatchServo {

    static Servo hatchServo;

    public static void hatchServoInit(Servo s) {
        hatchServo = s;
    }

    public static void runHatchServo(boolean tempButton, boolean tempButton2) {
        if(tempButton) {
            hatchServo.setPosition(0.25);
        } else if (tempButton2) {
            hatchServo.setPosition(0);
        }
    }

}
