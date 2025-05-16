package com.onepagelove;

import driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OnepageloveTest {

    private OnepagelovePage page;

    @BeforeEach
    public void openHomePage() {
        page = new OnepagelovePage();
        page.open();
    }

    @Test
    public void testJammLinkTextByScrollByAmount() {
        Assertions.assertEquals("Jamm", page.getJammLinkTextByScrollByAmount());
    }

    @Test
    public void testJammLinkTextByScrollByRepeatedAmount() {
        Assertions.assertEquals("Jamm", page.getJammLinkTextByScrollByRepeatedAmount());
    }

    @Test
    public void testJammLinkTextByScrollByRepeatedSendKeysSpace() {
        Assertions.assertEquals("Jamm", page.getJammLinkTextByScrollByRepeatedSendKeysSpace());
    }

    @Test
    public void testJammLinkTextByScrollByRepeatedSendKeysPageDown() {
        Assertions.assertEquals("Jamm", page.getJammLinkTextByScrollByRepeatedSendKeysPageDown());
    }

    @Test
    public void testJammLinkTextByScrollByRepeatedSendKeysControlAndEnd() {
        Assertions.assertEquals("Jamm", page.getJammLinkTextByScrollByRepeatedSendKeysControlAndEnd());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
