package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.ftcrobotcontroller.opmodes.programs.EdmundTest;
import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;
import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;

/**
 * Created by Vicky on 3/26/2016.
 */
public class FtcOpModeRegister implements OpModeRegister {
    public void register(OpModeManager manager) {
        manager.register("EdmundTest", EdmundTest.class);
    }
}
