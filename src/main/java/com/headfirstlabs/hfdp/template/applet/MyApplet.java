package com.headfirstlabs.hfdp.template.applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class MyApplet extends Applet {
    String message;

    @Override
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    @Override
    public void destroy() {
        //
    }

    @Override
    public void paint(final Graphics g) {
        g.drawString(message, 5, 15);
    }
}
