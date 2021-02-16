package searchTests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchTests {

    private static final String BASE_URL = "http://google.com";

    @Test
    public void searchSelenideInGoogleTest() {
        open(BASE_URL);
        $(By.name("q")).val("Selenide").pressEnter();
        $(withText("selenide.org")).shouldBe(visible);
    }
    
    @Test
    public void searchSelenideInYandexTest() {
        open("https://yandex.ru/");
        $(By.name("text")).val("Selenide").pressEnter();
        $(By.linkText("Selenide: concise UI tests in Java")).shouldBe(Condition.appear);

    }
}
