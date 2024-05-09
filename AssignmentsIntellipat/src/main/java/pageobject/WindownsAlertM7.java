package pageobject;

import org.openqa.selenium.By;
import reusable.BaseCode;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class WindownsAlertM7 extends BaseCode {

 public static void clickButton()
 {
    driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
 }

 public static void uploadFiles() throws AWTException, InterruptedException {
     StringSelection s = new StringSelection("C:\\Users\\Asus\\Desktop\\New Microsoft Word Document.docx");
     Thread.sleep(3000);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
     Thread.sleep(3000);
     Robot r = new Robot();
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_V);
     Thread.sleep(3000);
     r.keyRelease(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_CONTROL);
     Thread.sleep(10000);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(13000);
 }
public static void clickDownloadButton() throws InterruptedException {
    driver.findElement(By.xpath("//span[text()='Download']")).click();
    Thread.sleep(3000);
}

}
