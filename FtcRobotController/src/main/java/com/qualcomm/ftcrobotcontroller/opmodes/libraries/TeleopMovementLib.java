package com.qualcomm.ftcrobotcontroller.opmodes.libraries;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


/**
 * Created by Sauhaarda on 4/11/2016.
 */

public class TeleopMovementLib extends LibrarySkeleton {

    DcMotor flmotor;
    DcMotor frmotor;
    DcMotor blmotor;
    DcMotor brmotor;
    DcMotor edmund; // front climber motor named after famous climber sir edmund hillary
    boolean baseMotorsUsed = false;
    boolean edmundUsed = false;

    public TeleopMovementLib(HardwareMap hardwareMap) {
        super(hardwareMap);
    }

    public void initBaseMotors() {
        flmotor = hardwareMap.dcMotor.get("flmotor");
        frmotor = hardwareMap.dcMotor.get("frmotor");
        blmotor = hardwareMap.dcMotor.get("blmotor");
        brmotor = hardwareMap.dcMotor.get("brmotor");
        baseMotorsUsed = true;
        try {
            Thread.sleep(1000);
        }catch(Exception e){

        }
    }

    public void initEdmund() {
        edmund = hardwareMap.dcMotor.get("edmund");
        edmundUsed = true;
        try {
            Thread.sleep(1000);
        }catch(Exception e){

        }
    }

    public void moveFwd(double power) {
        if (!baseMotorsUsed) {
            initBaseMotors();
        }
        flmotor.setPower(power);
        blmotor.setPower(power);
        frmotor.setPower(power);
        brmotor.setPower(power);
    }

    public void moveBwd(double power) {
        if (!baseMotorsUsed) {
            initBaseMotors();
        }
        flmotor.setPower(-power);
        blmotor.setPower(-power);
        frmotor.setPower(-power);
        brmotor.setPower(-power);
    }

    public void turnRgt(double power) {
        if (!baseMotorsUsed) {
            initBaseMotors();
        }
        flmotor.setPower(power);
        blmotor.setPower(power);
        frmotor.setPower(-power);
        brmotor.setPower(-power);
    }

    public void turnLft(double power) {
        if (!baseMotorsUsed) {
            initBaseMotors();
        }
        flmotor.setPower(-power);
        blmotor.setPower(-power);
        frmotor.setPower(power);
        brmotor.setPower(power);
    }

    public void climb(double power, double climbPower) {
        if (!edmundUsed)
            initEdmund();
        if (!baseMotorsUsed)
            initBaseMotors();
        moveFwd(power);
        edmund.setPower(climbPower);
    }
}
