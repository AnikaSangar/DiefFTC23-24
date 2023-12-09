package org.firstinspires.ftc.teamcode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class OtherHinge {
    static Servo hinge;

    public static void initHinge(Servo s){
        hinge = s;
    }

    public static void runHinge(boolean tempbutton6, boolean tempbutton7){
        if(tempbutton6){
            hinge.setPosition(0.25);
        }else if(tempbutton7){
            hinge.setPosition(-0.25);
            hinge.setDirection(Servo.Direction.REVERSE);
        }
    }

}
