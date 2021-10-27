package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

public class Servos {


    private Servo flap;             // Hub 3 Servo Slot 3
    private Servo kick;             // Hub 3 Servo Slot 2
    private Servo latch;
    private CRServo buffer;
    private Servo drop;

    private final double FLAP_UP = 0.45;
    private final double FLAP_DOWN = 0;

    private final double KICK_IN = 0.3;
    private final double KICK_OUT = 0.04;

    private final double LATCH_ON = 1;
    private final double LATCH_OFF = 0.55;

    private final double DROP_DOWN = 1; //numbers subject to change
    private final double DROP_UP = 0.5; //numbers subject to change

    public Servos(Servo d)
    {
        //servo hardware moments
//        r.setDirection(Servo.Direction.FORWARD);
        d.setDirection(Servo.Direction.FORWARD);

        drop = d;

//        latch.setPosition(LATCH_ON);
    }

    public void downFlap() {
        flap.setPosition(FLAP_DOWN);
    }

    public void upFlap() {
        flap.setPosition(FLAP_UP);
    }

    public void unkick() {
        kick.setPosition(KICK_IN);
    }

    public void kick() {
        kick.setPosition(KICK_OUT);
    }

    public void latch() {latch.setPosition(LATCH_ON);}

    public void unlatch() {latch.setPosition(LATCH_OFF);}

    public void onBuffer() {buffer.setPower(1);}

    public void offBuffer() {buffer.setPower(0);}

    public void dDown() {drop.setPosition(DROP_DOWN);}

    public void dUp() {drop.setPosition(DROP_UP);}
}
