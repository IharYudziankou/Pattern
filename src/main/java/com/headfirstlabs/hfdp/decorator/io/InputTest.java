package com.headfirstlabs.hfdp.decorator.io;

import java.io.*;
import java.net.URL;

/**
 * Created by Ihar_Yudziankou on 3/31/2017.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(getFilename())));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getFilename() {
        return InputTest.class.getClassLoader().getResource("text.txt").getFile();
    }
}
