package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Lift {
    public DcMotor liftMotor;

    public static double maxPower = 0.8;
    private static final double TICKS_PER_REVOLUTION = 1425.1;

    public Lift(DcMotor l) {
        l.setPower(0);
        l.setDirection(DcMotor.Direction.FORWARD);
        l.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        l.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
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
        liftMotor.setTargetPosition((int)TICKS_PER_REVOLUTION/7); //value is subject to change
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor.setPower(maxPower);
        reached(liftMotor.getTargetPosition());
    }
    public void liftMidLevel() {
        liftMotor.setTargetPosition((int)(TICKS_PER_REVOLUTION*(2.0/7))); //value is subject to change
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor.setPower(maxPower);
        reached(liftMotor.getTargetPosition());
    }
    public void liftUpperLevel() {
        liftMotor.setTargetPosition((int)(TICKS_PER_REVOLUTION*(3.0/7))); //value is subject to change
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor.setPower(maxPower);
        reached(liftMotor.getTargetPosition());
    }

    private void reached(int target)
    {
        while(!(liftMotor.getCurrentPosition()>=target-3 && liftMotor.getCurrentPosition()<=target+3))
        {

        }
        liftMotor.setPower(0);
    }
}