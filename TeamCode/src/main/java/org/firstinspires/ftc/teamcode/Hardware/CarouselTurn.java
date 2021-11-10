package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;

public class CarouselTurn {
    public DcMotor turnMotor;

    public CarouselTurn(DcMotor t)
    {
        t.setPower(0);
        t.setDirection(DcMotor.Direction.FORWARD);
        t.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        t.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


        turnMotor=t;
    }
private final int FULL_ROTATION=1000; //time for the carousel to spin once completely. subject to change.
    public static double maxPower=0.8;

    public void startTurn()
    {
        turnMotor.setPower(maxPower);
    }

    public void stopTurn() { turnMotor.setPower(0); }

    public void runOnce() throws InterruptedException
    {
        startTurn();
        Thread.sleep(FULL_ROTATION);
        stopTurn();
    }

}
