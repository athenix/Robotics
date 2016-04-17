package com.qualcomm.ftcrobotcontroller.opmodes.programs;

/**
 * Created by Sauhaarda on 4/16/2016.
 */
public class Teleop extends ProgramSkeleton {


    public void initProgram() {

    }

    public void loopProgram() {
        powerManagement();
        movementManagement();
    }

    boolean press = false;
    double movePower = 0.5, climbPower = 0.5;

    public void powerManagement() {
        if (gamepad1.y && (!press)) {
            movePower += 0.1;
            press = true;
        } else if (gamepad1.a && (!press)) {
            movePower -= 0.1;
            press = true;
        } else if (gamepad1.x && (!press)) {
            climbPower -= 0.1;
            press = true;
        } else if (gamepad1.b && (!press)) {
            climbPower += 0.1;
            press = true;
        } else {
            press = false;
        }
        telemetry.addData("Move Power: ", movePower);
        telemetry.addData("Climb Power: ", climbPower);
    }

    public void movementManagement() {
        if (gamepad1.right_bumper && gamepad1.y) {
            teleopMovementLib.climb(movePower, climbPower);
        }
        if (gamepad1.y) { // move forward
            teleopMovementLib.moveFwd(movePower);
        }
        if (gamepad1.a) { // move bwd
            teleopMovementLib.moveBwd(movePower);
        }
        if (gamepad1.x) { // turn left
            teleopMovementLib.turnLft(movePower);
        }
        if (gamepad1.b) { // turn right
            teleopMovementLib.turnRgt(movePower);
        }
    }


}
