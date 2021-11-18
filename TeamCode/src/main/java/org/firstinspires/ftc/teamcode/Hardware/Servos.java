package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

public class Servos {


    private Servo drop;

    private final double DROP_DOWN = 1; //numbers subject to change
    private final double DROP_UP = 0.5; //numbers subject to change

    public Servos(Servo d)
    {
        //servo hardware moments
//        r.setDirection(Servo.Direction.FORWARD);
        d.setDirection(Servo.Direction.FORWARD);

        drop = d;

    }

    public void open() {drop.setPosition(DROP_DOWN);}
//
    public void close() {drop.setPosition(DROP_UP);}
}
