package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Vicky on 3/26/2016.
 */
public class SingleMotorTest extends OpMode {
    public void init() {

        DcMotor blmotor = hardwareMap.dcMotor.get("blmotor");
        DcMotor brmotor = hardwareMap.dcMotor.get("brmotor");
        DcMotor flmotor = hardwareMap.dcMotor.get("flmotor");
        DcMotor frmotor = hardwareMap.dcMotor.get("frmotor");
        if(gamepad1.y){
            blmotor.setPower(0.75);
            sleep(500);
            blmotor.setPower(0);
            brmotor.setPower(0.75);
            sleep(500);
            brmotor.setPower(0);
            flmotor.setPower(0.75);
            sleep(500);
            flmotor.setPower(0);
            frmotor.setPower(0.75);
            sleep(500);
            frmotor.setPower(0);
        }
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {

        }
    }

    public void loop() {

    }
}
