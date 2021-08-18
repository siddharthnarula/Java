import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
public class Mouse extends Applet implements MouseListener 
{ 
public void init() 
{ 
this.addMouseListener (this); 
} 
public void mouseClicked(MouseEvent m) 
{ 
 int x = m.getX(); 
 int y = m.getY(); 
 String str = "x =" +x+",y = "+y; 
 showStatus(str); 
} 
    @Override
    public void mousePressed(MouseEvent e) {        
}
    @Override
    public void mouseReleased(MouseEvent e) {          
    } 
    @Override
    public void mouseEntered(MouseEvent e) {    
    }
    @Override
    public void mouseExited(MouseEvent e) {
    } 
}
