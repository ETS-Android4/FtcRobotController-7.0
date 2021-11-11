package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Hardware.Flywheel;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Autonomous(name="WarehouseRed Auto",group="Autonomous")
public class WarehouseRedAuto extends LinearOpMode{
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
        robot.robotMotors.moveForward(2000, 0.8);

        robot.robotMotors.strafe(500,'l');
//        char position = ConceptTensorFlowObjectDetectionWebcam.getposition();
//        if (position = 'l')
//        {
//        lift.LowerLevel();
//        }
//        else if (position = 'c')
//        {
//            lift.MidLevel();
//        }
//        else {
//            lift.TopLevel();
//        }
//        Claw.open();

        robot.robotMotors.moveForward(750, -0.5);
        robot.robotMotors.strafe(2000,'l'); //plan has different value for speed, value is default
//        robot.carouselTurn.runOnce(); //need to make RunOnce method in carousel RedAuto Class
        robot.robotMotors.strafe(200,'r');
        robot.robotMotors.turn(90,'r');
        robot.robotMotors.moveForward(900, 0.4);






        //camera softwars

        /*robot.robotMotors.turn(4,'r');
        robot.flywheel.launch();
        Thread.sleep(3000);
        robot.s.kick();
        Thread.sleep(1500);
        robot.s.unkick();
        Thread.sleep(1500);
        robot.robotMotors.strafe(400,'r');
        robot.robotMotors.turn(4,'r');
        robot.s.kick();
        Thread.sleep(1500);
        robot.s.unkick();
        Thread.sleep(1500);
        robot.robotMotors.strafe(400,'r');
        robot.robotMotors.turn(3,'r');
        robot.s.kick();
        Thread.sleep(1500);
        robot.s.unkick();
        Thread.sleep(1500);
//        for(int i=1; i<=3; i++) {
//            robot.s.kick();
//            Thread.sleep(1500);
//            robot.s.unkick();
//            Thread.sleep(1500);
//            robot.robotMotors.strafe(400,'r');
////            robot.robotMotors.turn(5,'r');
//        }
        robot.flywheel.noLaunch();
        //Park on launch line
        robot.robotMotors.moveForward(800, 0.6);
        robot.wheelStick.intake();
        Thread.sleep(200);
        robot.wheelStick.noIntake();
        robot.s.downFlap();
        Flywheel.maxPower=-.95;

*/
        executor.schedule(new Runnable() {
            @Override
            public void run() {
                robot.robotMotors.setMotorPower(0);


            }
        }, 5, TimeUnit.SECONDS);

    }
}
