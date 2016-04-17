package com.qualcomm.ftcrobotcontroller.opmodes.programs;

import com.qualcomm.ftcrobotcontroller.opmodes.libraries.TeleopMovementLib;
import com.qualcomm.ftcrobotcontroller.opmodes.libraries.SensorLib;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by Sauhaarda on 4/11/2016.
 */
public abstract class ProgramSkeleton extends LinearOpMode {
    SensorLib sensorLib;
    TeleopMovementLib teleopMovementLib;

    public void runOpMode() throws InterruptedException {
        sensorLib = new SensorLib(hardwareMap);
        teleopMovementLib = new TeleopMovementLib(hardwareMap);
        initProgram();
        while (true) {
            loopProgram();
        }
    }

    public abstract void initProgram();

    public abstract void loopProgram();
}
