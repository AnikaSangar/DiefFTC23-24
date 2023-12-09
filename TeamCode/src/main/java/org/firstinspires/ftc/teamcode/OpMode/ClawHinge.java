package org.firstinspires.ftc.teamcode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class ClawHinge {
    static Servo clawHinge;

    public static void initClawHinge(Servo cs){
        clawHinge = cs;
    }

    public static void runClawHinge(boolean tempButton1, boolean tempButton2){
        if(tempButton1){
            clawHinge.setPosition(0.5);
        }else if(tempButton2){
            clawHinge.setPosition(0);
        }
    }
}
