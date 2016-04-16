package com.qualcomm.ftcrobotcontroller.opmodes.programs;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Sauhaarda on 4/12/2016.
 */
public class SampleCrappyTest extends OpMode {
    DcMotor flmotor;
    DcMotor frmotor;
    DcMotor blmotor;
    DcMotor brmotor;
    DcMotor edmund; // front climber motor named after famous climber sir edmund hilary

    public void init() {
        flmotor = hardwareMap.dcMotor.get("flmotor");
        frmotor = hardwareMap.dcMotor.get("frmotor");
        blmotor = hardwareMap.dcMotor.get("blmotor");
        brmotor = hardwareMap.dcMotor.get("brmotor");
        edmund = hardwareMap.dcMotor.get("edmund");
        frmotor.setDirection(DcMotor.Direction.REVERSE);
        brmotor.setDirection(DcMotor.Direction.REVERSE);
        edmund.setDirection(DcMotor.Direction.REVERSE);
        flmotor.setPower(0.75);
        frmotor.setPower(0.75);
        blmotor.setPower(0.75);
        brmotor.setPower(0.75);
        edmund.setPower(0.75);


    }

    public void loop() {

    }
}
