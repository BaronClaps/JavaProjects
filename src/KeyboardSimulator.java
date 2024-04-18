import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyboardSimulator {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            String text = "Hello, World!";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);
                Thread.sleep(100);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
