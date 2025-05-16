package com.onepagelove;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OnepagelovePage {

    private final String HOME_PAGE_URL = "https://onepagelove.com/";
    private final String JAMM_LINK = "//h2/a[@title=\"Jamm\"]";

    private WebDriver driver;

    public OnepagelovePage() {
        driver = Driver.getDriver();
    }

    public void open() {
        driver.get(HOME_PAGE_URL);
    }

    public String getJammLinkTextByScrollByAmount() {

        boolean isElementVisible = false;

        do {
            new Actions(driver)
                    .scrollByAmount(0, 5000)
                    .perform();
            try {
                isElementVisible = driver
                        .findElement(By.xpath(JAMM_LINK))
                        .isDisplayed();
            } catch (Exception e) {

            }
        } while(!isElementVisible);


        WebElement element = driver.findElement(By.xpath(JAMM_LINK));
        return element.getText();
    }

    public String getJammLinkTextByScrollByRepeatedAmount() {

        boolean isElementVisible = false;

        do {
            new Actions(driver)
                    .scrollByAmount(0, 1000)
                    .perform();
            try {
                isElementVisible = driver
                        .findElement(By.xpath(JAMM_LINK))
                        .isDisplayed();
            } catch (Exception e) {

            }
        } while(!isElementVisible);


        WebElement element = driver.findElement(By.xpath(JAMM_LINK));
        return element.getText();
    }

    public String getJammLinkTextByScrollByRepeatedSendKeysSpace() {

        boolean isElementVisible = false;

        do {
            new Actions(driver)
                    .sendKeys(Keys.SPACE)
                    .perform();
            try {
                isElementVisible = driver
                        .findElement(By.xpath(JAMM_LINK))
                        .isDisplayed();
            } catch (Exception e) {

            }
        } while(!isElementVisible);


        WebElement element = driver.findElement(By.xpath(JAMM_LINK));
        return element.getText();
    }

    public String getJammLinkTextByScrollByRepeatedSendKeysPageDown() {

        boolean isElementVisible = false;

        do {
            new Actions(driver)
                    .sendKeys(Keys.PAGE_DOWN)
                    .perform();
            try {
                isElementVisible = driver
                        .findElement(By.xpath(JAMM_LINK))
                        .isDisplayed();
            } catch (Exception e) {

            }
        } while(!isElementVisible);


        WebElement element = driver.findElement(By.xpath(JAMM_LINK));
        return element.getText();
    }

    public String getJammLinkTextByScrollByRepeatedSendKeysControlAndEnd() {

        boolean isElementVisible = false;

        do {
            new Actions(driver)
                    .keyDown(Keys.CONTROL)
                    .sendKeys(Keys.END)
                    .perform();
            try {
                isElementVisible = driver
                        .findElement(By.xpath(JAMM_LINK))
                        .isDisplayed();
            } catch (Exception e) {

            }
        } while(!isElementVisible);


        WebElement element = driver.findElement(By.xpath(JAMM_LINK));
        return element.getText();
    }
}
