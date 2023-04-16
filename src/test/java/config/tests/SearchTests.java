package config.tests;


import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchTests extends TastBase {
    @Test
    void successfulSearchTest() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("java");
        $("org.wikipedia.alpha:id/search_container").find(byText("java"));
        // .shouldHave(sizeGreaterThan(0));
    }

    @Test
    void searchNumberPi() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("what is pi equal");
        $("org.wikipedia.alpha:id/page_list_item_title").find(withText("3.14"));
    }
    @Test
    void searchCO2() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("CO2");
        $("org.wikipedia.alpha:id/page_list_item_title").find(byText("Carbon dioxide"));
    }
}