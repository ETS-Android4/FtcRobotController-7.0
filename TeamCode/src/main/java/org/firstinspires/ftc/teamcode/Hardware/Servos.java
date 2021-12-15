package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

public class Servos {


    private Servo drop;

    private final double DROP_OPEN = 0.85; //numbers subject to change
    private final double DROP_CLOSE = 0.7; //numbers subject to change

    public Servos(Servo d)
    {
        //servo hardware moments
//        r.setDirection(Servo.Direction.FORWARD);
        d.setDirection(Servo.Direction.FORWARD);

        drop = d;

    }

    public void open() {drop.setPosition(DROP_OPEN); }
//
    public void close() {drop.setPosition(DROP_CLOSE);}

    public double getPosition()
    {
        return drop.getPosition();
    }
}
