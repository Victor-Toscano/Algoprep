package croutine;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Routine {

    private Robot robot;
    public int repeat() {
        for (int i = 0; i < 60; i++) {
            try {
                try {
                    pressKeys();
                    Thread.sleep(50);
                    pressKeys();
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

    private void pressKeys() throws AWTException, InterruptedException {
        robot = new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);
        //robot.setAutoDelay(500);
        Thread.sleep(50);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_TAB);
    }
}
