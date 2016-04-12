package com.qualcomm.ftcrobotcontroller.opmodes.libraries;

import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Sauhaarda on 4/10/2016.
 */
public abstract class LibrarySkeleton {
    HardwareMap hardwareMap;

    public LibrarySkeleton(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
    }


}
