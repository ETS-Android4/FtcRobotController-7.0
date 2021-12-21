package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Lift {
    public DcMotor liftMotor;

    public static double maxPower = 1;
    private static final double TICKS_PER_REVOLUTION = 751.8*24; //worm gear has ratio of 24:1

    public Lift(DcMotor l) {
        l.setPower(0);
        l.setDirection(DcMotor.Direction.FORWARD);
        l.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        l.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        l.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        l.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//        l.setPower(0.8);

        liftMotor = l;
    }


    public void backToBase()
    {
        liftMotor.setTargetPosition(0);
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor.setPower(maxPower);
        reached(liftMotor.getTargetPosition());
    }
    public void liftLowerLevel() {
        liftMotor.setTargetPosition((int)(TICKS_PER_REVOLUTION*0.6/7)); //value is subject to change
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor.setPower(maxPower);
        reached(liftMotor.getTargetPosition());
    }
    public void liftMidLevel() {
        liftMotor.setTargetPosition((int)(TICKS_PER_REVOLUTION*1.2/7)); //value is subject to change
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor.setPower(maxPower);
        reached(liftMotor.getTargetPosition());
    }
    public void liftUpperLevel() {
        liftMotor.setTargetPosition((int)(TICKS_PER_REVOLUTION*(1.9/7))); //value is subject to change
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor.setPower(maxPower);
        reached(liftMotor.getTargetPosition());
    }

    public void moveUpWithoutEncoders() {
        liftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        liftMotor.setPower(0.4);
    }

    public void moveDownWithoutEncoders() {
        liftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        liftMotor.setPower(-0.4);
    }

    public void reset() {
        liftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    private void reached(int target)
    {
        while(!(liftMotor.getCurrentPosition()>=target-3 && liftMotor.getCurrentPosition()<=target+3))
        {

        }
        liftMotor.setPower(0);
    }
}