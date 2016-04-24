package com.qualcomm.ftcrobotcontroller.opmodes.libraries;

/**
 * Created by Sauhaarda on 4/23/2016.
 */
public class Utilities {
    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {}
    }
    public static double trim(double input){
        return Math.min(1,Math.max(0,input));
    }
}
