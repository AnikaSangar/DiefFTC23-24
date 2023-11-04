package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

public class HingeServo {

    static Servo hingeServo;

    public static void hingeServoInit(Servo s) {
        hingeServo = s;
    }

    public static void runHingeServo(boolean tempButton4) {
        hingeServo.setPosition(tempButton4 ? 0.125 : 0);
    }

}
