package com.headfirstlabs.hfdp.template.frame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ihar_Yudziankou on 4/4/2017.
 */
public class MyFrame extends JFrame {
    public MyFrame(final String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(final Graphics g) {
        super.paint(g);
        final String msg = "I rule!!";
        g.drawString(msg, 100, 100);
    }

    public static void main(final String[] args) {
        final MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
