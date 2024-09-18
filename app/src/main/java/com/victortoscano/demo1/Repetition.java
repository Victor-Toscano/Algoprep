package com.victortoscano.demo1;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Repetition {

    private Robot robot;
    public int repeat() {
        for(int i=0; i<60; i++) {
            try {
                try {
                    robot = new Robot();
                    robot.setAutoDelay(500);
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.setAutoDelay(100);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    robot.keyRelease(KeyEvent.VK_TAB);
                } catch (AWTException e) {
                    e.printStackTrace();
                }

                Thread.sleep(60000);

            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Minutes: " + i);
        }
        return 1;
    }
}
