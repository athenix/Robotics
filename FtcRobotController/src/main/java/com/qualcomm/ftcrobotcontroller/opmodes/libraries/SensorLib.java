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
    int heading = 0;
    HardwareMap hardwareMap;

    boolean touchUsed;
    boolean gyroUsed;

    public SensorLib(HardwareMap hardwareMap) {
        super(hardwareMap);
    }

    public void initTouch() {
        hardwareMap.touchSensor.get("touch");
    }

    public void initGyro() {
        sensorGyro = hardwareMap.gyroSensor.get("gyro");
        calibrateGyro();
    }

    public void calibrateGyro() {
        if (!gyroUsed) {
            gyroUsed = true;
            initGyro();
            return;
        }
        //calibrate the gyro
        sensorGyro.calibrate();

        //make sure the gyro is calibrated
        while (sensorGyro.isCalibrating()) {
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }

        }
    }

    public boolean touched() {
        if (!touchUsed) {
            touchUsed = true;
            initTouch();
        }

        return touch.isPressed();
    }

    public int getGyroPosition() {
        if (!gyroUsed) {
            gyroUsed = true;
            initGyro();
        }
        return sensorGyro.getHeading();
    }

}
