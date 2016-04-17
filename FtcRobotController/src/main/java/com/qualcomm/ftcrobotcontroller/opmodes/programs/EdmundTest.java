package com.qualcomm.ftcrobotcontroller.opmodes.programs;

import com.qualcomm.ftcrobotcontroller.opmodes.libraries.TeleopMovementLib;
import com.qualcomm.ftcrobotcontroller.opmodes.libraries.SensorLib;

/**
 * Created by Sauhaarda on 4/11/2016.
 */
public class EdmundTest extends ProgramSkeleton{

    public void initProgram(){
        teleopMovementLib.climb(0.4, 0.5);
    }
    public void loopProgram(){

    }
}
