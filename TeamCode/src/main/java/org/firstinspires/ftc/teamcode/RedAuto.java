package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.CameraDirection;
import org.firstinspires.ftc.robotcore.external.tfod.TFObjectDetector;
import org.firstinspires.ftc.robotcore.external.tfod.Recognition;

import java.util.ArrayList;
import java.util.List;

@Autonomous(name = "RedAuto", group = "Autonomous")
public class RedAuto extends LinearOpMode {

    Hardware robot = new Hardware();
    AutonomousTools auto = new AutonomousTools();
//    ArrayList<DcMotor> wheels = new ArrayList<>();
    robot.init(hardwareMap);
    public void runOpMode() throws InterruptedException {
    
    //        wheels.add(hardware.frontLeft);
    //        wheels.add(hardware.frontRight);
    //        wheels.add(hardware.backLeft);
    //        wheels.add(hardware.backRight);  What is this for? - Arjun
    
        
        
        hardware.init(hardwareMap, true);
        waitForStart();
        auto.tfod.activate();

        if (auto.tfod != null) {



        }
    }
}
