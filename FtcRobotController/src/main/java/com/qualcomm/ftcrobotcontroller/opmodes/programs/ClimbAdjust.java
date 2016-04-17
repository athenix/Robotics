package com.qualcomm.ftcrobotcontroller.opmodes.programs;

import com.qualcomm.ftcrobotcontroller.opmodes.libraries.MovementLib;
import com.qualcomm.ftcrobotcontroller.opmodes.libraries.SensorLib;

/**
 * Created by David on 4/16/2016.
 */
public class ClimbAdjust extends ProgramSkeleton{
    // a and b are the powers for the climb
    double a = 0.0,b=0.0;

    public void runOpMode() throws InterruptedException {
        sensorLib = new SensorLib(hardwareMap);
        movementLib = new MovementLib(hardwareMap);
        initProgram();
        while (true) {
            loopProgram();
        }
    }


    public void initProgram(){
        movementLib.climb(a, b);
    }
    public void loopProgram(){
        //You can only adjust one thing at a time
        /*
        When not pressed run button control, then gets stuck in while loop till released, where it sets it back to false
        Adjust power for climbing powers
         */
        boolean press = false;
        if(gamepad1.y &&(press=false)){
            a+=0.1;
            press = true;
            while(press){
            }
            press = false;
        }
        if(gamepad1.a&&(press=false)){
            a-=0.1;
            press = true;
            while(press){
            }
            press = false;
        }
        if(gamepad1.x&&(press=false)){
            b+=0.1;
            press = true;
            while(press){
            }
            press = false;


        }
        if(gamepad1.b&&(press=false)){
            b-=0.1;
            press = true;
            while(press){
            }
            press = false;
        }
    }
}
