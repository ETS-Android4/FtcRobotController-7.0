package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Lift {
    public DcMotor liftMotor;

    public Lift(DcMotor l) {
        l.setPower(0);
        l.setDirection(DcMotor.Direction.FORWARD);
        l.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        l.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        l.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        l.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        l.setPower(0.8);
        //145.1 Ticks Per Revolution

        liftMotor = l;
    }

    public static double maxPower = 1;

    public void backToBase()
    {
        liftMotor.setTargetPosition(0);
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    public void liftLowerLevel() {
        liftMotor.setTargetPosition((int)145.1/7); //value is subject to change
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    }
    public void liftMidLevel() {
        liftMotor.setTargetPosition((int)(145.1*(2/7))); //value is subject to change
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    }
    public void liftUpperLevel() {
        liftMotor.setTargetPosition((int)(145.1*(3/7))); //value is subject to change
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    }
}