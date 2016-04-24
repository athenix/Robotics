package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.ftcrobotcontroller.opmodes.programs.EdmundTest;
import com.qualcomm.ftcrobotcontroller.opmodes.programs.GTest;
import com.qualcomm.ftcrobotcontroller.opmodes.programs.LogTest;
import com.qualcomm.ftcrobotcontroller.opmodes.programs.Teleop;
import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;

/**
 * Created by Vicky on 3/26/2016.
 */
public class FtcOpModeRegister implements OpModeRegister {
    public void register(OpModeManager manager) {
        manager.register("EdmundTest", EdmundTest.class);
        manager.register("Teleop",Teleop.class);
        manager.register("GTest", GTest.class);
        manager.register("LogTest", LogTest.class);

    }
}
