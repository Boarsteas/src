package testZ;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class robot {

    public static void keypress(String ein){
        try {
            Robot r = new Robot();
            switch (ein) {
                case "p1":
                    r.keyPress(KeyEvent.VK_1);
                    break;
                case "r1":
                    r.keyRelease(KeyEvent.VK_1);
                    break;
                case "p2":r.keyPress(KeyEvent.VK_2);
                    break;
                case "p3":r.keyPress(KeyEvent.VK_3);
                    break;
                case "p4":r.keyPress(KeyEvent.VK_4);
                    break;
                case "p5":r.keyPress(KeyEvent.VK_5);
                    break;
                case "p6":r.keyPress(KeyEvent.VK_6);
                    break;
                case "p7":r.keyPress(KeyEvent.VK_7);
                    break;
                case "p8":r.keyPress(KeyEvent.VK_7);
                    break;
                case "p9":r.keyPress(KeyEvent.VK_9);
                    break;
                case "p0":r.keyPress(KeyEvent.VK_0);
                    break;
            }
        }
            catch (AWTException e) {
            e.printStackTrace();
        }



    }
    }
   /* try {

        Robot robot = new Robot();
        // Creates the delay of 5 sec so that you can open notepad before
        // Robot start writting
        robot.setAutoDelay(5);

        robot.delay(5000);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_PERIOD);
        robot.keyRelease(KeyEvent.VK_PERIOD);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    } catch (AWTException e) {
        e.printStackTrace();
    }*/

    public static void main(String[] args) {
        Thread.sleep(300);
        keypress("p1");
        keypress("p2");
        keypress("p3");
        keypress("p4");


    }
}