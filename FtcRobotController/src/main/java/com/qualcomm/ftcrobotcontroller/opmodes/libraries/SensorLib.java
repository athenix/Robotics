package com.qualcomm.ftcrobotcontroller.opmodes.libraries;

import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by Sauhaarda on 4/10/2016.
 */
public class SensorLib extends LibrarySkeleton {

    TouchSensor touch;
    GyroSensor sensorGyro;
    HardwareMap hardwareMap;

    boolean touchUsed;

    public SensorLib(HardwareMap hardwareMap) {
        super(hardwareMap);
    }

    public void initTouch() {
        hardwareMap.touchSensor.get("touch");
    }

    public boolean touched() {
        if (!touchUsed)
            initTouch();

        return touch.isPressed();
    }

}
