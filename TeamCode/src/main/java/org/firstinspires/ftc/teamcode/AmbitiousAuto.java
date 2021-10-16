package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Autonomous(name="Ambitious Auto",group="Autonomous")

public class AmbitiousAuto extends LinearOpMode{
    private Robot robot=new Robot();

    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);

        waitForStart();


        final ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        executor.schedule(new Runnable() {
            @Override
            public void run() {

            }
        }, 29, TimeUnit.SECONDS);

        //Move forward to shooting position
        robot.robotMotors.moveForward(2600, 0.6);
        robot.robotMotors.moveForward(600, -0.6);
        robot.robotMotors.strafe(2000,'r');
        robot.wobbleGoal.lower();
        //Shoot three times
        robot.s.upFlap();
        robot.robotMotors.turn(9,'r');
        robot.flywheel.launch();
        Thread.sleep(3000);
        for(int i=1; i<=3; i++) {
            robot.s.kick();
            Thread.sleep(1500);
            robot.s.unkick();
            Thread.sleep(1500);
            robot.robotMotors.strafe(200,'r');
            robot.robotMotors.turn(6,'r');
        }
        robot.flywheel.noLaunch();
        //Park on launch line
        robot.robotMotors.moveForward(1000, 0.6);
        robot.wheelStick.intake();
        Thread.sleep(200);
        robot.wheelStick.noIntake();
        robot.s.downFlap();


        executor.schedule(new Runnable() {
            @Override
            public void run() {
                robot.robotMotors.setMotorPower(0);
            }
        }, 5, TimeUnit.SECONDS);

    }
}
