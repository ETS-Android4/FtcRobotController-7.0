package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Lift {
    public DcMotor liftMotor;

    public Lift(DcMotor l) {
        l.setPower(0);
        l.setDirection(DcMotor.Direction.FORWARD);
        l.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        liftMotor = l;
    }

    public static double maxPower = 1;

    public void startLift()
    {
        liftMotor.setPower(maxPower);
    }
    public void reverseLift()
    {
        liftMotor.setPower(-maxPower);
    }
    public void stopLift() { liftMotor.setPower(0); }

    public void backToBase()
    {
        liftMotor.setTargetPosition(0);
    }
    public void liftLowerLevel() {
        liftMotor.setTargetPosition(5); //value is subject to change
    }
    public void liftMidLevel() {
        liftMotor.setTargetPosition(10); //value is subject to change
    }
    public void liftUpperLevel() {
        liftMotor.setTargetPosition(15); //value is subject to change
    }
}