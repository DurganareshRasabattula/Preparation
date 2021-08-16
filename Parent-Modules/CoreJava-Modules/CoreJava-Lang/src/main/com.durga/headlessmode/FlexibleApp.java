package headlessmode;

import javax.swing.*;
import java.awt.*;

/**
 * @author durga on 8/12/2021
 */
public class FlexibleApp {
    public static final int HEADLESS = 0;
    public static final int HEADED = 1;
    public FlexibleApp() {

        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Hello World");
        } else {
            JOptionPane.showMessageDialog(null, "Hello World");
        }

    }

    public static int iAmFlexible() {
        if (GraphicsEnvironment.isHeadless()) {
            return HEADLESS;
        } else {
            return HEADED;
        }
    }
}
