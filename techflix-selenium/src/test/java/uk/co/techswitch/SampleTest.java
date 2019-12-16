package uk.co.techswitch;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleTest {

    @Test
    public void testGoogleHomepage() {
        WebDriver browser = new FirefoxDriver();
        browser.get("https://google.com");

        WebElement searchForm = browser.findElement(By.id("searchform"));

        assertThat(searchForm).isNotNull();

    }
    

    @Test
    public void testTechflixHomePage() {
        WebDriver browser = new FirefoxDriver();
        browser.get("http://localhost:3000");

        WebElement heroImage = browser.findElement(By.id("welcome-image"));
        WebElement heroTitle = browser.findElement(By.id("welcome-title"));

        assertThat(heroImage).isNotNull();
        assertThat(heroTitle).isNotNull();
    }
}
