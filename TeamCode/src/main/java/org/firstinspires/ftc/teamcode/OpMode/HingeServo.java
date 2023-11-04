package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

public class HingeServo {

    static Servo hingeServo;

    public static void hingeServoInit(Servo s) {
        hingeServo = s;
    }

    public static void runHingeServo(boolean tempButton4, boolean tempButton5) {
        if(tempButton4) {
            hingeServo.setPosition(0.25);
        } else if (tempButton5) {
            hingeServo.setPosition(0);
        }
    }

}
