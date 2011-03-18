package smartboardgui;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ImagePanel extends Applet
   implements MouseMotionListener {

   public Image backbuffer;
   Graphics backg;

    @Override
   public void init() {
      addMouseMotionListener( this );
   }

   public void mouseMoved( MouseEvent e ) {
      repaint();
   }
   public void mouseDragged( MouseEvent e ) { }

    @Override
   public void update( Graphics g ) {
      g.drawImage( backbuffer, 0, 0, this );
   }

    @Override
   public void paint( Graphics g ) {

      update( g );
   }
}

