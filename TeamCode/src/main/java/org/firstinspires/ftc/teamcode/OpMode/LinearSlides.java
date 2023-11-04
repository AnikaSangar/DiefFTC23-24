package org.firstinspires.ftc.teamcode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class LinearSlides {

    static DcMotor leftLin;
    static DcMotor rightLin;

    public static void initLinSlides(DcMotor lm, DcMotor rm) {
        leftLin = lm;
        rightLin = rm;
    }

    public static void runLinSlides(float tempTrig, float  tempTrig2) {
        if(tempTrig > 0) {
            leftLin.setPower(tempTrig);
            rightLin.setPower(tempTrig);
        } else if(tempTrig2 > 0) {
            leftLin.setPower(-tempTrig2);
            rightLin.setPower(-tempTrig2);
        } else {
            leftLin.setPower(0);
            rightLin.setPower(0);
        }
    }

}
