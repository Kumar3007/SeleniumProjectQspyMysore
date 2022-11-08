//program to demonstrate copy content(ctrl+C)
package popup_program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class p7_clipboard_ {
	public static void main(String[] args) throws AWTException {
		
		StringSelection s = new StringSelection("sanju enjoys a lot");//copies the content
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//please press ctrl+V to print this stmt
		
		Robot r=new Robot();
		
		//presses control+v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		//releases control+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//presses and releases enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		}

}
