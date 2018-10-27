package com.example.aishmano.myapplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Insert {

    //get info to database
    public static void pushInfo(String info, String file) {
        BufferedWriter np = null;

        try {
            np = new BufferedWriter(new FileWriter(file, true));
            np.write(info);
            np.newLine();
            np.flush();
        } catch (java.io.IOException ioe) {

        }
        try {
            np.close();
        } catch (IOException a) {
        }
    }
}
