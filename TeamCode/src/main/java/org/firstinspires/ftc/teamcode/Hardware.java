package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Hardware {



    DcMotor frontRight;         //Hub 3 Motor 0
    DcMotor frontLeft;          //Hub 3 Motor 1
    DcMotor backRight;          //Hub 3 Motor 2
    DcMotor backLeft;           //Hub 3 Motor 3

    private BNO055IMU imu;

    DcMotor hangLift;           //Hub 2 Motor 1 (top) AND GoBilda 5202 Series Yellow
    CRServo markerDrop;         // Hub 3 Servo 0
    Servo latch;               //Hub 3 Servo 1


    HardwareMap hwMap;
    private ElapsedTime period = new ElapsedTime();


        public Hardware(){

        }


        public void init (HardwareMap ahwMap){
            hwMap = ahwMap;
            initDevices();
            initMotorSettings();
            initDefaultPosition();
        }


        private void initDevices () {
            // Initialise all parts connected to the expansion hubs
        }

        private void initMotorSettings () {
            // Set motor Mode and Direction


        }

        private void initDefaultPosition () {
            // Set default positions for motors.
        }

        public void waitForTick (long periodMs) throws InterruptedException {
            long remaining = periodMs - (long) period.milliseconds();

            if (remaining > 0)
                Thread.sleep(remaining);

            period.reset();
        }
}