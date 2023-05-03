package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {
    @Test
    void successfulSearchTest() {
        step("Открыть Wikipedia", () -> {
            $(accessibilityId("Search Wikipedia")).click();
        });
        step("Ввод в поисковую строку java", () -> {
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("java");
        });
        step("В результате поиска количество слов java больше 0", () -> {
            $$(id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
        });
    }

    @Test
    void searchNumberPi() {
        step("Открыть Wikipedia", () -> {
            $(accessibilityId("Search Wikipedia")).click();
        });
        step("Ввод в поисковую строку pi", () -> {
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("what is pi equal");
        });
        step("Проверка на наличии pi в результате поиска", () -> {
            $(id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(text("pi"));
        });
    }

    @Test
    void searchCO2() {
        step("Открыть Wikipedia", () -> {
            $(accessibilityId("Search Wikipedia")).click();
        });
        step("Ввод в поисковую строку Carbon dioxide", () -> {
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("CO2");
        });
        step("Проверка на наличии Carbon dioxide в результате поиска", () -> {
            $(id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(text("Carbon dioxide"));
        });
    }
}