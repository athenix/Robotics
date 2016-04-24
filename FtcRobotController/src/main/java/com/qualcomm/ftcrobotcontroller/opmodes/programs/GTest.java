package com.qualcomm.ftcrobotcontroller.opmodes.programs;

import com.qualcomm.ftcrobotcontroller.opmodes.libraries.Utilities;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by kevin on 4/23/2016.
 */
public class GTest extends ProgramSkeleton {
    public void initProgram() {
        sensorLib.calibrateGyro();
        actuatorLib.turnPedestal(45);
    }

    public void loopProgram() {
        telemetry.addData("Gyro Position: ", sensorLib.getGyroPosition());
    }
}
