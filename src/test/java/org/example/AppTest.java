package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void primerMetodo() throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("https://oktana-1fb-dev-ed.my.salesforce.com/");

        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement botonAzul = driver.findElement(By.xpath("//input[@id='Login']"));

        usernameField.sendKeys("developers.lwc@oktana.com");
        passwordField.sendKeys("dev.lwc2023");

        Thread.sleep(8000);

        botonAzul.click();

        driver.quit();
    }
}