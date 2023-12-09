package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.Servo;

public class Claw {

    static Servo clawRight;
    static Servo clawLeft;

    public static void initClaw(Servo rs, Servo ls) {
        clawRight = rs;
        clawLeft = ls;
    }


    public static void runClaw(boolean tempButton4, boolean tempButton5) {
        if(tempButton4) {
            clawRight.setPosition(0.25);
            clawLeft.setPosition(-0.25);
        } else if (tempButton5) {
            clawRight.setPosition(0);
            clawLeft.setPosition(0);
        }
    }

}
