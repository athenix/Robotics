package com.qualcomm.ftcrobotcontroller.opmodes.programs;

import com.qualcomm.ftcrobotcontroller.opmodes.libraries.MovementLib;
import com.qualcomm.ftcrobotcontroller.opmodes.libraries.SensorLib;

/**
 * Created by Sauhaarda on 4/11/2016.
 */
public class EdmundTest extends ProgramSkeleton{

    public void runOpMode() throws InterruptedException {

        sensorLib = new SensorLib(hardwareMap);
        telemetry.addData("Sensor Lib Passed","");
        movementLib = new MovementLib(hardwareMap);
        telemetry.addData("Movement Lib Passed","");
        initProgram();
        telemetry.addData("Init Passed", "");
        while (true) {
            loopProgram();
            telemetry.addData("Loop Error","");
        }
    }

    public void initProgram(){
        movementLib.climb(0.4, 0.5);
    }
    public void loopProgram(){

    }
}
