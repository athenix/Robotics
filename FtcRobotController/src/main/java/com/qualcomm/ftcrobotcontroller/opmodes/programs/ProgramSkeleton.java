package com.qualcomm.ftcrobotcontroller.opmodes.programs;

import com.qualcomm.ftcrobotcontroller.opmodes.libraries.MovementLib;
import com.qualcomm.ftcrobotcontroller.opmodes.libraries.SensorLib;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by Sauhaarda on 4/11/2016.
 */
public abstract class ProgramSkeleton extends LinearOpMode {
    SensorLib sensorLib;
    MovementLib movementLib;

    public ProgramSkeleton() {
        sensorLib = new SensorLib(hardwareMap);
        movementLib = new MovementLib(hardwareMap);
    }

    public void runOpMode() throws InterruptedException {
        initProgram();
        while (true) {
            loopProgram();
        }
    }

    public abstract void initProgram();

    public abstract void loopProgram();
}
