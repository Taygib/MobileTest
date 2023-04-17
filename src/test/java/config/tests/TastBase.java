package config.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.drivers.BrowserstackMobileDriver;
import config.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TastBase {

    @BeforeAll
    static void beforeAll() {
        // Configuration.pageLoadStrategy = "eager";
        Configuration.browser = BrowserstackMobileDriver.class.getName();
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {

        //   String sessionId = Selenide.sessionId().toString();
//        Attach.screenshotAs("Last screenshot");
        //   Attach.pageSource();

        closeWebDriver();

        //   Attach.addVideo(sessionId);
    }
}
