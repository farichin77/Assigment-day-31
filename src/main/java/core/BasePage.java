package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    private boolean slowMode = true;  // aktifkan slow mode global
    private int delayMs = 2000;       // delay default 2 detik

    public BasePage() {
        this.driver = core.DriverManager.getDriver();
    }

    // Helper untuk delay
    private void slow() {
        if (slowMode) {
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
        slow(); // delay setelah click
    }

    protected void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        String text = driver.findElement(locator).getText();
        return text;
    }

    // Opsional: setter untuk mengubah delay runtime
    public void setSlowMode(boolean slowMode) {
        this.slowMode = slowMode;
    }

    public void setDelayMs(int delayMs) {
        this.delayMs = delayMs;
    }
}

