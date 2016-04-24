package com.qualcomm.ftcrobotcontroller.opmodes.programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by Sauhaarda on 4/16/2016.
 */
public class LogTest extends ProgramSkeleton {


    public void initProgram() {

        try{
            Writer output = null;
            File file = new File("mnt/sdcard/DCIM/log.txt");
            output = new BufferedWriter(new FileWriter(file));

            output.close();
            System.out.println("File has been written");

        }catch(Exception e){
            System.out.println("Could not create file");
        }

    }

    public void loopProgram() {

    }

}