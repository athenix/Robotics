package com.qualcomm.ftcrobotcontroller.opmodes.libraries;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Sauhaarda on 4/23/2016.
 */

class ServoObject {
    Servo servo;
    int range;
    double position;

    public void turn(int degrees) {
        double degreeToServoMap = 1 / range;
        servo.setPosition(Utilities.trim(position + (degrees * degreeToServoMap)));
    }

    public void set(int degrees) {
        double degreeToServoMap = 1 / range;
        servo.setPosition(Utilities.trim(degrees * degreeToServoMap));
    }

    public ServoObject(String name, HardwareMap hm, int range, int initPosition) {
        servo = hm.servo.get("pedestal");
        this.range = range;
        servo.setPosition(initPosition);
        position = initPosition;
    }
}

public class ActuatorLib extends LibrarySkeleton {
    ServoObject pedestal;
    boolean pedestalUsed = false;

    public void setPedestal(int degrees) {
        if (!pedestalUsed) {
            pedestalUsed = true;
            pedestal = new ServoObject("pedestal", hardwareMap, 180, 0);
        }
        pedestal.set(degrees);
    }

    public void turnPedestal(int degrees) {
        if (!pedestalUsed) {
            pedestalUsed = true;
            pedestal = new ServoObject("pedestal", hardwareMap, 180, 0);
        }
        pedestal.turn(degrees);
    }

    public ActuatorLib(HardwareMap hardwareMap) {
        super(hardwareMap);
    }
}
