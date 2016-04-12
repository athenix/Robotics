package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Vicky on 3/26/2016.
 */
public class MotorTest extends LinearOpMode {
    public void runOpMode() {

        DcMotor blmotor = hardwareMap.dcMotor.get("blmotor");
        DcMotor brmotor = hardwareMap.dcMotor.get("brmotor");
        DcMotor flmotor = hardwareMap.dcMotor.get("flmotor");
        DcMotor frmotor = hardwareMap.dcMotor.get("frmotor");
        frmotor.setDirection(DcMotor.Direction.REVERSE);
        brmotor.setDirection(DcMotor.Direction.REVERSE);
        while (true) {
            if (gamepad1.y) {
                blmotor.setPower(0.75);
                brmotor.setPower(0.75);
                flmotor.setPower(0.75);
                frmotor.setPower(0.75);
            } else if (gamepad1.a) {
                blmotor.setPower(-0.75);
                brmotor.setPower(-0.75);
                flmotor.setPower(-0.75);
                frmotor.setPower(-0.75);
            } else if (gamepad1.b) {
                blmotor.setPower(0.75);
                brmotor.setPower(-0.75);
                flmotor.setPower(0.75);
                frmotor.setPower(-0.75);
            } else if (gamepad1.x) {
                blmotor.setPower(-0.75);
                brmotor.setPower(0.75);
                flmotor.setPower(-0.75);
                frmotor.setPower(0.75);
            } else {
                blmotor.setPower(0);
                brmotor.setPower(0);
                flmotor.setPower(0);
                frmotor.setPower(0);

            }
        }
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {

        }
    }

}
