/*
 * SmartBoardGUIApp.java
 */

package smartboardgui;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteGlassLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;

/**
 * The main class of the application.
 */
public class SmartBoardGUIApp extends SingleFrameApplication{

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        JDialog.setDefaultLookAndFeelDecorated(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
      SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        try {
          UIManager.setLookAndFeel(new SubstanceGraphiteGlassLookAndFeel());
           show(new SmartBoardGUIView(SmartBoardGUIApp.getApplication()));
        } catch (Exception e) {
          System.out.println("Substance Graphite failed to initialize");
        }
        }
     
      });
        
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {

    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of SmartBoardGUIApp
     */
    public static SmartBoardGUIApp getApplication() {
        return Application.getInstance(SmartBoardGUIApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
      //  JFrame.setDefaultLookAndFeelDecorated(true);
        launch(SmartBoardGUIApp.class, args);
    }
}
